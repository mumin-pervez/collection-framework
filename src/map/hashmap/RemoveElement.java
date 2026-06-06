package map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RemoveElement {

  public static void main(String[] args) {
    Map<String, Integer> roomWiseDoctor = new HashMap<>();
    roomWiseDoctor.put("Dr. Kibria Khan", 101);
    roomWiseDoctor.put("Dr. Nayela Nasir", 105);
    roomWiseDoctor.put("Dr. Anup Kumar", 103);
    roomWiseDoctor.put("Dr. Manir", 103);
    System.out.println(roomWiseDoctor);
    System.out.println("After Removing");
    roomWiseDoctor.remove("Dr. Manir");
    System.out.println(roomWiseDoctor);

  }

}
