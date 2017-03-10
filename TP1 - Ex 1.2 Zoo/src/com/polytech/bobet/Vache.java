package com.polytech.bobet;

/**
 * @author bebo
 *
 */
public class Vache extends Mammifere {

  /**
   * @param sNom
   */
  public Vache(String sNom) {
    this(sNom, Sexe.INDETERMINE);
  }

  /**
   * @param sNom
   * @param sexSexe
   */
  public Vache(String sNom, Sexe sexSexe) {
    super(sNom, sexSexe);
  }

  @Override
  public String toString() {

    if (getSexSexe() == Sexe.FEMININ) {
      return super.toString() + (" Je suis une vache.");
    } else if (getSexSexe() == Sexe.MASCULIN) {
      return super.toString() + (" Je suis une taureau !");
    }

    else {
      return super.toString() + (" Je suis je suis ? Julien Lepers.");
    }

  }

}
