package com.polytech.bobet;

/**
 * @author bebo
 *
 */
public class CMatiere {

  // Attributes

  private String sMatiere;
  private Double dCoefficient;

  // Constructors

  CMatiere() {
    dCoefficient = (double) 0;
  }

  CMatiere(String sMatiere, Double dCoefficient) {
    this.sMatiere = sMatiere;
    this.dCoefficient = dCoefficient;
  }

  /**
   * @return dCoefficient
   */
  public Double getdCoefficient() {
    return dCoefficient;
  }

  /**
   * @return sMatiere
   */
  public String getsMatiere() {
    return sMatiere;
  }

  /**
   * @param dCoefficient
   */
  public void setdCoefficient(Double dCoefficient) {
    this.dCoefficient = dCoefficient;
  }

  /**
   * @param sMatiere
   */
  public void setsMatiere(String sMatiere) {
    this.sMatiere = sMatiere;
  }

  // Methods

}
