package list.vector;

import java.util.Vector;

public class AddElementVector {

  public static void main(String[] args) {
    Vector v = new Vector();
    for (int i = 1; i <= 10; i++) {
      v.addElement(i);
    }
    System.out.println(v.capacity()); // Initial capacity: 10
    v.add("A");
    System.out.println(v.capacity()); // After adding another, capacity will be 20
    System.out.println(v);
  }

}
