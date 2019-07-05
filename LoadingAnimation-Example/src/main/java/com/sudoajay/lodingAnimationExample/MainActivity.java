package com.sudoajay.lodingAnimationExample;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sudoajay.lodinganimation.LoadingAnimation;
import com.sudoajay.mymodule.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final LoadingAnimation loadingAnimation = findViewById(R.id.loadingAnimation);
        loadingAnimation.start();
//        loadingAnimation.setTiming(500);
        // Optional

        // More properties that's helps you to modify
        // loadingAnimation.setColor(Color.BLACK); // default Black
        // loadingAnimation.setAlpha(700); // default 700
        // loadingAnimation.setReduceAlpha(18); // default 18
        // loadingAnimation.setAnglePoint(0); // default 0
        // loadingAnimation.setMainRadius(80);  // default 80
        // loadingAnimation.setOtherRadius(20); // default 20
        // loadingAnimation.setReduceOtherRadius(1); // default 1


        final ColorList colorList = new ColorList();

        Button btnChangeColor = findViewById(R.id.btnChangeColor);
        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingAnimation.setColor(colorList.getNextColor());
            }
        });
    }
}
