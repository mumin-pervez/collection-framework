package map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class UpdateValueOfObject {

  public static void main(String[] args) {
    Map<Integer, String> roll = new HashMap<>();
    //Adding elements
    roll.put(1, "Razin");
    roll.put(3, "Rathin");
    roll.put(4, "Rabu");
    roll.put(5, "Sun");
    System.out.println(roll);
    //Update the value where key is 4 and value is Rabu
    roll.put(new Integer(4), "Nahid");
    System.out.println("After updating");
    System.out.println(roll);


  }

}
