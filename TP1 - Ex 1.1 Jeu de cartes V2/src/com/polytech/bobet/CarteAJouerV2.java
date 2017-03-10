package com.polytech.bobet;

/**
 * @author bebo
 *
 */
public class CarteAJouerV2 {

  private static final String[] VALEURS_VALIDES = { "AS", "DEUX", "TROIS", "QUATRE", "CINQ", "SIX", "SEPT", "HUIT",
      "NEUF", "DIX", "VALLET", "DAME", "ROI" };
  private static final String[] COULEURS_VALIDES = { "PIQUE", "COEUR", "CARREAU", "TREFLE" };
  private static CarteAJouerV2[] jeuCartes = new CarteAJouerV2[52];

  /**
   * @return
   */
  public static String[] getCOULEURS_VALIDES() {
    return COULEURS_VALIDES;
  }

  // Constructor

  /**
   * @param args
   */
  // Function Main

  public static void main(String[] args) {

    int iBoucle = 0;

    for (String couleurTab : COULEURS_VALIDES) {

      for (String valeurTab : VALEURS_VALIDES) {
        jeuCartes[iBoucle] = new CarteAJouerV2(couleurTab, valeurTab);
        iBoucle++;

      }
    }

    int iBoucleCarte = 0;

    for (iBoucleCarte = 0; iBoucleCarte < 52; iBoucleCarte++) {
      jeuCartes[iBoucleCarte].toString();
    }

    System.out.println("\nNombre de carte : " + iBoucle);

  }

  // Methods

  // Attributes
  private String couleur, valeur;

  /**
   * @param couleur
   * @param valeur
   */
  public CarteAJouerV2(String couleur, String valeur) {

    if (couleurEstValide(couleur) == true) {
      this.couleur = couleur;
    } else {
      throw new IllegalArgumentException("Couleur invalide");
    }

    if (valeurEstValide(valeur) == true) {
      this.valeur = valeur;
    } else {
      throw new IllegalArgumentException("valeur invalide");
    }
  }

  /**
   * @param coul
   * @return boolean
   */
  public boolean couleurEstValide(String coul) {

    for (String couleurTab : getCOULEURS_VALIDES()) {
      if (couleurTab.equalsIgnoreCase(coul)) {
        return true;
      }
    }

    return false;
  }

  /**
   * @param couleurArg
   * @param valeurArg
   * @param couleur
   * @param valeur
   * @return COULEURS_VALIDES
   */
  public CarteAJouerV2 getCarte(String couleurArg, String valeurArg) {

    int iBoucleCarte = 0;
    boolean bRecherche = false;

    for (iBoucleCarte = 0; iBoucleCarte < 52 && bRecherche != true; iBoucleCarte++) {
      if (jeuCartes[iBoucleCarte].getCouleur() == couleurArg && jeuCartes[iBoucleCarte].getValeur() == valeurArg) {
        bRecherche = true;
      }

    }

    return jeuCartes[iBoucleCarte];

  }

  /**
   * @return couleur
   */
  public String getCouleur() {

    return couleur;
  }

  /**
   * @return valeur
   */
  public String getValeur() {

    return valeur;
  }

  @Override
  public String toString() {

    String chaine = null;

    for (CarteAJouerV2 carte : jeuCartes) {
      System.out.println(carte.valeur + " de " + carte.couleur);
    }

    return chaine;
  }

  /**
   * @param val
   * @return chaine
   */
  public boolean valeurEstValide(String val) {

    for (String valeurTab : VALEURS_VALIDES) {
      if (valeurTab.equalsIgnoreCase(val)) {
        return true;
      }
    }

    return false;
  }

}
