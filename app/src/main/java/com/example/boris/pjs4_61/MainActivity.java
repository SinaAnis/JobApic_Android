package com.example.boris.pjs4_61;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //90 110 135
    private static final String	UPDATE_URL	= "127.0.0.1/login.php";

    public static final String MY_PREFS_NAME = "MyPrefsFile";

    @Override
    protected void onResume(){
        super.onResume();
        try{
            Intent intent = getIntent();
        } catch(Exception e){

        }
    }
//Prenom genre date naissance adresse mail tel mdp
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button butConfirm;
        Button butReg;
        Button butQuit;
        //EditText test;

        //initialise la page d'accueil
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //cherche l'id du bouton
        butConfirm = (Button) findViewById(R.id.buttonVal);
        butReg = (Button) findViewById(R.id.buttonReg);
        butQuit = (Button) findViewById(R.id.buttonQuit);


        //affichage de "null" dans zone de texte identifiant
        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        //String restoredText = prefs.getString("text", null);
        //if (restoredText != null) {
        String name = prefs.getString("name", "NULL");//"No name defined" is the default value.
        //test.setText(name);
        //}



        //évènement bouton registration (activity_inscription)
        butReg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, InscriptionActivity.class);
                final EditText test = (EditText) findViewById(R.id.editText2);
                intent.putExtra("ident", test.getText().toString());
                startActivity(intent);
            }
        });

        //évènement bouton confirmer (pour la activity_connexion)
        butConfirm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final EditText log = (EditText) findViewById(R.id.editText2);
                final EditText mdp = (EditText) findViewById(R.id.editText);
                if(!log.getText().toString().equals("")&&!mdp.getText().toString().equals("")){
                    Intent intent = new Intent(MainActivity.this, MurEmployeurActivity.class);
                    intent.putExtra("ident", log.getText().toString());
                    startActivity(intent);
                }
                else{
                    String s = "Veuillez saisir un identifiant et un mot de passe";
                    createDialog(s);
                }

            }
        });

        //évènement bouton quiter
        butQuit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
                editor.putString("name", "Elena");
                editor.commit();
                System.exit(1);
            }
        });
    }

    private void createDialog(String text) {
        // Création d'une popup affichant un message
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_LONG);
        toast.show();

    }
}
