package com.sudoajay.mymodule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private DrawLoadingAnimation customCanvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customCanvas =  findViewById(R.id.signature_canvas);

//
//        CircleAngleAnimation animation = new CircleAngleAnimation(customCanvas, 240);
//        animation.setDuration(1000);
//        customCanvas.startAnimation(animation);
    }

    public void clearCanvas(View v) {
//        customCanvas.clearCanvas();
    }
}
