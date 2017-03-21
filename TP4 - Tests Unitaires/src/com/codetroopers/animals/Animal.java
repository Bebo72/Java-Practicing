package com.codetroopers.animals;

/**
 * Exemple de classe animal pour les TP de DI4
 */
public class Animal {
    public static final int MASCULIN = 1;
    public static final int FEMININ = 2;
    public static final int NEUTRE = 3;
    protected String nom;
    protected int sexe;

    public Animal(String nom) {
        nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSexe() {
        return sexe;
    }

    public void setSexe(int sexe) {
        this.sexe = sexe;
    }

}
