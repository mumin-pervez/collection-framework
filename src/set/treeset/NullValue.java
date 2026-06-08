package set.treeset;

import java.util.TreeSet;

public class NullValue {

  public static void main(String[] args) {
    TreeSet treeSet = new TreeSet();
    //treeSet.add(null);  // NullPointerException - not allowed at all
    treeSet.add("Medicine");
    treeSet.add("Gynae");
    treeSet.add(null); // NullPointerException - not allowed at all
    System.out.println(treeSet);
  }

}
