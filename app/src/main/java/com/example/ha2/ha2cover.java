package com.example.ha2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ha2cover extends AppCompatActivity implements View.OnClickListener {
    Button goto1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ha2cover);
        goto1=(Button)findViewById(R.id.goto1);
        goto1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==goto1){
            finish();
            startActivity(new Intent(this,MainActivity.class));
        }
    }
}
