package com.codetroopers.collection;

import com.codetroopers.collection.exception.NoteIncorrectException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Promotion {

    String annee;
    List<Etudiant> etudiants;
    List<Matiere> matieres;

    public Promotion(String annee) {
        this.annee = annee;
        this.etudiants = new ArrayList<Etudiant>();
        this.matieres = new ArrayList<Matiere>();
    }

    private Promotion ajouterEtudiant(Etudiant etudiant) {
        this.etudiants.add(etudiant);
        return this;
    }

    private Double moyenneGenerale() {
        Double somme = 0.0;
        for (Etudiant etudiant : etudiants) {
            somme += etudiant.moyenneGenerale();
        }
        return somme / etudiants.size();
    }

    private Double moyenne(Matiere matiere) {
        Double somme = 0.0;
        for (Etudiant etudiant : etudiants) {
            somme += etudiant.moyenne(matiere);
        }
        return somme / etudiants.size();
    }

    private Double moyenneMeilleur(Matiere matiere) {
        List<Double> moyennes = new ArrayList<Double>();
        for (Etudiant etudiant : etudiants) {
            moyennes.add(etudiant.moyenne(matiere));
        }
        return Collections.max(moyennes);
    }

    private Double moyennePire(Matiere matiere) {
        List<Double> moyennes = new ArrayList<Double>();
        for (Etudiant etudiant : etudiants) {
            moyennes.add(etudiant.moyenne(matiere));
        }
        return Collections.min(moyennes);
    }

    public static void main(String[] args) throws NoteIncorrectException {
        Promotion promo = new Promotion("2017");
        Matiere math = new Matiere("math", 5);
        Matiere sgbd = new Matiere("sgbd", 2);

        Etudiant john = new Etudiant("John");
        Etudiant sacha = new Etudiant("sacha");
        Etudiant edouard = new Etudiant("edouard");
        promo.ajouterEtudiant(john).ajouterEtudiant(sacha).ajouterEtudiant(edouard);

        //math
        john.ajouterNote(math, 9.5).ajouterNote(math, 10.5);
        sacha.ajouterNote(math, 17.0).ajouterNote(math, 5.0);
        edouard.ajouterNote(math, 10.0).ajouterNote(math, 14.0);

        //sgbd
        john.ajouterNote(sgbd, 15.0);
        sacha.ajouterNote(sgbd, 17.0).ajouterNote(sgbd, 5.0);
        edouard.ajouterNote(sgbd, 10.0).ajouterNote(sgbd, 15.0);


        Double moyenneG = promo.moyenneGenerale();
        Double moyenneMath = promo.moyenne(math);
        Double moyenneSGBD = promo.moyenne(sgbd);
        Double meilleurMoyenneMath = promo.moyenneMeilleur(math);
        Double pireMoyenneMath = promo.moyennePire(math);

        System.out.println("moyenneG : " + moyenneG);
        System.out.println("moyenneMath : " + moyenneMath);
        System.out.println("moyenneSGBD : " + moyenneSGBD);
        System.out.println("meilleurMoyenneMath : " + meilleurMoyenneMath);
        System.out.println("pireMoyenneMath : " + pireMoyenneMath);
    }
}
