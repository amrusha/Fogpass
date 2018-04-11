package com.example.abhinav.work;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DriverLoginActivity extends AppCompatActivity {
    private Button msignup;
    private Button mregistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_login);
        msignup= (Button) findViewById(R.id.Login);
        msignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DriverLoginActivity.this,
                        DriverMapsActivity.class);
                startActivity(intent);

            }
        });
        mregistration= (Button) findViewById(R.id.Registration);
        mregistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DriverLoginActivity.this,
                        DriverMapsActivity.class);
                startActivity(intent);

            }
        });

    }
}
