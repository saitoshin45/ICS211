package edu.ics211.h02;
/**
 * 
 * @author Shinya Saito 
 * assigns the brew of the different types
 *
 */


public class ManoaBrewing implements IBrewery {
  public static ManoaBrewing instance;
  
  private ManoaBrewing(){
    
  }
  
  public static ManoaBrewing getInstance() {
    if(instance == null) {
      instance = new ManoaBrewing();
    }
    return instance;
  }
  
  /**
   * Assigns the beertypes.
   * @param name The name of the BeerType
   * @param type The 3 different beer types 
   */
  @Override
  public Beer brewBeer(String name, BeerType type) {
    switch(type) {
      case PILSNER:
        return new Pilsner(name);
      case BOHEMIAN_PILSNER:
        return new BohemianPilsner(name);
      case INDIA_PALE_ALE:
        return new IndiaPaleAle(name);
    }
    return null;
  }


  @Override
  public Beer brewPilsner(String name, Integer ibu, Double abv) {
    // TODO Auto-generated method stub
    return new Pilsner(name, ibu, abv);
  }


  @Override
  public Beer brewBohemianPilsner(String name, Integer ibu, Double abv) {
    // TODO Auto-generated method stub
    return new BohemianPilsner(name, ibu, abv);
  }


  @Override
  public Beer brewIndiaPaleAle(String name, Integer ibu, Double abv) {
    // TODO Auto-generated method stub
    return new IndiaPaleAle(name,ibu,abv);
  }

}
