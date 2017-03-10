package com.polytech.bobet;

/**
 * @author bebo
 *
 */
public class Humain extends Mammifere {

  /**
   * @param sNom
   */
  public Humain(String sNom) {
    this(sNom, Sexe.INDETERMINE);
  }

  /**
   * @param sNom
   * @param sexSexe
   */
  public Humain(String sNom, Sexe sexSexe) {
    super(sNom, sexSexe);
  }

  @Override
  public String toString() {
    return super.toString() + (" Je suis un humain.");

  }
}
