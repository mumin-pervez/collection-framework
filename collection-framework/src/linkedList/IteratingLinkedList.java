package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratingLinkedList {

  public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>();
    ll.add("Mango");
    ll.add("Jack-fruit");
    ll.add("Apple");
    ll.add("Banana");
    ll.add("Berry");

    // Iterating element using basic for loop and get() method
    System.out.println("Iterating element using basic for loop and get() method");
    for (int i = 0; i < ll.size(); i++) {
      System.out.println(ll.get(i));
    }

    // Iterating element using iterate() method
    System.out.println("Iterating element using iterate() method");
    Iterator<String> itr = ll.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

  }

}
