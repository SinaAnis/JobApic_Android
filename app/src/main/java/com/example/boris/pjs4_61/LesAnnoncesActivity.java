package com.example.boris.pjs4_61;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Hugo on 06/03/2017.
 */

public class LesAnnoncesActivity  extends AppCompatActivity {

    Button butVoirPlus;



    @Override
    protected void onResume(){
        super.onResume();
        try{
            Intent intent = getIntent();
        } catch(Exception e){

        }
    }

    protected void onCreate (Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_les_annonces);

        butVoirPlus = (Button) findViewById(R.id.button);

        butVoirPlus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LesAnnoncesActivity.this, AnnonceActivity.class);
                //final EditText test = (EditText) findViewById(R.id.editText2);
                //intent.putExtra("ident", test.getText().toString());
                startActivity(intent);
            }
        });

    }
}
