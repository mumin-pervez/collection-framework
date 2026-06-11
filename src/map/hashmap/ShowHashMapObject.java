package map.hashmap;

import java.util.HashMap;

public class ShowHashMapObject {

  public static void main(String[] args) {
    HashMap hm = new HashMap();
    hm.put("Medicine", 400);
    hm.put("Gynae", 500);
    hm.put("Pediatric", 300);
    System.out.println(hm); // {Medicine=400, Gynae=500, Pediatric=300}
  }

}
