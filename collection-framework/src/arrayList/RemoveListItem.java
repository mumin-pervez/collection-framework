package arrayList;

import java.util.ArrayList;

public class RemoveListItem {

  public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<>(); // Creating list of fruits
    fruits.add("Mango");
    fruits.add("Apple");
    fruits.add("Lychee");
    fruits.add("Lychee");
    fruits.add("Banana");
    fruits.add("Banana");
    fruits.add("Pineapple");

    // Traversing item using foreach loop
    System.out.println("Traversing item using foreach loop");
    System.out.println("==================================");
    for (String item : fruits) {
      System.out.println(item);
    }

    //Remove an item from the ArrayList on the basis of specific position
    System.out.println("Removing element on the basis of specific position");
    System.out.println("==================================================");
    fruits.remove(2);
    for (String item : fruits) {
      System.out.println(item);
    }
    // Removing specific element from arraylist
    System.out.println("Removing specific element from arraylist");
    System.out.println("========================================");
    fruits.remove("Banana");
    for (String item : fruits) {
      System.out.println(item);
    }

    ArrayList<Integer> rolls = new ArrayList<>();
    rolls.add(17);
    rolls.add(28);
    rolls.add(41);
    System.out.println("Identified rolls : "+rolls);

    // Removing all elements from arraylist
    System.out.println("Removing all elements from arraylist");
    System.out.println("====================================");
    fruits.remove(rolls);
    System.out.println("All rolls are removed");


  }

}
