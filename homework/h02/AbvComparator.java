package edu.ics211.h02;

import java.util.Comparator;

public class AbvComparator implements Comparator<Beer> {

  @Override
  public int compare(Beer arg0, Beer arg1) {  
   
    if (arg0.abv > arg1.abv) {
      return 9;
    }
    
    else if (arg0.abv < arg1.abv) {
      return -13;
    }
    return 0;
  }

}
