package list.linkedlist;

import java.util.LinkedList;

public class DemoLinkedList {

  public static void main(String[] args) {
    LinkedList<String> llFruits = new LinkedList<>();
    llFruits.add("Mango");
    llFruits.add("Banana");
    llFruits.add("Grape");
    llFruits.add("Berry");
    llFruits.add("Apple");
    llFruits.add("Mango");
    System.out.println("Length of the list: "+llFruits.size());
    System.out.println(llFruits);
  }

}
