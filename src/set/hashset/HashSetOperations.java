package set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperations {

  public static void main(String[] args) {
    HashSet<String> fruits = new HashSet<>();
    // Adding elements to HashSet
    fruits.add("Banana");
    fruits.add("Apple");
    fruits.add("Mango");
    fruits.add("Apple"); // Duplicate will be not added.
    System.out.println("HashSet : " + fruits); // [Apple, Mango, Banana]

    // Check if element exists
    System.out.println("Contains Apple : " + fruits.contains("Apple")); // true

    // Remove element from the set
    fruits.remove("Mango");
    System.out.println("After removing Mange: " + fruits); // [Apple, Banana]

    // Size of the HashSet
    System.out.println("Size of HashSet is : " + fruits.size()); // 2

    //Iterate using iterator()
    Iterator<String> iterator = fruits.iterator();
    System.out.println("Iterate the HashSet elements using Iterator");
    System.out.println("===========================================");
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    //Clear all the elements from the HashSet
    fruits.clear();
    System.out.println("After clearing all elements using clear() method");
    System.out.println(fruits);

  }

}
