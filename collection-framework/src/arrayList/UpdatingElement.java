package arrayList;

import java.util.ArrayList;

public class UpdatingElement {

  public static void main(String[] args) {
    // Creating an arraylist of String type
    ArrayList<String> names = new ArrayList<>();
    names.add("Roni");
    names.add("Feroz");
    names.add("Suraya");
    System.out.println("Initial ArrayList: " + names);

    names.set(0, "Musa");
    System.out.println("Updated ArrayList: " + names);
  }
}
