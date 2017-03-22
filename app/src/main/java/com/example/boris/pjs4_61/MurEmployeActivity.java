package com.example.boris.pjs4_61;

import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
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


public class MurEmployeActivity extends AppCompatActivity {
    private GoogleMap mMap;
    private LocationManager locationManager;
    private LocationListener mOnLocationChange;
    static final LatLng PARIS = new LatLng(48.856614, 2.3522219000000177);

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
        Button butEmploye;
        Button butEmployeur;
        Button butLesAnnonces;
        Button butProfil;
        Button butMesCandidatures;

        //initialise la page d'accueil
        Intent intent = getIntent();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mur_employe);

        butMenu = (ImageButton) findViewById(R.id.buttonMur);

        butMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MurEmployeActivity.this, MenuEmployeActivity.class);
                //final EditText test = (EditText) findViewById(R.id.editText2);
                //intent.putExtra("ident", test.getText().toString());
                startActivity(intent);
            }
        });


/*
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(final GoogleMap googleMap) {
                mMap = googleMap;
                //ajoute un marker sur Paris
                googleMap.addMarker(new MarkerOptions().title("Paris").position(PARIS));

                //centre la google map sur Paris (avec animation de zoom)
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(PARIS, 15));
                googleMap.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);

            }
        });
        */
    }
}
