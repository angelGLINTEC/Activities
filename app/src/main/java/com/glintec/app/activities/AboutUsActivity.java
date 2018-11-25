package com.glintec.app.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutUsActivity extends AppCompatActivity {

    private Button btnRegreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        btnRegreso = findViewById(R.id.btnRETURN);

        View.OnClickListener clAbout = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                finish();
            }
        };
        btnRegreso.setOnClickListener(clAbout);
    }

}
