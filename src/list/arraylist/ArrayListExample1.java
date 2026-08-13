package list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {

  public static void main(String[] args) {
    List<String> cart = new ArrayList<>();
    cart.add("Laptop");
    cart.add("Mouse");
    cart.add("Monitor");
    cart.add("Keyboard");
    System.out.println("Cart size: " + cart.size());

    cart.add("USB Cable");
    cart.add("USB Hub");
    cart.add("Mouse");
    System.out.println("Cart size: " + cart.size());

    cart.remove("Mouse");
    System.out.println("Cart size: " + cart.size());
    boolean hasMonitor = cart.contains("Monitor");
    System.out.println("Contains Monitor? " + hasMonitor);
    System.out.println("Total Cart Items");
    System.out.println("========================");
    for (String cartItem : cart) {
      System.out.println(cartItem);
    }

    cart.add("Headphone");
    cart.add("Charger");
    cart.add("Mousepad");
    System.out.println("Cart size: " + cart.size());
    // Remove the Keyboard from the cart
    cart.remove("Keyboard");
    System.out.println("Cart size: " + cart.size());
    for (String myCartList : cart) {
      System.out.println(myCartList);
    }

  }

}
