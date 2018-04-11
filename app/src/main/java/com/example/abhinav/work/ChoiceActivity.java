package com.example.abhinav.work;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ChoiceActivity extends AppCompatActivity {
    ImageButton imagebtn1;
    ImageButton imagebtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        addListenerOnButton();}


    public void addListenerOnButton() {
        imagebtn1 = (ImageButton) findViewById(R.id.driver);
        imagebtn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent
                        (getApplicationContext(), DriverLoginActivity.class);
                startActivity(intent);
            }
        });
            imagebtn1 = (ImageButton) findViewById(R.id.passenger);
        imagebtn1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    Intent intent = new Intent
                            (getApplicationContext(), PassengerLoginActivity.class);
                    startActivity(intent);
                }
        });
    }
}
