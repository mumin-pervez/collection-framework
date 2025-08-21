package cursor;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class InternalImplementationClassOfCursors {

  public static void main(String[] args) {
    Vector v = new Vector();

    Enumeration enumeration = v.elements();
    Iterator i  = v.iterator();
    ListIterator li = v.listIterator();

    System.out.println("Implementation class of Enumeration: "+enumeration.getClass().getName()); //java.util.Vector$1
    System.out.println("Implementation class of Iterator: "+i.getClass().getName()); //java.util.Vector$Itr
    System.out.println("Implementation class of ListIterator: "+li.getClass().getName());  //java.util.Vector$ListItr
  }

}
/*
Output:
    Implementation class of Enumeration: java.util.Vector$1
    Implementation class of Iterator: java.util.Vector$Itr
    Implementation class of ListIterator: java.util.Vector$ListItr

    */
