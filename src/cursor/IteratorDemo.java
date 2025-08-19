package cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("CSE");
    list.add("BBA");
    list.add("ECE");
    list.add("ABC");

    Iterator<String> itr = list.iterator();
    while (itr.hasNext()) {
      String department = itr.next();
      System.out.println(department);
      if (department.equals("ABC")) {
        itr.remove(); // Remove element from the iterator
      }
    }
    System.out.println("After removing an element : " + list);
  }

}
