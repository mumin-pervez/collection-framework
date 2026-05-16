package set.hashset;

import java.util.HashSet;

public class AddElements {

  public static void main(String[] args) {
    // 1. Default Constructor
    // Initial capacity = 16, Load factor = 0.75
    HashSet<String> hashSet = new HashSet<>();

    // Adding elements where order is not preserved
    hashSet.add("Date");
    hashSet.add("Apple");
    hashSet.add("Banana");
    hashSet.add("Cherry");
    // Duplicates are not allowed.
    // If we try to insert a duplicate, we won’t get any compile-time or runtime error
    // The add() method simply returns false.
    hashSet.add("Date");
    System.out.println(hashSet); // [Apple, Cherry, Date, Banana]
  }

}
