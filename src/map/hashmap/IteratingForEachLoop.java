package map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class IteratingForEachLoop {

  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    //Inserting data into Map
    map.put(101, "Dr. Murad Ahmed");
    map.put(105, "Dr. Asif Khan");
    map.put(103, "Dr. Manha Khanom");

    for (Map.Entry mapElement : map.entrySet()) {
      int key = (int) mapElement.getKey();
      //Finding the value
      String value = (String) mapElement.getValue();

      System.out.println(key + " : " + value);
    }
    System.out.println("Better Version");
    for (Map.Entry<Integer, String> mapElement : map.entrySet()) {
      int key = mapElement.getKey();
      String value = mapElement.getValue();
      System.out.println(key + " : " + value);
    }
  }

}
