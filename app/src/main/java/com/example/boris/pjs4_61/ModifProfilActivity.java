package com.example.boris.pjs4_61;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Hugo on 06/03/2017.
 */

public class ModifProfilActivity extends AppCompatActivity {

    @Override
    protected void onResume(){
        super.onResume();
        try{
            Intent intent = getIntent();
        } catch(Exception e){

        }
    }

    protected void onCreate (Bundle savedInstanceState){

        Button butModifPhoto;
        Button butEnregistrer;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modif_profil);

        butModifPhoto = (Button) findViewById(R.id.buttonModifPhoto);
        butEnregistrer = (Button) findViewById(R.id.buttonEnregistrer);

        butEnregistrer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ModifProfilActivity.this, MonProfilActivity.class);
                startActivity(intent);
            }
        });

    }
}
