package set.hashset;

import java.util.HashSet;

public class DuplicateEntry {

  public static void main(String[] args) {
    HashSet<String> hashSet = new HashSet<>();
    hashSet.add("CSE");
    hashSet.add("CSE");
    System.out.println(hashSet);
    System.out.println(hashSet.add("BBA")); // It will show true
    System.out.println(hashSet.add("BBA")); // It will show false
  }

}

// In a HashSet, duplicates are not allowed.
// If we try to insert a duplicate, we won’t get any compile-time or runtime error,
// The add() method simply returns false.