package com.polytech.bobet;

/**
 * @author bebo
 *
 */
public class CEHEHeure {

  // Function Main

  /**
   * @param args
   * @throws CException
   */
  public static void main(String[] args) throws CException {

    CEHEHeure maintenant = new CEHEHeure();
    maintenant.setHeuresMinutes(23, 59);

    maintenant.avancerMinutes(1441);

    System.out.println(maintenant.toString());

  }

  // Attributes

  private byte iHeure;

  private byte iMinute;

  // Constructors

  /**
   *
   */
  public CEHEHeure() {
    iHeure = 00;
    iMinute = 00;
  }

  /**
   * @param iHeure
   * @param iMinute
   */

  public CEHEHeure(byte iHeure, byte iMinute) {

    this.iHeure = iHeure;
    this.iMinute = iMinute;

  }

  // Methods

  /**
   * @param mm
   */
  public void avancerMinutes(int mm) {

    // Ne gère pas tout les cas !!!

    if (mm >= 0) {

      while (mm > 59) {
        iHeure += 1;
        mm -= 60;

      }

      this.iMinute += mm;

      if (this.iMinute > 59) {
        iHeure += 1;
        this.iMinute -= 60;

      }

      if (iHeure >= 24) {
        iHeure = (byte) (24 - iHeure);

        if (iHeure < 0) {
          iHeure = (byte) (iHeure * -1);
        }
      }

    }

    else {

      while (mm < -59) {
        mm += 60;
        iHeure -= 1;
      }

      this.iMinute += mm;

      if (this.iMinute < -59) {
        iHeure += 1;
        this.iMinute += 60;

      }

      if (iHeure >= 24) {
        iHeure = (byte) (24 - iHeure);

        if (iHeure < 0) {
          iHeure = (byte) (iHeure * -1);
        }
      }

    }

  }

  /**
   * @return iHeure
   */
  public int getHeures() {

    return iHeure;
  }

  /**
   * @return iMinute
   */
  public int getMinutes() {

    return iMinute;

  }

  /**
   * @param hh
   * @throws CException
   */
  public void setHeures(int hh) throws CException {

    if (hh < 00 || hh > 23) {
      throw new CException("Argument invalide");
    }

    iHeure = (byte) hh;

    // Version 1 :
    /*
     * try {
     *
     * if (hh < 0 || hh > 23) { throw new
     * IllegalArgumentException("Argument invalide"); } else { iHeure = (byte)
     * hh; }
     *
     * } catch (IllegalArgumentException e) {
     * System.out.println("Une erreur a déclenché IllegalArgumentException..." +
     * e.getMessage());
     *
     * }
     */

  }

  /**
   * @param hh
   * @param mm
   * @throws CException
   */
  public void setHeuresMinutes(int hh, int mm) throws CException {

    if ((hh < 00 || hh > 23) && (mm < 00 || mm > 59)) {
      throw new CException("Argument invalide");
    }

    setHeures(hh);
    setMinutes(mm);

    // Version 1 :
    /*
     * try {
     *
     * if ((hh < 00 || hh > 23) && (mm < 00 || mm > 59)) { throw new
     * IllegalArgumentException("Argument invalide"); } else { setHeures(hh);
     * setMinutes(mm); }
     *
     * } catch (IllegalArgumentException e) {
     * System.out.println("Une erreur a déclenché IllegalArgumentException..." +
     * e.getMessage()); }
     */

  }

  /**
   * @param mm
   * @throws CException
   */
  public void setMinutes(int mm) throws CException {

    if (mm < 00 || mm > 59) {
      throw new CException("Argument invalide");
    }

    iMinute = (byte) mm;

    // Version 1 :
    /*
     * try {
     *
     * if (mm < 00 || mm > 59) { throw new
     * IllegalArgumentException("Argument invalide"); } else { iMinute = (byte)
     * mm; }
     *
     * } catch (IllegalArgumentException e) {
     * System.out.println("Une erreur a déclenché IllegalArgumentException..." +
     * e.getMessage()); }
     */

  }

  @Override
  public String toString() {

    return iHeure + ":" + iMinute;

  }

}
