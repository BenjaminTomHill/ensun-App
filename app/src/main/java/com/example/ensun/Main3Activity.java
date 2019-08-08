package com.example.ensun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    public RadioButton gruender;
    public RadioButton investor;
    public RadioButton entertaiment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        gruender = (RadioButton) findViewById(R.id.gruender);
        investor = (RadioButton) findViewById(R.id.investor);
        entertaiment = (RadioButton) findViewById(R.id.entertaiment);

        gruender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openMain2Activity();

            }
        });

        investor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openMain4Activity();

            }
        });

        entertaiment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });
    }

    public void openMain2Activity() {
        Intent intent = new Intent (this, Main2Activity.class);
        startActivity(intent);
    }

    public void openMain4Activity() {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }
}
