package set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class StringTreeSetCustomizedSortingOrder {

  public static void main(String[] args) {
    TreeSet treeSet = new TreeSet(new MyComparatorString());
    treeSet.add("Kundu");
    treeSet.add("Anik");
    treeSet.add("Abdullah");
    treeSet.add("Moyeen");
    treeSet.add("Zhaheer");
    treeSet.add("Bashir");
    System.out.println("Descending Order");
    System.out.println(treeSet);
  }
}

class MyComparatorString implements Comparator {

  @Override
  public int compare(Object o1, Object o2) {
    String s1 = (String) o1;
    String s2 = (String) o2;
    return s2.compareTo(s1);
  }
}
