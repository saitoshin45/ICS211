package edu.ics211.h02;

import java.util.Random;
/**
 * @author Shinya Saito
 */
public class BohemianPilsner extends Pilsner {

  /**
   * Create a BohemianPilsner with name, ibu, & abv.
   * 
   * @param name Name of Pilsner
   * @param ibu Pilsner ibu value
   * @param abv Pilsner abv value
   */
  public BohemianPilsner(String name, Integer ibu, Double abv) {
    super(name,BeerType.BOHEMIAN_PILSNER,ibu,abv);
    if(ibu < 35 || ibu > 45 || abv < 4.2 || abv > 5.4) {
      throw new IllegalArgumentException();
    }    
}
  /**
   * Creates a BohemianPilsner with name.
   * @param name Name of the BohemianPilsner
   */
  public BohemianPilsner(String name) {
    super(name,BeerType.BOHEMIAN_PILSNER);
    Random rand = new Random();
    this.ibu = rand.nextInt(10) + 35;
    this.abv = rand.nextDouble()* 1.2 + 4.2;
  }
}