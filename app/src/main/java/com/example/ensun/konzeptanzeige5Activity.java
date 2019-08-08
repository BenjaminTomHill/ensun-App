package com.example.ensun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class konzeptanzeige5Activity extends AppCompatActivity {

    public Button back5;
    public ImageView imageView6;
    public Button quickIdea;
    public Button businessplan;
    public Button prototyp;
    public RadioButton upload;
    public TextView frage1, frage2, frage3, frage4;
    public EditText antwort1, antwort2, antwort3, antwort4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.konzeptanzeige_main5);

        imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView6.setImageResource(R.drawable.logoensun);
        imageView6.setVisibility(View.VISIBLE);

        back5 = (Button) findViewById(R.id.back5);
        quickIdea = (Button) findViewById(R.id.quickIdea);
        businessplan = (Button) findViewById(R.id.businessplan);
        prototyp = (Button) findViewById(R.id.prototyp);
        upload = (RadioButton) findViewById(R.id.upload);

        frage1 = (TextView) findViewById(R.id.frage1);
        frage1.setVisibility(View.GONE);
        frage2 = (TextView) findViewById(R.id.frage2);
        frage2.setVisibility(View.GONE);
        frage3 = (TextView) findViewById(R.id.frage3);
        frage3.setVisibility(View.GONE);
        frage4 = (TextView) findViewById(R.id.frage4);
        frage4.setVisibility(View.GONE);

        antwort1 = (EditText) findViewById(R.id.antwort1);
        antwort1.setVisibility(View.GONE);
        antwort2 = (EditText) findViewById(R.id.antwort2);
        antwort2.setVisibility(View.GONE);
        antwort3 = (EditText) findViewById(R.id.antwort3);
        antwort3.setVisibility(View.GONE);
        antwort4 = (EditText) findViewById(R.id.antwort4);
        antwort4.setVisibility(View.GONE);


        quickIdea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frage1.setVisibility(View.VISIBLE);
                frage2.setVisibility(View.VISIBLE);
                frage2.setText(""); //wegen Upload Button!
                frage3.setVisibility(View.VISIBLE);
                frage4.setVisibility(View.VISIBLE);

                frage1.setText("Wie lautet Ihr Name und Nachname?");
                frage1.setTextSize(15);
                frage2.setText("Was genau ist deine Idee? (Stickpunkte/Fließtext)");
                frage2.setTextSize(15);
                frage3.setText("Was willst du mit dieser Idee bewirken?");
                frage3.setTextSize(15);
                frage4.setText("Wie bist du auf die Idee gekommen?");
                frage4.setTextSize(15);

                antwort1.setVisibility(View.VISIBLE);
                antwort2.setVisibility(View.VISIBLE);
                antwort3.setVisibility(View.VISIBLE);
                antwort4.setVisibility(View.VISIBLE);
            }
        });

        businessplan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                frage1.setVisibility(View.VISIBLE);
                frage2.setVisibility(View.VISIBLE);
                frage2.setText(""); //wegen Upload Button!
                frage3.setVisibility(View.VISIBLE);
                frage4.setVisibility(View.VISIBLE);

                frage1.setText("Wie lautet Ihr Name und Nachname?");
                frage1.setTextSize(15);
                frage2.setText("Was genau ist Ihr Vorhaben?");
                frage2.setTextSize(15);
                frage3.setText("Wie viel Kapital sehen Sie für diese Umsetzung vor?");
                frage3.setTextSize(15);
                frage4.setText("Wie sieht die Marktsituation aus?");
                frage4.setTextSize(15);

                antwort1.setVisibility(View.VISIBLE);
                antwort2.setVisibility(View.VISIBLE);
                antwort3.setVisibility(View.VISIBLE);
                antwort4.setVisibility(View.VISIBLE);
            }
        });

        prototyp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frage1.setVisibility(View.VISIBLE);
                frage2.setVisibility(View.VISIBLE);
                frage2.setText(""); //wegen Upload Button!
                frage3.setVisibility(View.VISIBLE);
                frage4.setVisibility(View.VISIBLE);

                frage1.setText("Wie lautet Ihr Name und Nachname?");
                frage1.setTextSize(15);
                frage2.setText("Was genau macht Ihr Produkt?");
                frage2.setTextSize(15);
                frage3.setText("Wofür benötigen sie Kapital?");
                frage3.setTextSize(15);
                frage4.setText("Wie viel Kapital sehen sie vor?");
                frage4.setTextSize(15);

                antwort1.setVisibility(View.VISIBLE);
                antwort2.setVisibility(View.VISIBLE);
                antwort3.setVisibility(View.VISIBLE);
                antwort4.setVisibility(View.VISIBLE);
            }
        });

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frage1.setText("");
                frage2.setText("                        Dein Upload war erfolgreich!");
                frage3.setText("");
                frage4.setText("");
            }
        });

        back5.setOnClickListener(new View.OnClickListener() {
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
