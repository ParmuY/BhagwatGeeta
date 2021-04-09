package com.parmu.bhagwatgeeta.misc;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.parmu.bhagwatgeeta.fragments.Fragment1;

import java.io.File;
import java.io.IOException;

public class ClassForCombinedMediaPlayer {
    public static MediaPlayer mediaPlayerOb = new MediaPlayer();
    // method for media player
    public static void playDisSound(Context c, String audioN) throws IOException {
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

    private static Uri downloadFile(Context context, String audioName){
        FirebaseStorage storage = FirebaseStorage.getInstance();
        StorageReference storageReference = storage.getReferenceFromUrl("gs://bhagwatgeeta-d40a9.appspot.com/audiomp3files");
        StorageReference isFileRef = storageReference.child(audioName);

        String localAudioPath = context.getExternalFilesDir(Environment.DIRECTORY_MUSIC).getAbsolutePath();
        File audioDir = new File(localAudioPath);
        boolean audioFileCreated = audioDir.mkdirs();
        if (!audioFileCreated) {
            Log.i("audio dir unsuccess", "audio dir unsuccessful");
        }
        File localFile = new File(localAudioPath,audioName);
        if (!localFile.exists()) {
            isFileRef.getFile(localFile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                    Log.e("firebase","local audio temp file created" );
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.e("firebase","local audio file not created"+ e.toString());
                }
            }).addOnProgressListener(new OnProgressListener<FileDownloadTask.TaskSnapshot>() {
                @Override
                public void onProgress(@NonNull FileDownloadTask.TaskSnapshot snapshot) {
                }
            });
        }
        return Uri.parse(localFile.getAbsolutePath());
    }
}
