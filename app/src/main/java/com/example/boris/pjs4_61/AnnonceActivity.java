package com.example.boris.pjs4_61;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by Hugo on 06/03/2017.
 */

public class AnnonceActivity extends AppCompatActivity {

    @Override
    protected void onResume(){
        super.onResume();
        try{
            Intent intent = getIntent();
        } catch(Exception e){

        }
    }

    protected void onCreate (Bundle savedInstanceState){

        Button butPostuler;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annonce);

        butPostuler =  (Button) findViewById(R.id.buttonPostuler);

    }
}
