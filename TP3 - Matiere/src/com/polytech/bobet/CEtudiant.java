package com.polytech.bobet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author bebo
 *
 */
public class CEtudiant {

  // Attributes
  private List<Float> lNotes;
  private Map<CMatiere, CNote> notesParMatiere;

  // Constructors

  /**
   *
   */
  public CEtudiant() {
    notesParMatiere = new HashMap<>();
  }

  /**
   * @param map
   */
  public CEtudiant(Map<CMatiere, CNote> map) {
    notesParMatiere = new HashMap<>(map);
  }

  // Methods

  private CEtudiant ajouterNote(CMatiere matiere, Float note) {

    if (!notesParMatiere.containsKey(matiere)) {
      notesParMatiere.put(matiere, new CNote());
    }

    CNote sesNotes = notesParMatiere.get(matiere);

    sesNotes.addNote(note);

    notesParMatiere.put(matiere, sesNotes);

    return this;

  }

  private Double calculerMoyenneG()
  {
    Double moyenne = 0.0;
    Double moyenneG = 0.0;
    Double sommeCoeff = 0.0;

    for (CMatiere matiere : notesParMatiere.keySet()) {
      CNote ensembleNotes = notesParMatiere.get(matiere);

      moyenneG += ensembleNotes.calculerMoyenne() * getdCoefficient(matiere);
      sommeCoeff += matiere.coeff;
    }

    return moyenneG / sommeCoeff;


}
