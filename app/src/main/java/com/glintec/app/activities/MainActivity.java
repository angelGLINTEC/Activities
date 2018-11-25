package com.glintec.app.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAcerca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAcerca = findViewById(R.id.btn_ACERCADE);

        View.OnClickListener cl = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                aboutUsActivity();
            }
        };

        btnAcerca.setOnClickListener(cl);
    }


    public void aboutUsActivity(){
        Intent i = new Intent(MainActivity.this, AboutUsActivity.class);
        startActivity(i);
    }

}
