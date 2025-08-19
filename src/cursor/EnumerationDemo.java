package cursor;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
      al.add(i);
    }
    System.out.println(al); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    Vector v = new Vector();
    for (int i = 1; i <= 10; i++) {
      v.addElement(i);
    }
    System.out.println(v);
    Enumeration e = v.elements();
    System.out.println(e);
    System.out.println("Even numbers : ");
    while (e.hasMoreElements()) {
      Integer enumElements = (Integer) e.nextElement();
      if (enumElements % 2 == 0) {
        System.out.println(enumElements);
      }
    }
  }

}