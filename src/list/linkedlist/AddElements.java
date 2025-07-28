package list.linkedlist;

import java.util.LinkedList;

public class AddElements {

  public static void main(String[] args) {
    LinkedList<String> animal = new LinkedList<>();
    System.out.println("Primary: " + animal);
    animal.add("Cow");
    animal.add("Tiger");
    animal.add("Crow");
    System.out.println("After add animals: ");
  }

}
