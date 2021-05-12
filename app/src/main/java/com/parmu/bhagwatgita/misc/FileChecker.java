package com.parmu.bhagwatgita.misc;

import android.content.Context;
import android.os.Environment;

import java.io.File;

public class FileChecker {

    public static boolean checkFileForExistence(Context context, String fileName) {
        String localAudioPath = context.getExternalFilesDir(Environment.DIRECTORY_MUSIC).getAbsolutePath();
        File file = new File(localAudioPath, fileName);
        return file.exists();
    }
}
