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

public class ContratActivity extends AppCompatActivity {

    @Override
    protected void onResume(){
        super.onResume();
        try{
            Intent intent = getIntent();
        } catch(Exception e){

        }
    }

    protected void onCreate (Bundle savedInstanceState){

        Button butVal;
        CheckBox checkBoxContrat;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrat);

        butVal = (Button) findViewById(R.id.buttonVal);
        checkBoxContrat = (CheckBox) findViewById(R.id.checkBoxContrat);

        //évènement bouton butEmployeur
        butVal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ContratActivity.this, MurEmployeActivity.class);
                startActivity(intent);
            }
        });
    }

}
