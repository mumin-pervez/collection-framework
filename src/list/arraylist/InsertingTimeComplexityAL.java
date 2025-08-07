// Inserting Element in ArrayList is O(1)
package list.arraylist;

import java.util.ArrayList;

public class InsertingTimeComplexityAL {

  public static void main(String[] args) {
    ArrayList<String> addList = new ArrayList<>();
    addList.add("Mumin");
    addList.add("Pervez");
    addList.add("Mumin");
    addList.add("Topu");
    System.out.println(addList);

    addList.add("Anik");
    System.out.println("Added last: " + addList);
    System.out.println("Total elements: " + addList.size());

    //Inserting at a specific position
    addList.add(4, "Ali");
    System.out.println("Added in the 4th : " + addList);
    System.out.println("Total elements: " + addList.size());
  }
}
