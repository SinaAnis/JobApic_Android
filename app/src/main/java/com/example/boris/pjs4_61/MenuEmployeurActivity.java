package com.example.boris.pjs4_61;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.boris.pjs4_61.R.id.buttonMur;

public class MenuEmployeurActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button butCreerAnnonce;
        Button butConsulterMesAnnonces;
        Button butProfil;
        Button butEmploye;
        Button butEmployeur;
        Button butMur;

        //EditText test;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_employeur);

        butMur = (Button) findViewById(R.id.buttonMurEmployeur);
        butEmploye = (Button) findViewById(R.id.buttonEmploye);
        butEmployeur = (Button) findViewById(R.id.buttonEmployeur);
        butCreerAnnonce = (Button) findViewById(R.id.buttonCreerAnnonces);
        butConsulterMesAnnonces = (Button) findViewById(R.id.buttonLesCandidatures);
        butProfil = (Button) findViewById(R.id.buttonProfil);

        //évènement bouton butEmploye
        butMur.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MenuEmployeurActivity.this, MurEmployeurActivity.class);
                startActivity(intent);
            }
        });

        //évènement bouton butEmploye
        butEmploye.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MenuEmployeurActivity.this, MenuEmployeActivity.class);
                startActivity(intent);
            }
        });

        //évènement bouton butEmployeur
        butEmployeur.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MenuEmployeurActivity.this, MenuEmployeurActivity.class);
                startActivity(intent);
            }
        });

        //évènement bouton butEmployeur
        butCreerAnnonce.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MenuEmployeurActivity.this, CreationAnnonceActivity.class);
                startActivity(intent);
            }
        });

        butConsulterMesAnnonces.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MenuEmployeurActivity.this, LesCandidatsActivity.class);
                startActivity(intent);
            }
        });

        butProfil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MenuEmployeurActivity.this, MonProfilActivity.class);
                startActivity(intent);
            }
        });

    }
}
