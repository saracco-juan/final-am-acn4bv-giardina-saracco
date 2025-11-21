package com.example.glypha_primer_parcial_giardina_saracco;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_activity);
    }

    public void goHome(View view){
        Intent home = new Intent(this, MainActivity.class);
        startActivity(home);
    }
}