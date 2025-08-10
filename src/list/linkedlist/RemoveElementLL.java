package list.linkedlist;

import java.util.LinkedList;

public class RemoveElementLL {

  public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>();
    ll.add("Apple");
    ll.add("Banana");
    ll.add("Vegetable");
    ll.add("Curry");
    ll.add("Curry");
    ll.add("Apple");
    ll.add("Orange");
    System.out.println("Primary linked list: " + ll);

    ll.remove(2);
    System.out.println("Remove element using index : " + ll);
    ll.remove("Curry");
    // first matched element will be removed only from the list
    System.out.println("Remove element using value : " + ll);

    ll.add(0, "Mango");
    System.out.println("Mango is added at the index 0" + ll);
    System.out.println();


  }

}

/*
Output
  Primary linked list: [Apple, Banana, Vegetable, Curry, Curry, Apple, Orange]
  Remove element using index : [Apple, Banana, Curry, Curry, Apple, Orange]
  Remove element using value : [Apple, Banana, Curry, Apple, Orange]
  Mango is added at the index 0[Mango, Apple, Banana, Curry, Apple, Orange]
    */
