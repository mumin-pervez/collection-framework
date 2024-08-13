package linkedList;

import java.util.LinkedList;

public class LinkedListToArray {

  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.add("Banana");
    list.add("Mango");
    list.add("Apple");
    list.add("Orange");
    System.out.println(list);
    // Converting LinkedList to Array using toArray() method
    Object[] ary = list.toArray();
    System.out.println("After converted LinkedList to Array");

    // Traversing array elements with for each loop
    for (Object obj : ary) {
      System.out.println(obj);
    }

  }

}
