package set.treeset;

import java.util.TreeSet;

public class AddTreeSetElements {

  public static void main(String[] args) {
    //Creating TreeSet elements
    TreeSet treeSet = new TreeSet();
    treeSet.add("A");
    treeSet.add("B");
    treeSet.add("a");
    treeSet.add("Z");
    treeSet.add("M");
    treeSet.add("A");
    System.out.println(treeSet); // [A, B, M, Z, a]
  }

}
