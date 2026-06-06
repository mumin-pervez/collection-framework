package map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class AddObjInHashMap {

  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(101, "Medicine (Male)");
    map.put(102, "Medicine (Female)");
    map.put(305, "X-Ray Room");
    map.put(212, "Laboratory");
    System.out.println(map);
  }

}
