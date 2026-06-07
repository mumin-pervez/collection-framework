package set.treeset;

import java.util.TreeSet;

public class TreeSetAscendingSortingOrder {

  public static void main(String[] args) {
    TreeSet treeSet = new TreeSet();
    treeSet.add(2);
    treeSet.add(7);
    treeSet.add(9);
    treeSet.add(3);
    treeSet.add(5);
    treeSet.add(5); //Duplicates are not added
    System.out.println("Natural Sorting Order: Ascending");
    System.out.println(treeSet); //Output: [2, 3, 5, 7, 9]
    TreeSet t = new TreeSet();
    t.add("Banana");
    t.add("Apple");
    t.add("Chery");
    t.add("Dorian");
    t.add("Orange");
    System.out.println("Natural Sorting Order: Alphabetically");
    System.out.println(t);
  }

}
