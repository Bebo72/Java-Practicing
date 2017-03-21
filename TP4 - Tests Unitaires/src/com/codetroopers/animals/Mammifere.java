package com.codetroopers.animals;

public class Mammifere extends Animal {
    protected int nbMamelles;

    protected String espece = "Mammifère";


    public Mammifere(String nom) {
        super(nom);
    }

    public int getNbMamelles() {
        return nbMamelles;
    }

    public void setNbMamelles(int nbMamelles) {
        this.nbMamelles = nbMamelles;
    }

    public String getEspece() {
        return espece;
    }


}
