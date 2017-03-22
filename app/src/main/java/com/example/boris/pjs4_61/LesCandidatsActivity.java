package com.example.boris.pjs4_61;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by Hugo on 06/03/2017.
 */

public class LesCandidatsActivity {

    public class ContratActivity extends AppCompatActivity {



        protected void onCreate (Bundle savedInstanceState){

            Intent intent = getIntent();
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_les_candidats);

        }

    }
}
