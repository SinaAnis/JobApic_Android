package com.example.boris.pjs4_61;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuEmployeActivity extends AppCompatActivity {
    Button butEmploye;
    Button butEmployeur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_employe);

        butEmploye = (Button) findViewById(R.id.buttonEmploye);
        butEmployeur = (Button) findViewById(R.id.buttonEmployeur);


        //évènement bouton butEmploye
        butEmploye.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MenuEmployeActivity.this, MenuEmployeActivity.class);
                startActivity(intent);
            }
        });

        //évènement bouton butEmployeur
        butEmployeur.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MenuEmployeActivity.this, MenuEmployeurActivity.class);
                startActivity(intent);
            }
        });

    }


}
