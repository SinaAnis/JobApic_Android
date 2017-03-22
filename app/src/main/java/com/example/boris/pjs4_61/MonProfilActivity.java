package com.example.boris.pjs4_61;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Hugo on 06/03/2017.
 */

public class MonProfilActivity extends AppCompatActivity {


    protected void onCreate (Bundle savedInstanceState){

        Button butModifPhoto;
        Button butSendMsg;
       // Button butModifProfil;

        Intent intent = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modif_profil);

        butModifPhoto = (Button) findViewById(R.id.buttonValiderAnn);
        butSendMsg = (Button) findViewById(R.id.buttonSendMsg);
       // butModifProfil = (Button)findViewById(R.id.buttonModifierProfil);

        /*
        butModifProfil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MonProfilActivity.this, ModifProfilActivity.class);
                startActivity(intent);
            }

        }); */
    }
}
