package com.parmu.bhagwatgeeta.misc;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;

public class FileDownloadFirebase {

    public static void downloadFile(Context context){
        FirebaseStorage storage = FirebaseStorage.getInstance();
        StorageReference storageReference = storage.getReferenceFromUrl("gs://bhagwatgeeta-d40a9.appspot.com");
        StorageReference isFileRef = storageReference.child("c1s1.mp3");

        String localAudioPath = context.getExternalFilesDir(Environment.DIRECTORY_MUSIC).getAbsolutePath();
        File audioDir = new File(localAudioPath);
        boolean audioFileCreated = audioDir.mkdirs();
        if (!audioFileCreated) {
            Log.i("audio dir unsuccess", "audio dir unsuccessful");
        }
        File localFile = new File(localAudioPath,"c1s1.mp3");
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
        });

    }
}
