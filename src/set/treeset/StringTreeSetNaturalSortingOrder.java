package set.treeset;

import java.util.TreeSet;

public class StringTreeSetNaturalSortingOrder {

  public static void main(String[] args) {
    TreeSet t = new TreeSet();
    t.add("Biman");
    t.add("Kundu");
    t.add("Zia");
    t.add("Akash");
    t.add("Farukh");
    System.out.println(t); // Natural sorting order: Alphabetical
  }

}

//Output: [Akash, Biman, Farukh, Kundu, Zia]