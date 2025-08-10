package list.linkedlist;

import java.util.LinkedList;

public class IteratingInLL {

  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.add("CSE");
    list.add("BBA");
    list.add("ECE");
    list.add("CSE"); // duplicate in allowed in LinkedList
    System.out.println("Total elements: " + list.size());
    System.out.println("Initial List: " + list);

    // Iterating using for loop
    System.out.println("Iterating using for loop");
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }

    // Iterating using for-each loop
    System.out.println("\nIterating using for-each loop");
    for (String myList : list) {
      System.out.print(myList + " ");
    }

  }

}
