package com.example.lemonade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuPrincipal extends AppCompatActivity {


    //declaration des variables pour les boutons
    private ImageButton bouton_bruit;


    // associe l'interface menuprincipal
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuprincipal);

        //initialisation du bouton On et de son listeneur vers l'activity bruit
        bouton_bruit = findViewById(R.id.boutonbruit);
        bouton_bruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visualiser_la_suite();
            }
        });


    }

    // creation des fonctions pour acceder aux activity correspondantes
    private void visualiser_la_suite() {
        Intent intent = new Intent(MenuPrincipal.this, Bruit.class);
        startActivity(intent);
    }





}