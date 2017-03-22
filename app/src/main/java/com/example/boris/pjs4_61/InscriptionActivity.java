package com.example.boris.pjs4_61;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Boris on 20/02/2017.
 */

public class InscriptionActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        Button quit = (Button) findViewById(R.id.buttonQuit);
        Button butValider;

        butValider = (Button) findViewById(R.id.buttonValider);

        Intent intent = getIntent();

        EditText test;
       // test = (EditText) findViewById(R.id.idName);
        test = (EditText) findViewById(R.id.editText14);
        test.setText(intent.getStringExtra("ident"));
        //Intent intent = getIntent();

        quit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.exit(1);
            }
        });

        butValider.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(InscriptionActivity.this, ContratActivity.class);
                startActivity(intent);
            }
        });
    }
}
