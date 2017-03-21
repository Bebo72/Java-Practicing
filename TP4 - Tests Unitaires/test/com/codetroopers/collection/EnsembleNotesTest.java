package com.codetroopers.collection;

import com.codetroopers.collection.exception.NoteIncorrectException;
import org.junit.Test;

import static com.codetroopers.collection.exception.NoteIncorrectException.*;
import static org.junit.Assert.*;

public class EnsembleNotesTest {

    @Test
    public void testMoyenne_5Et10_Retourne7etDemi() throws NoteIncorrectException {
        EnsembleNotes ensembleNotes = new EnsembleNotes();
        ensembleNotes.ajouterNote(5);
        ensembleNotes.ajouterNote(10);
        Double septEtDemi = 7.5;
        assertEquals(septEtDemi, ensembleNotes.calculMoyenne());
    }

    @Test
    public void testListeVideDoitRetournerMoins1() throws Exception {
        EnsembleNotes ensembleNotes = new EnsembleNotes();
        Double moyennePasDeNote = ensembleNotes.calculMoyenne();
        Double moins1 = -1d;
        assertEquals(moins1, moyennePasDeNote);
    }

    @Test
    public void testNoteNegativeImpossible() throws Exception {
        EnsembleNotes ensembleNotes = new EnsembleNotes();
        try {
            ensembleNotes.ajouterNote(-5.0);
            fail("Une exception doit être levée lors d'ajout de note négative");
        }catch (NoteIncorrectException e){
            //On est bien passé dans l'exception
            assertEquals(NatureException.NEGATIVE, e.getNatureException());
        }
    }

    @Test
    public void testNoteSuperieurA20Impossible() throws Exception {
        EnsembleNotes ensembleNotes = new EnsembleNotes();
        try {
            ensembleNotes.ajouterNote(21.0);
            fail("Une exception doit être levée lors d'ajout de note > 20");
        }catch (NoteIncorrectException e){
            //On est bien passé dans l'exception
            assertEquals(NatureException.SUPERIEUR_A_20, e.getNatureException());
        }
    }


    @Test
    public void testAjouterNote16Virgule5() throws Exception {
        EnsembleNotes ensembleNotes = new EnsembleNotes();
        ensembleNotes.ajouterNote(16.5);

        assertEquals(16,5, ensembleNotes.calculMoyenne());
    }
}