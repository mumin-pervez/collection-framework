package set.hashset;

import java.util.HashSet;

public class HashSetDemo {

  public static void main(String[] args) {
    HashSet h = new HashSet();
    h.add("A");
    h.add("E");
    h.add("I");
    h.add("O");
    h.add("U");
    h.add(null); // Null insertion is possible only once in HashSet
    h.add(10); // Heterogeneous objects can be added
    System.out.println(h);
    System.out.println(h.add("I")); // Duplicates are not allowed.
    System.out.println(h.add(null));

  }

}
