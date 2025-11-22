package com.example.glypha_primer_parcial_giardina_saracco;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class AdminActivity extends AppCompatActivity {

    private EditText et_id_fuente, et_nombre_fuente, et_tamanio_fuente, et_peso_fuente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.admin_layout);

        et_id_fuente = (EditText) findViewById(R.id.et_id_fuente);
        et_nombre_fuente = (EditText) findViewById(R.id.et_nombre_fuente);
        et_peso_fuente = (EditText) findViewById(R.id.et_peso_fuente);
        et_tamanio_fuente = (EditText) findViewById(R.id.et_tamanio_fuente);

    }

    //Metodo para registrar fuentes
    public void Registrar(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "db_administracion", null, 1);
    }
}
