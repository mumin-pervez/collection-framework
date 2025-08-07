package collection;

import java.util.ArrayList;
import java.util.Collection;

public class AddElements {

  public static void main(String[] args) {
    //Creating an empty ArrayList with an initial capacity
    Collection<Integer> ll = new ArrayList<>(5);
    //use add() method to add elements in the list
    ll.add(1);
    ll.add(5);
    ll.add(3);
    ll.add(7);
    ll.add(5);

    //Print all the element available in the arraylist
    for (int i : ll) {
      System.out.println(i);
    }
  }

}
/*
Output:
    1
    5
    3
    7
    5*/
