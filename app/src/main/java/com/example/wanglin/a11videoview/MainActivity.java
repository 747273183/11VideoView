package com.example.wanglin.a11videoview;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView vv;

    private MediaController mc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        vv= (VideoView) findViewById(R.id.vv);

        mc=new MediaController(MainActivity.this);


        method1();



    }

    private void method1() {
        vv.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.laoniu));

        vv.setMediaController(mc);
        mc.setMediaPlayer(vv);


    }
}
