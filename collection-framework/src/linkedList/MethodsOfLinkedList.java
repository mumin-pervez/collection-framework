package linkedList;

import java.util.LinkedList;

public class MethodsOfLinkedList {

  public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>(); // Creating object of the class linked list

    ll.add("Abbas");
    ll.add("Nasrin");
    ll.addFirst("Nabil");
    ll.addLast("Habiba");
    ll.add(2, "Kalpana");
    ll.addFirst("Nabil"); // Duplicates are allowed

    System.out.println(ll);

    ll.remove("Nabil");
    ll.remove(4);
    System.out.println(ll);
    ll.removeFirst();

    System.out.println(ll);

  }

}
