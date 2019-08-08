package com.example.ensun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class team_problemanzeige5Activity extends AppCompatActivity {

    public Button back3;
    public TextView probDetail;
    public ImageView imageView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_problemanzeige_main5);

        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setImageResource(R.drawable.logoensun);
        imageView5.setVisibility(View.VISIBLE);

        back3 = (Button) findViewById(R.id.back3);
        probDetail = (TextView) findViewById(R.id.probDetail);

        Intent intent = getIntent();
        Bundle a = intent.getExtras();

        if(a != null) {
            String j = (String) a.get("test");
            probDetail.setText(j);
            probDetail.setTextSize(25);
        }

        /*probDetail.setText("Das hier ist ein Test für die Größe" + "\n"
                + "Das hier ist ein Test für die Größe" + "\n"
                + "Das hier ist ein Test für die Größe" + "\n"
                + "Das hier ist ein Test für die Größe" + "\n"
                + "Das hier ist ein Test für die Größe" + "\n"
                + "Das hier ist ein Test für die Größe" + "\n"
                + "Das hier ist ein Test für die Größe" + "\n"
                + "Das hier ist ein Test für die Größe" + "\n"
                + "Das hier ist ein Test für die Größe" + "\n");*/


        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openMain2Activity();

            }
        });
    }

    public void openMain2Activity() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
