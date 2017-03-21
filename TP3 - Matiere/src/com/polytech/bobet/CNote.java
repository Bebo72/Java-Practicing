package com.polytech.bobet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bebo
 *
 */
public class CNote {

  // Function Main

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    CNote note = new CNote();

    note.addNote(5);
    note.addNote(10);
    note.addNote(2);

    System.out.println("Votre moyenne est : " + note.calculerMoyenne());

  }

  // Attributes

  List<Float> alNotes;

  // Constructors

  /**
   *
   */
  public CNote() {

    alNotes = new ArrayList<>();

  }

  /**
   * @param alArgument
   * @param iNotes
   */
  public CNote(ArrayList<Float> alArgument) {
    alNotes = new ArrayList<>(alArgument);

  }

  /**
   * @param fElement
   */
  public void addNote(float fElement) {
    alNotes.add(fElement);
  }

  /**
   * @param iNotes
   * @return iMoyenne
   */
  // Methods

  public float calculerMoyenne() {

    Float moyenne = (float) 0;

    for (Float note : alNotes) {
      moyenne += note;
    }

    return moyenne = moyenne / alNotes.size();

  }

}
