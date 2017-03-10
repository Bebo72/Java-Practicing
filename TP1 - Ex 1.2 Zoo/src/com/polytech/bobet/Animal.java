package com.polytech.bobet;

class Animal {

  // Attributes

  static private int iCompteurAnimal;
  private String sNom;
  private Sexe sexSexe;

  // Constructors

  public Animal(String sNom) {
    this(sNom, Sexe.INDETERMINE);

  }

  public Animal(String sNom, Sexe sexSexe) {
    this.sNom = sNom;
    this.sexSexe = sexSexe;
    setiCompteurAnimal(getiCompteurAnimal() + 1);

  }

  public Sexe getSexSexe() {
    return sexSexe;
  }

  public String getsNom() {
    return sNom;
  }

  public void setSexSexe(Sexe sexSexe) {
    this.sexSexe = sexSexe;
  }

  public void setsNom(String sNom) {
    this.sNom = sNom;
  }

  @Override
  public String toString() {

    return ("Je suis un animal de nom " + getsNom() + " et de sexe " + getSexSexe() + ".");

  }

public static int getiCompteurAnimal() {
	return iCompteurAnimal;
}

public static void setiCompteurAnimal(int iCompteurAnimal) {
	Animal.iCompteurAnimal = iCompteurAnimal;
}

}
