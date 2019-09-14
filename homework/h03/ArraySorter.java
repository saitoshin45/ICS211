/**
 * ArraySorter.java
 */

package edu.ics211.h03;

import java.util.Comparator;

/**
 * A generic class that sorts the arrays by implementing SortsArray.
 * @author Shinya Saito
 * @param <E> the type
 * 
 */

public class ArraySorter<E> implements SortsArray<E> {
  private long startTime;
  private long estimateTime;
  private int comparison;
  private int swap;
  private double time;
  /**
   * Sorts the data using the insertion sort method.
   * @param data the data that is being compared 
   * @param compare comparing method
   */
  
  public void insertionSort(Comparator<E> compare, E[] data)
  {
    this.swap = 0;
    this.comparison = 0;
    startTime = System.nanoTime();
    //loop from 1 to data.length - 1
    for (int i = 1; i < data.length; i++) {
      E item = data[i];
      int j = i;
      
      //found this at https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html 
      while (j > 0 && compare.compare(data[j - 1], item) > 0) {
        comparison++;
        data[j] = data[j - 1];
        swap++;
        j--;
        
      }
      if (j > 0) {
        comparison++;
      }
      if (j != i) {
        data[j] = item;
        swap++;
      }
      
      data[j] = item;
    }
    
    long finalTime = System.nanoTime();
    estimateTime = finalTime - startTime;
    this.time = estimateTime / 1.0;
    System.out.println(time);
  }
  
  /**
   * Sorts the array data using the bubble sort.
   * @param data The data that is being compared 
   * @param compare the item that is being compared to 
   */
  
  //do while loop for the bubble sort method 
  
  @Override
  public void bubbleSort(Comparator<E> compare, E[] data) {
    // TODO Auto-generated method stub
    this.comparison = 0;
    this.swap = 0;
    startTime = System.nanoTime();
    boolean exchange = false;
    int pass = 0;
    
    do {
      exchange = false;
      
      for (int i = 1; i < data.length - pass; i++) {
        int x = compare.compare(data[i - 1],  data[i]);
        comparison++;
        if (x > 0) {
          E temp = data[i];
          data[i] = data[i - 1];
          data[i - 1] = temp;
          exchange = true;
          swap++;
        }
      }
      pass++;
    } while (exchange);
    long finishTime  = System.nanoTime();
    estimateTime = finishTime - startTime;
    System.out.println(estimateTime);
    
  }
  
  /**
   * Sorts the data using the selectionSort method.
   * @param compare the objects that is being compared 
   * @param data the beer that is being compared 
   */
  
  public void selectionSort(Comparator<E> compare, E[] data) {
    comparison = 0;
    swap = 0;
    startTime = System.nanoTime();
    int min;
    
    for (int i = 0; i < data.length; i++) {
      min = i;
      for (int j = i + 1;  j < data.length; j++) {
        comparison++;
        if (compare.compare(data[j] , data[min]) < 0) {
          min = j;
          swap++;
        }
      }
      E temp = data[min];
      data[min] = data[i];
      data[i] = temp;
    }
    
    long finishTime = System.nanoTime();
    estimateTime = finishTime - startTime;
    System.out.println(estimateTime);  
  }
  /**
   * Gets number of comparisons.
   * @return comparison
   */
  
  public int getNumberofComparisons() {
    return comparison; 
  }
  
  /**
   * Gets the number of swaps.
   * @return swap
   */
  
  public int getNumberofSwaps() {
    return swap;
  }
  
  /**
   * Gets the estimated time.
   * @return estimateTime 
   * 
   */
  
  public double getSortTime() {
    return estimateTime;
  }

  /**
   * Gets the number of swap.
   * @return swap
   * 
   */

  @Override
  public int getNumberOfSwaps() {
    // TODO Auto-generated method stub
    return swap;
  }

  /**
   * Gets the number of comparison.
   * @return comparison 
   * 
   */
  
  @Override
  public int getNumberOfComparisons() {
    // TODO Auto-generated method stub
    return comparison;
  }

}
