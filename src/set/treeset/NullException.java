package set.treeset;

import java.util.TreeSet;

public class NullException {

  public static void main(String[] args) {
    TreeSet treeSet = new TreeSet();
    treeSet.add(null);
    System.out.println(treeSet); // NullPointerException
  }

}
