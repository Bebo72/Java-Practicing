package com.codetroopers.junit;

import java.io.Serializable;

public interface IAnimal extends Serializable {

  static final String EXCEPTION_MESSAGE = "Erreur";

  void Animal(String Nom);
}
