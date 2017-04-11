package com.test.hp.videoplayer1;

import android.graphics.RadialGradient;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import static com.test.hp.videoplayer1.R.raw.video;

public class MainActivity extends AppCompatActivity {

    Button clickBtn;
    VideoView  videoView;
    MediaController mediaC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickBtn = (Button) findViewById(R.id.button);
        videoView = (VideoView) findViewById(R.id.videoView);
        mediaC = new MediaController(this);
        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoPlay(v);
            }
        });


    }

    public void videoPlay(View v){
        String videopath = "android.resource://com.test.hp.videoplayer1/"+ video;
        Uri uri = Uri.parse(videopath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaC);
        mediaC.setAnchorView(videoView);
        videoView.start();

    }
}
