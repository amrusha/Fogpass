package com.example.abhinav.work;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Intro extends AppCompatActivity {
    private TextView tv;
    private ImageView iv;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        tv = (TextView) findViewById(R.id.tv);
        iv = (ImageView) findViewById(R.id.iv);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.transition1);
        tv.startAnimation(myanim);
        iv.startAnimation(myanim);
        setContentView(R.layout.activity_intro);// activity_main is corresponding XML file
        button = (Button) findViewById(R.id.go);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intro.this,
                        ChoiceActivity.class);
                startActivity(intent); // startActivity allow you to move
            }
        });
    }
}
