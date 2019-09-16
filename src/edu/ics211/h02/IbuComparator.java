package edu.ics211.h02;

import java.util.Comparator;

public class IbuComparator implements Comparator<Beer> {

  @Override
  public int compare(Beer arg0, Beer arg1) {
    if(arg0.ibu > arg1.ibu) {
      return arg1.ibu - arg0.ibu;
    }
    return 0;
  }
  
}
