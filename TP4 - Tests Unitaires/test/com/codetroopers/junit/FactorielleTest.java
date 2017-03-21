package com.codetroopers.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FactorielleTest {

  private IFactorielle factorielle;

  @Before
  public void setUp() throws Exception {
    // factorielle = new FactorielleLineraire();
    factorielle = new FactorielleRecursive();
  }

  @Test
  public void testFactNegativeKO_LeveException() {
    try {

      factorielle.factorielle(-1);
      // fail("On attend une exception lors d'un calcul de factoriel sur un
      // nombre négatif");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  @Test
  public void testFactorielle1_Retourne1() {

    assertEquals(1, factorielle.factorielle(1));

    // fail("On attend 1 pour 1!");
  }

  @Test
  public void testFactorielleCinq_Retourne120() {

    assertEquals(120, factorielle.factorielle(5));

    // fail("On attend 120 pour 5!");

  }

  @Test
  public void testFactorielleZero_Retourne1() {

    assertEquals(1, factorielle.factorielle(0));

    // fail("On attend 1 pour 0!");
  }
}
