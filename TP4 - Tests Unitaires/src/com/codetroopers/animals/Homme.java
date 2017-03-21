package com.codetroopers.animals;


public class Homme extends Mammifere {
    protected String numSecuriteSociale;
    protected String adresse;

    public Homme(String nom) {
        super(nom);
        espece = "Homme";
    }

    public String getNumSecuriteSociale() {
        return numSecuriteSociale;
    }

    public void setNumSecuriteSociale(String numSecuriteSociale) {
        this.numSecuriteSociale = numSecuriteSociale;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


}
