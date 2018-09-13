package com.example.tuananh.hotel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainHomeActivity extends AppCompatActivity {

    ImageView img_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        img_back = (ImageView)findViewById(R.id.imgvBack);
        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(MainHomeActivity.this,MainActivity.class);
                startActivity(back);
            }
        });
    }
}
