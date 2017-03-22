package com.example.boris.pjs4_61;

/**
 * Created by Boris on 27/02/2017.
 */

public class Achievement {

    private int id;
    private String name;
    private int progress;

    public Achievement(){

    }

    public Achievement(String name, int id){
        this.name = name;
        this.progress = 0;
        this.id = id;
    }

    public Achievement(String name, int prog, int id){
        this.name = name;
        this.progress = prog;
        this.id = id;
    }

    public int getId(){
        return this.progress;
    }

    public int getNb(){
        return this.progress;
    }

    public String getName(){
        return this.name;
    }

    public void setId(int a){
        this.progress = a;
    }

    public void setNb(int a){
        this.progress = a;
    }

    public void setName(String a){
        this.name = a;
    }

}
