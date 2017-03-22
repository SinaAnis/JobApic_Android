package com.example.boris.pjs4_61;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
/**
 * Created by Boris on 27/02/2017.
 */

public class AchievementBDD {

    private static final int VERSION_BDD = 1;
    private static final String NOM_BDD = "achievement.db";

    private static final String TABLE = "table_achievement";
    private static final String COL_ID = "ID";
    private static final int NUM_COL_ID = 0;
    private static final String COL_NAME = "Titre";
    private static final int NUM_COL_NAME = 1;
    private static final String COL_NB = "nbAch";
    private static final int NUM_COL_NB = 2;

    private SQLiteDatabase bdd;

    private BDD maBaseSQLite;

    public AchievementBDD(Context context){
        //On crée la BDD et sa table
        maBaseSQLite = new BDD(context, NOM_BDD, null, VERSION_BDD);
    }

    public void open(){
        //on ouvre la BDD en écriture
        bdd = maBaseSQLite.getWritableDatabase();
    }

    public void close(){
        //on ferme l'accès à la BDD
        bdd.close();
    }

    public SQLiteDatabase getBDD(){
        return bdd;
    }

    public long insertAchievement(Achievement achievement){
        //Création d'un ContentValues (fonctionne comme une HashMap)
        ContentValues values = new ContentValues();
        //on lui ajoute une valeur associée à une clé (qui est le nom de la colonne dans laquelle on veut mettre la valeur)
        values.put(COL_NAME, achievement.getName());
        values.put(COL_NB, achievement.getNb());
        //on insère l'objet dans la BDD via le ContentValues
        return bdd.insert(TABLE, null, values);
    }

    public int updateAchievement(int id, Achievement a){
        //La mise à jour d'un Achievement dans la BDD fonctionne plus ou moins comme une insertion
        //il faut simplement préciser quel Achievement on doit mettre à jour grâce à l'ID
        ContentValues values = new ContentValues();
        values.put(COL_NAME, a.getName());
        values.put(COL_NB, a.getNb());
        return bdd.update(TABLE, values, COL_ID + " = " +id, null);
    }

    public int removeAchievementWithID(int id){
        //Suppression d'un Achievement de la BDD grâce à l'ID
        return bdd.delete(TABLE, COL_ID + " = " +id, null);
    }

    public Achievement getAchievementWithName(String titre){
        //Récupère dans un Cursor les valeurs correspondant à un Achievement contenu dans la BDD (ici on sélectionne l'achievement grâce à son nom)
        Cursor c = bdd.query(TABLE, new String[] {COL_ID, COL_NAME, COL_NB}, COL_NAME + " LIKE \"" + titre +"\"", null, null, null, null);
        return cursorToAchievement(c);
    }

    //Cette méthode permet de convertir un cursor en un livre
    private Achievement cursorToAchievement(Cursor c){
        //si aucun élément n'a été retourné dans la requête, on renvoie null
        if (c.getCount() == 0)
            return null;

        //Sinon on se place sur le premier élément
        c.moveToFirst();
        //On créé un livre
        Achievement ach = new Achievement();
        //on lui affecte toutes les infos grâce aux infos contenues dans le Cursor
        ach.setId(c.getInt(NUM_COL_ID));
        ach.setName(c.getString(NUM_COL_NAME));
        ach.setNb(c.getInt(NUM_COL_NB));
        //On ferme le cursor
        c.close();

        //On retourne le livre
        return ach;
    }

}
