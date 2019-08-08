package com.example.ensun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class news5Activity extends AppCompatActivity {

    public Button back6;
    public ImageView imageView7;
    public TextView nachrichten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news5);

        imageView7 = (ImageView) findViewById(R.id.imageView6);
        /*imageView7.setImageResource(R.drawable.logoensun);
        imageView7.setVisibility(View.VISIBLE);*/

        back6 = (Button) findViewById(R.id.back6);
        nachrichten = (TextView) findViewById(R.id.nachrichten);

        nachrichten.setText("Das soll nur ein TEEEEEST sein!");
        nachrichten.setTextSize(20);

        back6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain2Activity();
            }
        });
    }

    public void openMain2Activity() {
        Intent intent = new Intent (this, Main2Activity.class);
        startActivity(intent);
    }
}
