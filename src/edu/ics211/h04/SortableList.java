package edu.ics211.h04;

import edu.ics211.h03.ArraySorter;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Implements IList211 and ISortableList.
 * @author Shinya Saito
 * @param <E>
 *
 */
public class SortableList<E> implements IList211<E>, ISortableList<E> {
  //variable declaration
  private E[] data;
  private int size;
  private int swapAmount;
  private int compareAmount;
  private int timeTaken; 
  private ArraySorter<E> sorter = new ArraySorter<E>();
  
  /** 
   * Sorts an array an object at a time.
   * @param compare the type of object.
   */
  
  @Override
  public void insertionSort(Comparator<E> compare) {
    // TODO Auto-generated method stub
    
  }
  
  /**
   * Sorts an array if they are in the wrong order.
   * @param compare element to be compared
   */
  
  @Override
  public void bubbleSort(Comparator<E> compare) {
    // TODO Auto-generated method stub
    
  }
  
  /**
   * Sorts an array to find the minimum element.
   * @param compare the element to be compared.
   */

  @Override
  public void selectionSort(Comparator<E> compare) {
    // TODO Auto-generated method stub
    
  }
  
  /**
   * Gets the amount of swap.
   * @return the int type of amount of swap
   * 
   */

  @Override
  public int getNumberOfSwaps() {
    // TODO Auto-generated method stub
    return swapAmount;
  }
  
  /**
   * Gets the amount of comparison operated.
   * @return int type of comparison
   * 
   */
  
  @Override
  public int getNumberOfComparisons() {
    // TODO Auto-generated method stub
    return compareAmount;
  }
  
  /**
   * Gets the time taken to sort the certain element.
   * @return double type of time
   *  
   */
  
  @Override
  public double getSortTime() {
    return (double) timeTaken;
  }
  
  /**
   * Method returns an element at the specified position.
   * @param index the position of the data
   * @return E element in that index
   * 
   */

  @Override
  public E get(int index) {
    //check if the index is in the bound 
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Index is not within range");
    }
    return data[index];
  }
  
  /**
   * Method that sets the element at a specified location.
   * @param index the position of the data
   * @param element the specific type of element 
   * @return E element object 
   * 
   */

  @Override
  public E set(int index, E element) {
    //check if the index is within the range 
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Index is not within range");
    }
    
    //save the old element and replace it 
    E input = data[index];
    data[index] = element;
    
    return input;
  }
  
  /**
   * Method that gives first occurence of specified element in list.
   * @param obj the element in the list
   * @return the first occurence in the list or -1 
   * 
   */

  @Override
  public int indexOf(Object obj) {
    for (int i = 0; i < size; i++) {
      if (obj.equals(data[i])) {
        return i;
      }
    }
    
    return -1;
    
  }

  /** 
   * Method that gets the size of the list.
   * @return size the number of element in list
   * 
   */
  
  @Override
  public int size() {
    return size;
  }

  /**
   * Appends a specified element E to the end of list.
   * @param e The element 
   * @return add if the method is true or not
   * 
   */
  @Override
  public boolean add(E e) { 
    
    return false;
  }
  
  /**
   * Appends an element at the specified location.
   * @param index the specified location 
   * @param element the object to be added
   * 
   */

  @Override
  public void add(int index, E element) {
    // TODO Auto-generated method stub
    
  }
  
  /**
   * Removes an object at the specified location.
   * @param index the specified location 
   * @return E the element object to be removed
   * 
   */

  @Override
  public E remove(int index) {
    // TODO Auto-generated method stub
    return null;
  }
  
  

}
