package cursor;

import java.util.Enumeration;
import java.util.Vector;

public class CursorDemo {

  public static void main(String[] args) {
    Vector v = new Vector();
    for (int i = 1; i <= 10; i++) {
      v.addElement(i);
    }
    System.out.println(v); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    //Now we will implement the Enumeration concept
    Enumeration e = v.elements();
/*    while (e.hasMoreElements()) {
      System.out.print(e.nextElement() + " "); //1 2 3 4 5 6 7 8 9 10
    }*/
    System.out.println("Even numbers ");
    while (e.hasMoreElements()) {
      Integer number = (Integer) e.nextElement();
      if (number % 2 == 0) {
        System.out.print(number+" ");
      }
    }

  }

}
