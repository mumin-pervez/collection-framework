package list.linkedlist;

import java.util.LinkedList;

public class LinkedListToArray {

  public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>();
    ll.add("Mango");
    ll.add("Orange");
    ll.add("Apple");
    ll.add("Banana");
    System.out.print("Initial List : " + ll + " ");
    System.out.println();

    // Convert to array using toArray() method
    //
    Object[] arrayElements = ll.toArray();
    System.out.println("Converted list from LinkedList to Array");
    for (Object myElements : arrayElements) {
      System.out.print(myElements + " ");
    }
  }
}

/*
Output
    Initial List : [Mango, Orange, Apple, Banana]
    Converted list from LinkedList to Array
    Mango Orange Apple Banana
    */
