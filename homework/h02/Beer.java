/**
 * 
 */
package edu.ics211.h02;

/**
 * Represents a beer
 * @author Shinya Saito
 *
 */
public abstract class Beer implements Comparable<Beer> {
  private String name;
  private BeerType type;
  protected Integer ibu;
  protected Double abv;
  
  /**
   * Creates a new Beer.
   * 
   * @param name the name of the new Beer
   * @param type the type of the new Beer
   */
  public Beer(String name, BeerType type) {
    super();
    this.type = type;
    setName(name);
  }
  
  /**
   * Creates a new beer.
   * 
   * @param name the name of the new Beer
   * @param type the type of the new Beer
   * @param ibu the IBU of the new Beer 
   * @param abv the ABV of the new Beer 
   */
  public Beer(String name, BeerType type,Integer ibu, Double abv) {
    super();
    setName(name);
    this.type = type;
    this.ibu = ibu;
    this.abv = abv;
  }
  
  /**
   * Returns the comparison of the Beer Name.
   * @return name
   */
  public int compareTo(Beer o) {
    // TODO Auto-generated method stub
    return this.name.compareTo(o.name);
  }
  /**
   * Returns the name of Beer.
   * @return name of the Beer
   */
  
  public String getName() {
    return name;
  }
  /**
   * @return type of the Beer 
   */
  
  public BeerType getType() {
    return type;
  }
  /** 
   * @return ibu of the Beer
   */
  
  public Integer getIbu(){
    return ibu;
  }
  /**
   * @return abv of the Beer 
   */
  
  public Double getAbv() {
    return abv;
  }
  /**
   * @param name Name of the String 
   */
  
  public void setName(String name) {
    this.name = name;
  }
  
}


