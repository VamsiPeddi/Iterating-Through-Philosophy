//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: Iterating through philosophy
// Files: TestDriver.java, EvenNumbers.java, InfiniteIterator.java, FiniteIterator.java,
//////////////////// Generator.java, NextWikiLink,java
// Course: CS 300 Spring 2019
//
// Author: Vamsi Peddi
// Email: vpeddi@wisc.edu 
// Lecturer's Name: Mouna Kacem
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name: (name of your pair programming partner)
// Partner Email: (email address of your programming partner)
// Partner Lecturer's Name: (name of your partner's lecturer)
//
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
// ___ Write-up states that pair programming is allowed for this assignment.
// ___ We have both read and understand the course Pair Programming Policy.
// ___ We have registered our team prior to the team registration deadline.
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully
// acknowledge and credit those sources of help here. Instructors and TAs do
// not need to be credited here, but tutors, friends, relatives, room mates,
// strangers, and others do. If you received no outside help from either type
// of source, then please explicitly indicate NONE.
//
// Persons: none
// Online Sources: -
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

import java.util.Iterator;

public class FiniteIterator <MyType extends Comparable<MyType>> implements Iterator<MyType> {

  /*
   * Local variables;
   */
  private InfiniteIterator<MyType> infinite;
  private int numOfIterations;
  private int counter = 0;
  
  /*
   * 
   * Constructor for this class, initializes the Iterator and Length of the finite Iterator 
   */
  
  public FiniteIterator(InfiniteIterator<MyType> iterator, int num) {
    this.infinite = iterator;
    this.numOfIterations = num;
  }
  
  @Override
  /*
   * (non-Javadoc) return false when next() is called more times than the given length 
   * @see java.util.Iterator#hasNext()
   */
  public boolean hasNext() {
    if (counter < numOfIterations) {
    return true;
    }
    else {
      return false;
    }
  }
  
  /*
   * (non-Javadoc) Uses value of Iterator and calls the next() method for the given Iterator. 
   * @see java.util.Iterator#next()
   */
  @Override
  public MyType next() {
    counter++;
    return infinite.next();
  }
}
