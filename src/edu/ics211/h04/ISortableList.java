package edu.ics211.h04;

import java.util.Comparator;

/**
 * @author Cam Moore
 * Inserted the comments for checkstyle myself. 
 * The codes itself were from Professor Moore.
 * An interface carrying the different sortable methods.
 * @param <E> the object
 */

public interface ISortableList<E>{
  /** 
   * Sorts an array an object at a time.
   * @param compare the type of object.
   */
  void insertionSort(Comparator<E> compare);
  
  /**
   * Sorts an array if they are in the wrong order.
   * @param compare element to be compared
   */
  void bubbleSort(Comparator<E> compare);
  
  /**
   * Sorts an array to find the minimum element.
   * @param compare the element to be compared.
   */
  void selectionSort(Comparator<E> compare);
  
  /**
   * Gets the amount of swap.
   * @return the int type of amount of swap
   * 
   */
  int getNumberOfSwaps();
  
  /**
   * Gets the amount of comparison operated.
   * @return int type of comparison
   * 
   */
  int getNumberOfComparisons();
  
  /**
   * Gets the time taken to sort the certain element.
   * @return double type of time
   *  
   */
  double getSortTime();
}