package list.linkedlist;

import java.util.LinkedList;

public class AddElementLL {

  public static void main(String[] args) {
    LinkedList<String> animal = new LinkedList<>();
    System.out.println("Primary: " + animal); //Primary: []
    animal.add("Cow");
    animal.add("Tiger");
    animal.add("Crow");
    System.out.println("After add animals: " + animal);
    //Output: After add animals: [Cow, Tiger, Crow]

    //Adding element in the specific location
    animal.add(1, "Elephant");
    System.out.println("After element added: " + animal);
    //Output: After element added: [Cow, Elephant, Tiger, Crow]
  }
}
