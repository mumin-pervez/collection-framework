package cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCursor {

  public static void main(String[] args) {
    // Creating an ArrayList
    ArrayList<Integer> al = new ArrayList();

    // Adding some objects to the ArrayList
    for (int i = 1; i <= 10; i++) {
      al.add(i);
    }
    // Showing the objects
    System.out.println(al); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    // Creating Iterator
    Iterator itr = al.iterator();
    // Showing the objects by using iterator one by one
    while (itr.hasNext()) {
      Integer itrNo = (Integer) itr.next();
      System.out.println(itrNo);
    }

  }

}
