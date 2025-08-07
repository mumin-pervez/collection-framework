package list.arraylist;

import java.util.ArrayList;

public class RemovingElementTimeComplexityAL {

  public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Orange");
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Apple");
    System.out.print("List of fruits : " + fruits);
    //Output: List of fruits : [Orange, Apple, Banana, Apple]

    //Remove the element at index 1, value is Apple
    String listAfterRemove = fruits.remove(1);
    System.out.println("\n" + "Element removed : " + listAfterRemove);
    System.out.println("List after remove element : " + fruits);

  }
}
