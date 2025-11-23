package com.example.glypha_primer_parcial_giardina_saracco.data.db;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper{

    public AdminSQLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table fuentes(id int primary key, nombre string, peso string, tamanio string)");

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

//        db.execSQL("create table usuarios (id INTEGER primary key autoincrement, nombre TEXT, email TEXT unique, password TEXT)");
//        db.execSQL( "CREATE TABLE favoritos (" +
//                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
//                "id_usuario INTEGER, " +
//                "id_fuente INTEGER, " +
//                "FOREIGN KEY(id_usuario) REFERENCES usuarios(id), " +
//                "FOREIGN KEY(id_fuente) REFERENCES fuentes(id), " +
//                "UNIQUE(id_usuario, id_fuente))");
}
