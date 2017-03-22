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

public class RegActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscription);
        Button quit = (Button) findViewById(R.id.buttonQuit);
        Intent intent = getIntent();
        EditText test;
      //  test = (EditText) findViewById(R.id.idName);
      //  test.setText(intent.getStringExtra("ident"));
        //Intent intent = getIntent();

        quit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.exit(1);
            }
        });
    }
}
