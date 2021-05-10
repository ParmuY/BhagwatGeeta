package com.parmu.bhagwatgeeta.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.parmu.bhagwatgeeta.R;

public class AboutAppActivity extends AppCompatActivity {
    TextView youtubeLink;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("About App");
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        TextView textView = findViewById(R.id.aboutTextView);
        textView.setText(R.string.content_about);
        String str = String.valueOf(textView.getText());
        textView.setText(str+"\n\nVersion 1.0"+"\n\nCredits:");
        youtubeLink= findViewById(R.id.youtube_link);
        youtubeLink.setMovementMethod(LinkMovementMethod.getInstance());
        youtubeLink.setLinkTextColor(Color.GRAY);



    }
}