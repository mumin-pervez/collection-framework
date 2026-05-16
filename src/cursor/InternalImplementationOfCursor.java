package cursor;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class InternalImplementationOfCursor {

  public static void main(String[] args) {
    Vector v = new Vector();

    Enumeration enumeration = v.elements();
    Iterator iterator = v.iterator();
    ListIterator listIterator = v.listIterator();

    System.out.println(enumeration.getClass().getName());
    System.out.println(iterator.getClass().getName());
    System.out.println(listIterator.getClass().getName());
  }
}
/*
Output:
    java.util.Vector$1
    java.util.Vector$Itr
    java.util.Vector$ListItr
*/
