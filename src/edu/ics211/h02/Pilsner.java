package edu.ics211.h02;

import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.Random;

/**
* represents a Pilsner function.
* @author Shinya Saito 
* @param name
* @param ibu
* @param abv
* found this at https://stackoverflow.com/questions/38381133/check-conditions-in-subclass-before-calling-superclass-constructor-method
*/
public class Pilsner extends Beer
{
 

  
/**
 *Creates a new Pilsner.  
 * @param name the Name of the Pilsner
 * @param ibu the IBU of the Pilsner 
 * @param abv the ABV of the Pilsenr 
 */
public Pilsner(String name,Integer ibu, Double abv) {
   super(name, BeerType.PILSNER, ibu, abv);
   if(ibu < 25 || ibu > 45 || abv < 4.2 || abv > 6.0)
   {
      throw new IllegalArgumentException();
   }
}

public Pilsner(String name) 
{
  super(name, BeerType.PILSNER);
  Random rand = new Random(); 
  this.ibu = rand.nextInt(20) + 25;
  this.abv = rand.nextDouble() * 1.8 + 4.2;
}
 
protected Pilsner(String name, BeerType type, Integer ibu, Double abv)
{
  super(name, type,ibu,abv);
}
 
protected Pilsner(String name, BeerType type) {
super(name, type);
   }


}
