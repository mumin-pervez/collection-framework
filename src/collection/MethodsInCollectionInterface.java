package collection;

import java.util.ArrayList;
import java.util.Collection;

public class MethodsInCollectionInterface {

  public static void main(String[] args) {
    Collection collection = new ArrayList();
    collection.add("Hello");
    collection.add(120);
    collection.add(909);
    collection.add(null);
    collection.add(789.37);
    collection.add(null);

    //int size() - Returns the number of elements
    int sizeOfCollection = collection.size();
    System.out.println("Number of elements : " + sizeOfCollection);

    //boolean isEmpty() - Returns true if empty
    boolean isEmpty = collection.isEmpty();
    System.out.println("Collection is empty ? : " + isEmpty);

    //boolean contains(Object o) - Checks if element exists
    boolean containsAnyElement = collection.contains(120);
    System.out.println("Is this available? : " + containsAnyElement);

    //boolean add(E e) - Adds an element (optional operation)
    boolean addItem = collection.add("Moyna");
    System.out.println("Add an item : " + addItem);
    System.out.println(collection);

    //boolean remove(Object o) - Removes an element (optional operation)
    boolean removeAnItem = collection.remove(120);
    System.out.println("The specific object is removed : " + removeAnItem);
    System.out.println(collection);
    System.out.println("Size after removal an item : " + collection.size());


  }

}
