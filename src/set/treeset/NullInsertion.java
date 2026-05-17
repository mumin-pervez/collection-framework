package set.treeset;

import java.util.TreeSet;

public class NullInsertion {

  public static void main(String[] args) {
    TreeSet treeSet = new TreeSet();
    System.out.println(treeSet); // [ ]

    treeSet.add("CSE");
    treeSet.add("BBA");
    treeSet.add("ECE");
    System.out.println(treeSet); // [BBA, CSE, ECE]
    // treeSet.add(null); // Only one null value will be inserted
    treeSet.add("Apple");
    System.out.println(treeSet); // [ , Apple, BBA, CSE, ECE]
   // treeSet.add(null); // Only one null value will be inserted
    treeSet.add("BBA"); // Duplicates will not be inserted
    System.out.println(treeSet); // [ , Apple, BBA, CSE, ECE]
  }

}
