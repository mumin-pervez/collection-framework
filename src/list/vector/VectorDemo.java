package list.vector;

import java.util.Vector;

public class VectorDemo {

  public static void main(String[] args) {
    Vector<String> vector = new Vector<>();
    System.out.println("Initial capacity: " + vector.size());
    //Adding elements in the vector
    vector.add("Cat");
    vector.add("Zebra");
    vector.add("Monkey");
    vector.add("Monkey");
    vector.add(1, "Cow");
    System.out.println(vector); //[Cat, Cow, Zebra, Monkey, Monkey]
    System.out.println("After adding elements capacity is : " + vector.size());

    // Remove elements
    vector.removeLast();
    System.out.println("After removing last element capacity is : " + vector.size());
    for (int i = 0; i < vector.size(); i++) {
      System.out.print(vector.get(i) + " ");
    }

  }

}
