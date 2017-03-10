package com.polytech.bobet;

class CarteAJouerV1 {

  // Attributes

  private String couleur, valeur;
  private static final String[] VALEURS_VALIDES = { "AS", "DEUX", "TROIS", "QUATRE", "CINQ", "SIX", "SEPT", "HUIT", "NEUF",
      "DIX", "VALLET", "DAME", "ROI" };
  private static final String[] COULEURS_VALIDES = { "PIQUE", "COEUR", "CARREAU", "TREFLE" };

  // Constructor

  public CarteAJouerV1(String couleur, String valeur) {

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

  // Methods

  public String getCouleur() {

    return couleur;
  }

  public String getValeur() {

    return valeur;
  }


  @Override
  public String toString() {

    return (valeur.toUpperCase() + " de " + couleur.toUpperCase());
  }

  public boolean couleurEstValide(String coul) {

    for (String couleurTab : getCOULEURS_VALIDES()) {
      if (couleurTab.equalsIgnoreCase(coul)) {
        return true;
      }
    }

    return false;
  }

  public boolean valeurEstValide(String val) {

    for (String valeurTab : VALEURS_VALIDES) {
      if (valeurTab.equalsIgnoreCase(val)) {
        return true;
      }
    }

    return false;
  }
  
  public static String[] getCOULEURS_VALIDES() {
	  return COULEURS_VALIDES;
  }  
  
  // Function Main

  public static void main(String[] args) {
    
    
     CarteAJouerV1 carte1 = new CarteAJouerV1("Coeur", "Roi"); CarteAJouerV1
     carte2 = new CarteAJouerV1("Pique", "As");
     System.out.println("Carte 1 = " + carte1.toString() + " et carte 2 = " + carte2.toString());
     
     System.out.println(new CarteAJouerV1("Pique", "roi"));
     System.out.println(new CarteAJouerV1("trefle", "DAME"));
     System.out.println(new CarteAJouerV1("TREFLE", "troIs"));
     System.out.println(new CarteAJouerV1("carreau", "sept"));

  }

}
