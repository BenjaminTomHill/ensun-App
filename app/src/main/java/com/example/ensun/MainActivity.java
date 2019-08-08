package com.example.ensun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button login;
    public TextView fragen;
    private EditText benutzer;
    private EditText passwort;
    public ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.logoensun);

        login= (Button) findViewById(R.id.login);
        fragen = (TextView) findViewById(R.id.fragen);
        benutzer = (EditText) findViewById(R.id.benutzer);
        passwort = (EditText) findViewById(R.id.passwort);

        login.setVisibility(View.VISIBLE);
        benutzer.setVisibility(View.VISIBLE);
        passwort.setVisibility(View.VISIBLE);

        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

               openMain3Activity();

            }
        });
    }

    public void openMain3Activity() {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
}

