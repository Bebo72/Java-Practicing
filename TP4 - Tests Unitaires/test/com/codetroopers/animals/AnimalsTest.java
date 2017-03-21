package com.codetroopers.animals;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AnimalsTest {

  private Animal animal;

  @Before
  public void setUp() throws Exception {
    // factorielle = new FactorielleLineraire();
    animal = new Animal(null);
  }

  @Test
  public void testCreationAnimalAvecNomRempliBienAttributNom() {
    animal.setNom("Robert");

    assertEquals("Robert", animal.getNom());
  }

  @Test
  public void testCreationMammifereVerifNomVerifEspece() {
    assertEquals(1, 2);
  }

}
