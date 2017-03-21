package com.codetroopers.junit;

import java.io.Serializable;


public interface IFactorielle extends Serializable {

    static final String EXCEPTION_MESSAGE = "L'argument de la fonction factorielle ne peut être négatif";

    int factorielle(int nb);
}
