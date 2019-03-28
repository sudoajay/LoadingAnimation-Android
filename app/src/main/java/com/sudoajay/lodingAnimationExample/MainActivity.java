package com.sudoajay.lodingAnimationExample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        loadingAnimation.setColor(Color.BLACK);

         final ColorList colorList = new ColorList();

        Button btnChangeColor= findViewById(R.id.btnChangeColor);
        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadingAnimation.setColor(colorList.getNextColor());
            }
        });
    }
}
