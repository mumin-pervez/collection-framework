package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class AddList {

  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Mumin");
    names.add("Sabbir");
    names.add("Arnob");
    names.add("Rakib");
    names.add("Shimul");

    // Showing the elements in the array list
    System.out.println(names);

    // Traversing element by using for loop
    System.out.println("Traversing element by using for loop");
    for (int i = 1; i < names.size(); i++) {
      System.out.println(names.get(i));
    }

    // Traversing element by using foreach loop
    System.out.println("Traversing element by using foreach loop");
    for (String element : names) {
      System.out.println(element);
    }
    // Traversing element by using foreach loop
    System.out.println("Traversing element by using iteration");
    Iterator<String> itr = names.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }

}
