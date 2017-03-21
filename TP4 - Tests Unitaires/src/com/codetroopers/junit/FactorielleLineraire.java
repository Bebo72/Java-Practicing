package com.codetroopers.junit;

public class FactorielleLineraire implements IFactorielle {

  @Override
  public int factorielle(int nb) {

    if (nb < 0) {
      throw new RuntimeException(EXCEPTION_MESSAGE);
    }

    int iBoucle = 1, iResultat = 1;

    while (iBoucle <= nb) {
      iResultat *= iBoucle;
      iBoucle++;
    }

    return iResultat;
  }
}
