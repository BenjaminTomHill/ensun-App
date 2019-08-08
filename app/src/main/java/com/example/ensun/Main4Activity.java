package com.example.ensun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class Main4Activity extends AppCompatActivity {

    public Button invest;
    public Button tac;
    public Button back2;
    public Button zertifikat;
    public Button zertifikatUpload;
    public EditText investorFragen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        invest = (Button) findViewById(R.id.invest);
        tac = (Button) findViewById(R.id.tac);
        back2 = (Button) findViewById(R.id.back2);
        zertifikat = (Button) findViewById(R.id.zertifikat);
        zertifikatUpload = (Button) findViewById(R.id.zertifikatUpload);
        investorFragen = (EditText) findViewById(R.id.investorFragen);

        zertifikatUpload.setVisibility(View.GONE);

        invest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zertifikatUpload.setVisibility(View.GONE);

                investorFragen.setText("Das soll nur ein Test sein!");
                investorFragen.setEnabled(false);

            }
        });

        tac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zertifikatUpload.setVisibility(View.GONE);

                investorFragen.setText("Das soll ebenfalls nur ein Test sein!");

            }
        });

        zertifikat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zertifikatUpload.setVisibility(View.VISIBLE);

                investorFragen.setText("Bitte laden Sie ein Zertifikat hoch!");
                investorFragen.setEnabled(false);

            }
        });

        zertifikatUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                investorFragen.setText("Der Upload war erfolgreich!");
                investorFragen.setEnabled(false);

            }
        });

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
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
