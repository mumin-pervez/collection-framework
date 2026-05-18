package set.treeset;

import java.util.TreeSet;

public class HomogeneousObjects {

  public static void main(String[] args) {
    TreeSet treeSet = new TreeSet();
    treeSet.add(new StringBuffer("A"));
    treeSet.add(new StringBuffer("Z"));
    treeSet.add(new StringBuffer("B"));
    treeSet.add(new StringBuffer("L"));
    System.out.println(treeSet);
  }

}
