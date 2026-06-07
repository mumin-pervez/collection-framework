package set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator {

  @Override
  public int compare(Object obj1, Object obj2) {
    Integer i1 = (Integer) obj1;
    Integer i2 = (Integer) obj2;
    if (i1 > i2) {
      return -1;
    } else if (i1 < i2) {
      return 1;
    } else {
      return 0;
    }
  }
}

public class TreeSetDescendingOrder {

  public static void main(String[] args) {
    TreeSet treeSet = new TreeSet(new MyComparator());
    treeSet.add(10);
    treeSet.add(0);
    treeSet.add(15);
    treeSet.add(5);
    treeSet.add(20);
    treeSet.add(20);
    System.out.println("Customized Sorting Order (Descending)");
    System.out.println(treeSet);
  }
}
