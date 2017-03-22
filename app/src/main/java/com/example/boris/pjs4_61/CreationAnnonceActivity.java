package com.example.boris.pjs4_61;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

/**
 * Created by Hugo on 06/03/2017.
 */

public class CreationAnnonceActivity extends AppCompatActivity {

    @Override
    protected void onResume(){
        super.onResume();
        try{

        } catch(Exception e){

        }
    }

    protected void onCreate (Bundle savedInstanceState){


        Button butVal;
        CheckBox checkBoxTerme;

        Intent intent = getIntent();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_creation_annonce);

        butVal = (Button) findViewById(R.id.buttonValiderAnnonce);
        checkBoxTerme = (CheckBox) findViewById(R.id.checkBoxTerme);

        //évènement bouton butEmployeur
        butVal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(CreationAnnonceActivity.this, MurEmployeurActivity.class);
                startActivity(intent);
            }
        });

    }
}
