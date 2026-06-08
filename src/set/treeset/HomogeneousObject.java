package set.treeset;

import java.util.TreeSet;

public class HomogeneousObject {

  public static void main(String[] args) {
    TreeSet ts = new TreeSet();
    ts.add("A"); //String implements Comparable
    ts.add("E");
    ts.add("I");
    ts.add("O");
    ts.add("U");

    // ts.add(10); // ClassCastException - heterogeneous
    System.out.println(ts); // [A, E, I, O, U]
  }

}
