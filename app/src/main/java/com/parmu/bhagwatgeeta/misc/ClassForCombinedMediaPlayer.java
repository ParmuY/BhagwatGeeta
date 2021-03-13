package com.parmu.bhagwatgeeta.misc;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;

import java.io.IOException;

public class ClassForCombinedMediaPlayer {
    public static MediaPlayer mediaPlayer = new MediaPlayer();
    // method for media player
    public static void playDisSound(Context c, int soundID) throws IOException {

        if(mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            mediaPlayer.seekTo(0);
        }
        else {
            mediaPlayer.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
            mediaPlayer.prepare();
        }
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                try{
                    mediaPlayer.reset();
                    Log.e("media reset", "mediaplayer oncompletion listener");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        mediaPlayer.start();
    }
}
