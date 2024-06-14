package com.example;

public class Pokemon {
    public String name;
    public String type1;
    public String type2;        
    public int bst;

    public Pokemon(String name, String type1, String type2, int bst){
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.bst = bst;
    }

    public String getName(){
        return name;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public int getBst() {
        return bst;
    }
}
