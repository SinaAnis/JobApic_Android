package com.example.boris.pjs4_61;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Boris on 27/02/2017.
 */

public class MurActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);
        TextView tv = (TextView) findViewById(R.id.tvtest);
        TextView tvName = (TextView) findViewById(R.id.tvPseudo);
        Intent intent = getIntent();

        tvName.setText(intent.getStringExtra("ident"));
        createDialog("Bienvenue "+tvName.getText());
        //Test bdd
        AchievementBDD bdd = new AchievementBDD(this);
        Achievement a = new Achievement("Test", 1);
        bdd.open();
        bdd.insertAchievement(a);
        tv.setText(bdd.getAchievementWithName("Test").getNb()+"");
    }

    private void createDialog(String text)
    {
        // Création d'une popup affichant un message
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_LONG);
        toast.show();

    }
}
