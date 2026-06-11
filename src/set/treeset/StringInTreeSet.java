package set.treeset;

import java.util.TreeSet;

public class StringInTreeSet {

  public static void main(String[] args) {
    TreeSet ts = new TreeSet();
    ts.add("Robiul");
    ts.add("Zhaheer");
    ts.add("Anik");
    ts.add("Benu");
    ts.add("Nury");
    System.out.println(ts);
    // [Anik, Benu, Nury, Robiul, Zhaheer] natural sorting order: Alphabetical

  }

}
