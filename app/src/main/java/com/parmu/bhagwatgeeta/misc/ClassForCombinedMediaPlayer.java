package com.parmu.bhagwatgeeta.misc;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import java.io.IOException;

public class ClassForCombinedMediaPlayer {
    public static MediaPlayer mediaPlayerOb = new MediaPlayer();
    // method for media player
    public static void playDisSound(Context c, int soundID) throws IOException {
        if (mediaPlayerOb == null) {
            mediaPlayerOb = new MediaPlayer();
        }
        mediaPlayingMethod(c, soundID);
    }

    private static void mediaPlayingMethod(Context c, int soundID) throws IOException {
        if(mediaPlayerOb.isPlaying()) {
            mediaPlayerOb.pause();
            mediaPlayerOb.seekTo(0);
        }
        else {
            mediaPlayerOb.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
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
}
