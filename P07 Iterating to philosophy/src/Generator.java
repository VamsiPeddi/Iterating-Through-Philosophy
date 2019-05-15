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
import java.util.function.Function;

public class Generator<T extends Comparable<T>> implements Iterable<T> {

  /*
   * Local variables 
   */
  private T firstValue;
  private Function<T,T> genNextFromLast;
  private int length;
  private boolean a;

  /*
   * Constructor for this class which defines variables for Infinite Iterators 
   */
  public Generator(T firstValue, Function<T,T> generateNextFromLast) {
    this.firstValue = firstValue;
    this.genNextFromLast = generateNextFromLast;
    this.a = true;
  }
  
  /*
   * /*
   * Constructor for this class which defines variables for Finite Iterators 
   */
   
  public Generator(T firstValue, Function<T,T> generateNextFromLast, int length) {
    this.firstValue = firstValue;
    this.genNextFromLast = generateNextFromLast;
    this.length = length;
    this.a = false;
  }
  
  @Override
  /*
   * This method return either a Finite or Infinite Iterator based on which constructor is used; 
   */
  public Iterator<T> iterator() {
    if(a == true) {
    InfiniteIterator<T> infinite = new InfiniteIterator<>(this.firstValue, this.genNextFromLast);
    return infinite;
    }
    if (a == false) {
      InfiniteIterator<T> infinite = new InfiniteIterator<>(this.firstValue, this.genNextFromLast);
      FiniteIterator<T> it = new FiniteIterator<>(infinite, this.length);
      return it;
    }
    return null;
  }

}
