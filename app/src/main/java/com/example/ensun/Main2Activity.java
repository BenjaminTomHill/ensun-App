package com.example.ensun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView; 
import android.widget.RadioButton;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public Button problem;
    public Button team;
    public Button konzept;
    public Button news;
    public Button back;
    public RadioButton mehr1, mehr2, mehr3, mehr4;
    public RadioButton weiterlesen1, weiterlesen2, weiterlesen3, weiterlesen4;
    public ImageView imageView4;
    public TextView frage1, frage2, frage3, frage4, frage5;
    public EditText businessFragen, antwort1, antwort2, antwort3, antwort4, antwort5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /*imageView2 = (ImageView) findViewById(R.id.imageView);
        imageView2.setImageResource(R.drawable.logoensun);*/

        businessFragen = (EditText) findViewById(R.id.businessFragen);
        businessFragen.setVisibility(View.GONE);

        problem = (Button) findViewById(R.id.problem);
        team = (Button) findViewById(R.id.team);
        konzept = (Button) findViewById(R.id.konzept);
        news = (Button) findViewById(R.id.news);
        back = (Button) findViewById(R.id.back);

        mehr1 = (RadioButton) findViewById(R.id.mehr1);
        mehr1.setVisibility(View.GONE);
        mehr2 = (RadioButton) findViewById(R.id.mehr2);
        mehr2.setVisibility(View.GONE);
        mehr3 = (RadioButton) findViewById(R.id.mehr3);
        mehr3.setVisibility(View.GONE );
        mehr4 = (RadioButton) findViewById(R.id.mehr4);
        mehr4.setVisibility(View.GONE);

        weiterlesen1 = (RadioButton) findViewById(R.id.weiterlesen1);
        weiterlesen1.setVisibility(View.GONE);
        weiterlesen2 = (RadioButton) findViewById(R.id.weiterlesen2);
        weiterlesen2.setVisibility(View.GONE);
        weiterlesen3 = (RadioButton) findViewById(R.id.weiterlesen3);
        weiterlesen3.setVisibility(View.GONE );
        weiterlesen4 = (RadioButton) findViewById(R.id.weiterlesen4);
        weiterlesen4.setVisibility(View.GONE);


        frage1 = (TextView) findViewById(R.id.frage1);
        frage1.setVisibility(View.GONE);
        frage2 = (TextView) findViewById(R.id.frage2);
        frage2.setVisibility(View.GONE);
        frage3 = (TextView) findViewById(R.id.frage3);
        frage3.setVisibility(View.GONE);
        frage4 = (TextView) findViewById(R.id.frage4);
        frage4.setVisibility(View.GONE);
        frage5 = (TextView) findViewById(R.id.frage5);
        frage5.setVisibility(View.GONE);

        antwort1 = (EditText) findViewById(R.id.antwort1);
        antwort1.setVisibility(View.GONE);
        antwort2 = (EditText) findViewById(R.id.antwort2);
        antwort2.setVisibility(View.GONE);
        antwort3 = (EditText) findViewById(R.id.antwort3);
        antwort3.setVisibility(View.GONE);
        antwort4 = (EditText) findViewById(R.id.antwort4);
        antwort4.setVisibility(View.GONE);
        antwort5 = (EditText) findViewById(R.id.antwort5);
        antwort5.setVisibility(View.GONE);



        problem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                businessFragen.setText("");
                businessFragen.setVisibility(View.GONE);

                weiterlesen1.setVisibility(View.GONE);
                weiterlesen2.setVisibility(View.GONE);
                weiterlesen3.setVisibility(View.GONE);
                weiterlesen4.setVisibility(View.GONE);

                frage1.setVisibility(View.VISIBLE);
                frage2.setVisibility(View.VISIBLE);
                frage3.setVisibility(View.VISIBLE);
                frage4.setVisibility(View.VISIBLE);
                frage5.setVisibility(View.VISIBLE);

                antwort1.setVisibility(View.VISIBLE);
                antwort2.setVisibility(View.VISIBLE);
                antwort3.setVisibility(View.VISIBLE);
                antwort4.setVisibility(View.VISIBLE);
                antwort5.setVisibility(View.VISIBLE);

                frage1.setText("Software");
                frage1.setTextSize(18);
                antwort1.setText("Problem in Bug-Findung bei Managingsoftware!");
                antwort1.setTextSize(13);
                antwort1.setEnabled(false);
                mehr1.setVisibility(View.VISIBLE);

                frage2.setText("Ingeneurwesen");
                frage2.setTextSize(18);
                antwort2.setText("Effizienz Steigerung durch Optimierung der MAschinengröße.");
                antwort2.setTextSize(13);
                antwort2.setEnabled(false);
                mehr2.setVisibility(View.VISIBLE);

                frage3.setText("App-Development");
                frage3.setTextSize(18);
                antwort3.setText("Dauerhaft fehlerhafte Updates, durch falsches System!");
                antwort3.setTextSize(13);
                antwort3.setEnabled(false);
                mehr3.setVisibility(View.VISIBLE);

                frage4.setText("Software");
                frage4.setTextSize(18);
                antwort4.setText("Integration der Software zu fehleranfällig.");
                antwort4.setTextSize(13);
                antwort4.setEnabled(false);
                mehr4.setVisibility(View.VISIBLE);


                mehr1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openanzeige5Activity1();
                    }
                });

                mehr2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openanzeige5Activity2();
                    }
                });

                mehr3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openanzeige5Activity3();
                    }
                });

                mehr4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openanzeige5Activity4();
                    }
                });
            }
        });

        team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                businessFragen.setText("");
                businessFragen.setVisibility(View.GONE);

                weiterlesen1.setVisibility(View.GONE);
                weiterlesen2.setVisibility(View.GONE);
                weiterlesen3.setVisibility(View.GONE);
                weiterlesen4.setVisibility(View.GONE);

                frage1.setVisibility(View.VISIBLE);
                frage2.setVisibility(View.VISIBLE);
                frage3.setVisibility(View.VISIBLE);
                frage4.setVisibility(View.VISIBLE);
                frage5.setVisibility(View.VISIBLE);

                antwort1.setVisibility(View.VISIBLE);
                antwort2.setVisibility(View.VISIBLE);
                antwort3.setVisibility(View.VISIBLE);
                antwort4.setVisibility(View.VISIBLE);
                antwort5.setVisibility(View.VISIBLE);

                frage1.setText("ensun GmbH - App Development");
                frage1.setTextSize(18);
                antwort1.setText("Erfahrener App-developer für Android % iOS. 10% Beteiligung!");
                antwort1.setTextSize(13);
                antwort1.setEnabled(false);
                mehr1.setVisibility(View.VISIBLE);

                frage2.setText("Firma XY - Marketing");
                frage2.setTextSize(18);
                antwort2.setText("Erfahrener BWL'er mit Berufserfahrung. 15% Beteiligung!");
                antwort2.setTextSize(13);
                antwort2.setEnabled(false);
                mehr2.setVisibility(View.VISIBLE);

                frage3.setText("Firma XY - Gastronomie");
                frage3.setTextSize(18);
                antwort3.setText("Koch mit Erfahrung in guten Restaurants. 20% Beteiligung!");
                antwort3.setTextSize(13);
                antwort3.setEnabled(false);
                mehr3.setVisibility(View.VISIBLE);

                frage4.setText("Firma XY - Physik");
                frage4.setTextSize(18);
                antwort4.setText("Mathematiker für Simulationsberechnungen. 5% Beteiligung!");
                antwort4.setTextSize(13);
                antwort4.setEnabled(false);
                mehr4.setVisibility(View.VISIBLE);
            }
        });

        konzept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openteamAnzeige5Activity();

            }
        });

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                businessFragen.setText("");
                businessFragen.setVisibility(View.GONE);

                mehr1.setVisibility(View.GONE);
                mehr2.setVisibility(View.GONE);
                mehr3.setVisibility(View.GONE);
                mehr4.setVisibility(View.GONE);

                frage1.setVisibility(View.VISIBLE);
                frage2.setVisibility(View.VISIBLE);
                frage3.setVisibility(View.VISIBLE);
                frage4.setVisibility(View.VISIBLE);
                frage5.setVisibility(View.VISIBLE);

                antwort1.setVisibility(View.VISIBLE);
                antwort2.setVisibility(View.VISIBLE);
                antwort3.setVisibility(View.VISIBLE);
                antwort4.setVisibility(View.VISIBLE);
                antwort5.setVisibility(View.VISIBLE);

                weiterlesen1.setVisibility(View.VISIBLE);
                weiterlesen2.setVisibility(View.VISIBLE);
                weiterlesen3.setVisibility(View.VISIBLE);
                weiterlesen4.setVisibility(View.VISIBLE);

                frage1.setText("Deutsches Start-Up revolotioniert den Gründungprozess");
                frage1.setTextSize(15);
                antwort1.setText("- Wirtschaftswoche -");
                antwort1.setTextSize(13);
                antwort1.setEnabled(false);

                frage2.setText("Tel Aviv überholt Silicon Valley");
                frage2.setTextSize(15);
                antwort2.setText("- Managermagazin -");
                antwort2.setTextSize(13);
                antwort2.setEnabled(false);

                frage3.setText("Wie konurrenzfähig ist Berlin am Gründungsmarkt");
                frage3.setTextSize(15);
                antwort3.setText("- BILD -");
                antwort3.setTextSize(13);
                antwort3.setEnabled(false);

                frage4.setText("Siegener Start-Up will Gründungen vereinfachen & beschleunigen");
                frage4.setTextSize(15);
                antwort4.setText("- Siegerland Kurier -");
                antwort4.setTextSize(13);
                antwort4.setEnabled(false);

                weiterlesen1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        opennews5Activity();
                    }
                });

                weiterlesen2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        opennews5Activity();
                    }
                });

                weiterlesen3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        opennews5Activity();
                    }
                });

                weiterlesen4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        opennews5Activity();
                    }
                });

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
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

    public void openanzeige5Activity1() {
        Intent intent = new Intent(this, team_problemanzeige5Activity.class);
        String test = "das soll ein test sein";
        intent.putExtra("problem", test);
        startActivity(intent);
    }

    public void openanzeige5Activity2() {
        Intent intent = new Intent(this, team_problemanzeige5Activity.class);
        String problem2 = "Das soll ein weiterer Test sein!";
        intent.putExtra("Problem: ", problem2);
        startActivity(intent);
    }

    public void openanzeige5Activity3() {
        Intent intent = new Intent(this, team_problemanzeige5Activity.class);
        String problem2 = "Das soll ein weiterer Test sein!";
        intent.putExtra("Problem: ", problem2);
        startActivity(intent);
    }

    public void openanzeige5Activity4() {
        Intent intent = new Intent(this, team_problemanzeige5Activity.class);
        String problem2 = "Das soll ein weiterer Test sein!";
        intent.putExtra("Problem: ", problem2);
        startActivity(intent);
    }

    public void openteamAnzeige5Activity() {
        Intent intent = new Intent(this, konzeptanzeige5Activity.class);
        startActivity(intent);
    }


    public void opennews5Activity() {
        Intent intent = new Intent(this, news5Activity.class);
        startActivity(intent);
    }
}
