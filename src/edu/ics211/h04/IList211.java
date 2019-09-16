package edu.ics211.h04;

/**
 * An interface that lists the IList Methods.
 * @author Cam Moore
 * @param <E> the specified type of data
 *
 */

public interface IList211<E> {
  
  /**
   * Method returns an element at the specified position.
   * @param index the position of the data
   * @return E element in that index
   * 
   */
  
  E get(int index);
  
  
  /**
   * Method that sets the element at a specified location.
   * @param index the position of the data
   * @param element the specific type of element 
   * @return E element object 
   * 
   */
  
  E set(int index, E element);
  
  /**
   * Method that gives first occurence of specified element in list.
   * @param obj the element in the list
   * @return the first occurence in the list or -1 
   * 
   */
  
  int indexOf(Object obj);
  
  /** 
   * Method that gets the size of the list.
   * @return size the number of element in list
   * 
   */
  
  int size();
  
  /**
   * Appends a specified element E to the end of list.
   * @param e The element 
   * @return add if the method is true or not
   * 
   */
  
  boolean add(E e);
  
  /**
   * Appends an element at the specified location.
   * @param index the specified location 
   * @param element the object to be added
   * 
   */
  
  void add(int index, E element);
  
  /**
   * Removes an object at the specified location.
   * @param index the specified location 
   * @return E the element object to be removed
   * 
   */
  E remove(int index);
}