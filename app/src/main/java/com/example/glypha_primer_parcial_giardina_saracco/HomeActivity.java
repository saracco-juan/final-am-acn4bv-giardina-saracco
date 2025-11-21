package com.example.glypha_primer_parcial_giardina_saracco;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textCatCards();
    }

    private void textCatCards(){
        View cardModerna = findViewById(R.id.cardModerna);
        View cardClasica = findViewById(R.id.cardClasica);
        View cardElegante = findViewById(R.id.cardElegante);
        View cardCreativa = findViewById(R.id.cardCreativa);

        ((TextView) cardModerna.findViewById(R.id.txtCategoria)).setText(getString(R.string.txt_cat_moderna));
        ((TextView) cardClasica.findViewById(R.id.txtCategoria)).setText(getString(R.string.txt_cat_clasica));
        ((TextView) cardElegante.findViewById(R.id.txtCategoria)).setText(getString(R.string.txt_cat_elegante));
        ((TextView) cardCreativa.findViewById(R.id.txtCategoria)).setText(getString(R.string.txt_cat_creativa));
    }
}