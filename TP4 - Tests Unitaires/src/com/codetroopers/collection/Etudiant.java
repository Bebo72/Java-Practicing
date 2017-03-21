package com.codetroopers.collection;

import com.codetroopers.collection.exception.NoteIncorrectException;

import java.util.HashMap;
import java.util.Map;

public class Etudiant {
    String nom;
    Map<Matiere, EnsembleNotes> notesParMatiere;

    public Etudiant(String nom) {
        this.notesParMatiere = new HashMap<Matiere, EnsembleNotes>();
        this.nom = nom;
    }

    public double moyenneGenerale() {
        Double sommeMoyenne = 0.0;
        Integer sommeCoeff = 0;
        //Parcours des clés
        for (Matiere key : notesParMatiere.keySet()) {
            EnsembleNotes notes = notesParMatiere.get(key);

            sommeMoyenne += notes.calculMoyenne() * key.coeff;
            sommeCoeff += key.coeff;
        }

        //Parcours des clés/valeurs
        //		for(Entry<Matiere, EnsembleNotes> entry : notesParMatiere.entrySet()){
        //			Matiere matiere = entry.getKey();
        //			EnsembleNotes notes = entry.getValue();
        //			
        //			sommeMoyenne += notes.calculMoyenne()*matiere.coeff;
        //			sommeCoeff += matiere.coeff;
        //		}

        Double moyenneG = sommeMoyenne / sommeCoeff;
        return moyenneG;
    }


    public Double moyenne(Matiere matiere) {
        return notesParMatiere.get(matiere).calculMoyenne();
    }

    public Etudiant ajouterNote(Matiere matiere, Double note) throws NoteIncorrectException {
        if (!notesParMatiere.containsKey(matiere)) {
            notesParMatiere.put(matiere, new EnsembleNotes());
        }
        EnsembleNotes notes = notesParMatiere.get(matiere);
        notes.ajouterNote(note);
        return this;
    }

    public static void main(String[] args) throws NoteIncorrectException {
        Matiere proba = new Matiere("proba", 3);
        Matiere java = new Matiere("java", 1);

        Etudiant john = new Etudiant("John Doe");
        john.ajouterNote(proba, 6.0).ajouterNote(java, 10.0);


        double moyenneGenerale = john.moyenneGenerale();
        System.out.println(moyenneGenerale);
    }


}
