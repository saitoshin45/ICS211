package edu.ics211.h02;

import java.util.Random;

public class IndiaPaleAle extends Beer {
  
  /**
   * represents a Pilsner function
   * 
   * @author Shinya Saito 
   * @param name
   * @param ibu
   * @param abv
   * found this at https://stackoverflow.com/questions/38381133/check-conditions-in-subclass-before-calling-superclass-constructor-method
   */
   
  /**
  *Creates a new Pilsner.  
  * @param name
  * @param ibu
  * @param abv
  */
 public IndiaPaleAle(String name,Integer ibu, Double abv) {
    super(name, BeerType.INDIA_PALE_ALE, ibu, abv);
    if(ibu < 40 || ibu > 100 || abv < 5.0 || abv > 10.0) {
     throw new IllegalArgumentException();
    }
  }
  /**
   * Creates a name for a Pilsner type beer.
   * @param name
   */
  public IndiaPaleAle(String name) {
    super(name, BeerType.INDIA_PALE_ALE);
    Random rand = new Random(); 
    this.ibu = rand.nextInt(20)+25;
    this.abv = rand.nextDouble()*5.0+5.0;
  }
  
 protected IndiaPaleAle(String name, BeerType type, Integer ibu, Double abv) {
    super(name, type,ibu,abv);
  }
  
  protected IndiaPaleAle(String name, BeerType type) {
    super(name, type);
  }
}
