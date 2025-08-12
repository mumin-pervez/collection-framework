package set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

  public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    set.add("Mumin");
    set.add("Anik");
    set.add("Topu");
    set.add("Topu"); // Duplicates are not allowed. Show only one data
    System.out.println(set);
    System.out.println("Total elements : "+set.size());
  }
}
