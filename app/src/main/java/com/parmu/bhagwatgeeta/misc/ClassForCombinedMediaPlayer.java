package com.parmu.bhagwatgeeta.misc;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.activities.Adhyay1_AC1;
import com.parmu.bhagwatgeeta.fragments.Fragment1;

import java.io.File;
import java.io.IOException;

public class ClassForCombinedMediaPlayer {
    private static Boolean isDownloaded = null;
    private static Boolean downInProgress = null;
    public static MediaPlayer mediaPlayerOb = new MediaPlayer();
    // method for media player
    public static void playDisSound(Context c, String audioN) throws IOException, InterruptedException {
        if (mediaPlayerOb == null) {
            mediaPlayerOb = new MediaPlayer();
        }
        mediaPlayingMethod(c, downloadFile(c,audioN));
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
        mediaPlayerOb.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                try{
                    mediaPlayerOb.reset();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        mediaPlayerOb.start();
    }

    public static Uri downloadFile(final Context context, String audioName) throws IOException, InterruptedException {
        final StorageReference isFileRef = firebaseStorageReferences(audioName);
        final File localFile = createMusicDirectoryNFile(context, audioName);

        if(!localFile.exists()){
            if (!isConnected()) {
                Toast.makeText(context, "No Internet Connection", Toast.LENGTH_SHORT).show();
            }
            isFileRef.getFile(localFile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                @SuppressLint("UseCompatLoadingForDrawables")
                @Override
                public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                    Log.i("firebase", "local audio temp file created");
                    isDownloaded = true;
                    downInProgress = false;
                }
            }).addOnFailureListener(new OnFailureListener() {
                @SuppressLint("ShowToast")
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(context, "on failure listener", Toast.LENGTH_SHORT).show();
                    isDownloaded = false;
                    downInProgress = false;

                }
            }).addOnProgressListener(new OnProgressListener<FileDownloadTask.TaskSnapshot>() {
                @Override
                public void onProgress(@NonNull FileDownloadTask.TaskSnapshot snapshot) {
                    Toast.makeText(context,"Downloading", Toast.LENGTH_SHORT).show();
                    downInProgress = true;
                    isDownloaded = null;
                }
            });
        }
        else {
            isDownloaded = true;
        }

        return Uri.parse(localFile.getAbsolutePath());
    }

    private static StorageReference firebaseStorageReferences(String audioName){
        FirebaseStorage storage = FirebaseStorage.getInstance();
        StorageReference storageReference = storage.getReferenceFromUrl("gs://bhagwatgeeta-d40a9.appspot.com/audiomp3files");
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

    public static Boolean isFileDownloaded(){
        return isDownloaded;
    }
    public static Boolean isDownInProgress(){
        return downInProgress;
    }

}
