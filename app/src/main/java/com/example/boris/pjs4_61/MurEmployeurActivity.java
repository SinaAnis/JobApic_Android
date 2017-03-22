package com.example.boris.pjs4_61;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static com.example.boris.pjs4_61.MurEmployeActivity.PARIS;

public class MurEmployeurActivity extends AppCompatActivity {
    static final LatLng PARIS = new LatLng(48.858093, 2.294694);
    private GoogleMap mMap;

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

        ImageButton butMenu;
      //  Button butEmploye;
      //  Button butEmployeur;


        //initialise la page d'accueil
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mur_employeur);

        //cherche l'id du bouton
          butMenu = (ImageButton) findViewById(R.id.buttonMur);
        //  butEmploye = (Button) findViewById(R.id.buttonEmploye);
        //  butEmployeur = (Button) findViewById(R.id.buttonEmployeur);


        //évènement bouton butMenu
        butMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MurEmployeurActivity.this, MenuEmployeurActivity.class);
                //final EditText test = (EditText) findViewById(R.id.editText2);
                //intent.putExtra("ident", test.getText().toString());
                startActivity(intent);
            }
        });

/*
        //évènement bouton butEmploye
        butEmploye.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MurEmployeurActivity.this, MenuEmployeActivity.class);
                startActivity(intent);
            }
        });

        //évènement bouton butEmployeur
        butEmployeur.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MurEmployeurActivity.this, MenuEmployeurActivity.class);
                startActivity(intent);
            }
        });
        */


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {

                //ajoute un marker sur Paris
                googleMap.addMarker(new MarkerOptions().title("Paris").position(PARIS));

                //centre la google map sur Paris (avec animation de zoom)
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(PARIS, 15));
                googleMap.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);

            }

        });



    }
}
