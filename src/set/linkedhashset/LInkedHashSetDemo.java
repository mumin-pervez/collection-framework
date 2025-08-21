package set.linkedhashset;

import java.util.LinkedHashSet;

public class LInkedHashSetDemo {

  public static void main(String[] args) {
    LinkedHashSet lhs = new LinkedHashSet();
    lhs.add("A");
    lhs.add("E");
    lhs.add("I");
    lhs.add("O");
    lhs.add("U"); // Insertion order is preserved in LinkedHashSet
    lhs.add(null); // One null insertion is possible
    lhs.add(108);
    lhs.add(108); // Duplicates are not allowed in LinkedHashSet
    System.out.println(lhs);
  }
}

/*
Output
    [A, E, I, O, U, null, 108]

    */
