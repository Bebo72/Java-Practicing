package com.codetroopers.collection;

import com.codetroopers.collection.exception.NoteIncorrectException;

import java.util.ArrayList;
import java.util.List;

public class EnsembleNotes {

    List<Double> notes;

    public EnsembleNotes() {
        notes = new ArrayList<Double>();
    }

    public void ajouterUneNote(double nouvelleNotes) {
        notes.add(nouvelleNotes);
    }

    public EnsembleNotes ajouterNote(double nouvelleNotes) throws NoteIncorrectException {
        if (nouvelleNotes < 0) {
            throw new NoteIncorrectException(nouvelleNotes);
        }
        if (nouvelleNotes > 20) {
            throw new NoteIncorrectException(nouvelleNotes);
        }
        notes.add(nouvelleNotes);
        return this;
    }

    public Double calculMoyenne() {
        if (notes.isEmpty()) {
            return -1d;
        }
        double somme = 0;
        double moyenne = 0;
        //		//parcours classique
        //		for(int i = 0; i< notes.size(); i++){
        //			somme += notes.get(i);
        //		}

        //		//parcours par iterator
        //		Iterator<Double> iterator = notes.iterator();
        //		while(iterator.hasNext()){
        //			somme += iterator.next();
        //		}


        //parcour par foreach (depuis jdk5)
        for (Double uneNote : notes) {
            somme += uneNote;
        }

        moyenne = somme / notes.size();
        return moyenne;
    }


    public static void main(String[] args) throws NoteIncorrectException {
        EnsembleNotes notes = new EnsembleNotes();
        notes.ajouterUneNote(15);
        notes.ajouterUneNote(10);
        notes.ajouterUneNote(5);

        notes.ajouterNote(0).ajouterNote(20);

        Double moyenne = notes.calculMoyenne();
        System.out.println(moyenne);
    }
}
