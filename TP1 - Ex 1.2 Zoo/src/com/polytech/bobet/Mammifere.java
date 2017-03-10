package com.polytech.bobet;

/**
 * @author bebo
 *
 */
public class Mammifere extends Animal {

  private int iNbMamelles;

  /**
   * @param sNom
   */
  public Mammifere(String sNom) {
    this(sNom, Sexe.INDETERMINE);
  }

  /**
   * @param sNom
   * @param sexSexe
   */
  public Mammifere(String sNom, Sexe sexSexe) {
    super(sNom, sexSexe);

  }

  // Methods

  /**
   * @return iNbMamelles
   */
  public int LectureMamelle() {
    return iNbMamelles;
  }

  /**
   * @param nombre
   */
  public void ModifierMamelle(int nombre) {
    iNbMamelles = nombre;
  }

  @Override
  public String toString() {

    return super.toString() + (" Je suis un mammifere.");

  }

}
