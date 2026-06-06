package map;

import java.util.HashMap;
import java.util.Map;

public class ObjectCreationMap {

  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("Sadman", 11);
    map.put("Sabbir", 10);
    map.put("Kamruzzaman", 5);
    System.out.println(map);
  }

}
