package list.linkedlist;

import java.util.LinkedList;

public class UpdatingElementLL {

  public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>();
    // Let's add elements in the linkedList
    ll.add("Monika");
    ll.add("Anik");
    ll.add("Robi");
    ll.add("Kader");
    System.out.println("Initial LinkedList: " + ll);

    // updating the value at index 1
    ll.set(1, "Nobir");
    System.out.println("Updated LinkedList: " + ll);
  }
}

/*
Output
    Initial LinkedList: [Monika, Anik, Robi, Kader]
    Updated LinkedList: [Monika, Nobir, Robi, Kader]
    */
