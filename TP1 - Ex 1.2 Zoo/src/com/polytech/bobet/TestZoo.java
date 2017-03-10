package com.polytech.bobet;

/**
 * @author bebo
 *
 */
public class TestZoo {

  /**
   * @param args
   */
  public static void main(String[] args) {

    Animal[] animaux = new Animal[5];

    animaux[0] = new Animal("Rex", Sexe.MASCULIN);
    animaux[1] = new Mammifere("Médor", Sexe.INDETERMINE);
    animaux[2] = new Humain("Jacques", Sexe.MASCULIN);
    animaux[3] = new Vache("Noiraude", Sexe.FEMININ);
    animaux[4] = new Vache("Gnnnn", Sexe.MASCULIN);

    for (Animal animal : animaux) {
      System.out.println(animal.toString());
    }

  }

}
