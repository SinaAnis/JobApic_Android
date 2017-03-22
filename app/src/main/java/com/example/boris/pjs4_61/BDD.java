package com.example.boris.pjs4_61;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Boris on 27/02/2017.
 */

public class BDD extends SQLiteOpenHelper {

    private static final String TABLE = "table_achievement";
    private static final String COL_ID = "ID";
    private static final String COL_NAME = "Titre";
    private static final String COL_NB = "nbAch";


    private static final String CREATE_BDD = "CREATE TABLE " + TABLE + " ("
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_NAME + " TEXT NOT NULL, "
            + COL_NB + " INTEGER);";

    public BDD(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //on crée la table à partir de la requête écrite dans la variable CREATE_BDD
        db.execSQL(CREATE_BDD);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //On peut faire ce qu'on veut ici moi j'ai décidé de supprimer la table et de la recréer
        //comme ça lorsque je change la version les id repartent de 0
        db.execSQL("DROP TABLE " + TABLE + ";");
        onCreate(db);
    }

}
