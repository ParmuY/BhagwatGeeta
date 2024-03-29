package com.parmu.bhagvadgita.misc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnPausedListener;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.parmu.bhagvadgita.R;
import java.io.File;
import java.io.IOException;


public class ClassForCombinedMediaPlayer {

    public static AnimationDrawable arrowAnimate;
    public static MediaPlayer mediaPlayerOb= null;
    public static FileDownloadTask fileDownloadTask=null;
    // method for media player
    public static void playDisSound(Context c, String audioN, FloatingActionButton fab) throws IOException, InterruptedException {
        if (mediaPlayerOb == null) {
            mediaPlayerOb = new MediaPlayer();
        }
        mediaPlayingMethod(c, downloadFile(c,audioN,fab));
    }

    private static void mediaPlayingMethod(Context c, Uri uri) throws IOException {
        if(mediaPlayerOb.isPlaying()) {
            mediaPlayerOb.pause();
            mediaPlayerOb.seekTo(0);
        }
        else {
            mediaPlayerOb.setDataSource(c, uri);
            mediaPlayerOb.prepare();
        }
        mediaPlayerOb.setOnCompletionListener(mp -> {
            try{
                mediaPlayerOb.reset();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        mediaPlayerOb.start();
    }

    public static Uri downloadFile(final Context context, String audioName, final FloatingActionButton fab) throws IOException, InterruptedException {
         StorageReference isFileRef = firebaseStorageReferences(audioName);
         File localFile = createMusicDirectoryNFile(context, audioName);

        if(!localFile.exists()){
            if (!isConnected()) {
                Toast.makeText(context, "No Internet Connection", Toast.LENGTH_SHORT).show();
            }
            fileDownloadTask = isFileRef.getFile(localFile);
            fileDownloadTask.addOnSuccessListener(taskSnapshot -> {
                Log.i("firebase", "local audio temp file created");
                fab.setImageResource(R.drawable.ic_baseline_volume_up_24);

            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    fab.setImageResource(R.drawable.ic_baseline_arrow_downward_24);
                }
            }).addOnProgressListener(snapshot -> {
                try {
                    if(isConnected()){
                        fab.setImageResource(R.drawable.ic_animate_downarrow);
                        arrowAnimate = (AnimationDrawable) fab.getDrawable();
                        arrowAnimate.start();
                        Toast.makeText(context,"Downloading", Toast.LENGTH_SHORT).show();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }).addOnPausedListener(snapshot -> Log.e("onPauselistner ","getFile paused"));
        }
        return Uri.parse(localFile.getAbsolutePath());
    }

    private static StorageReference firebaseStorageReferences(String audioName){
        FirebaseStorage storage = FirebaseStorage.getInstance();
        StorageReference storageReference = storage.getReferenceFromUrl("gs://bhagvadgita-26c63.appspot.com/audiomp3files/");
        return storageReference.child(audioName);
    }

    public static File createMusicDirectoryNFile(Context context, String audioName) {
        String localAudioPath = context.getExternalFilesDir(Environment.DIRECTORY_MUSIC).getAbsolutePath();
        File audioDir = new File(localAudioPath);
        boolean audioFileCreated = audioDir.mkdirs();
        if (!audioFileCreated) {
            Log.i("audio dir unsuccess", "audio dir unsuccessful");
        }
        return new File(localAudioPath, audioName);
    }

    private static boolean isConnected() throws IOException, InterruptedException {
        String command = "ping -c 1 google.com";
        return Runtime.getRuntime().exec(command).waitFor() == 0;
    }
}
