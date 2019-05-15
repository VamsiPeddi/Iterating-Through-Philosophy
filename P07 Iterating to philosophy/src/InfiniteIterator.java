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

/*
 * Generic type class with Generic Parameters
 */
public class InfiniteIterator<MyType extends Comparable<MyType>> implements Iterator<MyType> {

  private MyType startingNum;
  private int counter = 0;
  private Function<MyType, MyType> fun;

  /*
   * Constructor for this class, initializes the first Value and Function that is being called
   */
  public InfiniteIterator(MyType num, Function<MyType, MyType> function) {
    this.startingNum = num;
    this.fun = function;
  }

  @Override
  public boolean hasNext() {
    // TODO Auto-generated method stub
    return true;
  }

  @Override
  /*
   * (non-Javadoc) Uses value of function and calls the apply() method from the given class.
   * @see java.util.Iterator#next()
   */
  public MyType next() {
    counter++;
    if (counter == 1) {
      return this.startingNum;
    } else {
      this.startingNum = fun.apply(startingNum);
      return this.startingNum;
    }
  }
}
