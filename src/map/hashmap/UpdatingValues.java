package map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class UpdatingValues {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("Medicine", "Dr. Manirul Islam");
    map.put("Orthopedic", "Dr. Aminur Rashid");
    map.put("Medicine", "Dr. Shaharia Kabir");
    map.put("Medicine", "Dr. Shaharia Kabir"); //Duplicate data can be inserted but not printed
    System.out.println(map);
    map.put(new String("Medicine"), "Dr. Anup Kumar");
    System.out.println(map);
  }

}
