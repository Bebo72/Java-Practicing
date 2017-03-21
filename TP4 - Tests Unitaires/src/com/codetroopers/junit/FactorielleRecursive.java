package com.codetroopers.junit;

public class FactorielleRecursive implements IFactorielle {

  @Override
  public int factorielle(int nb) {

    if (nb < 0) {
      throw new RuntimeException(EXCEPTION_MESSAGE);
    }

    else {
      return nb <= 1 ? 1 : nb * factorielle(nb - 1);
    }

  }
}
