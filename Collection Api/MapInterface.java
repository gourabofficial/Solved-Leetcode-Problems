
import java.util.HashMap;
import java.util.Map;


public class MapInterface {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Rana",1);
        map.put("Raja",2);
        map.put("Buddha",3);    
        map.put("Rahul",4);
        map.put("hopo",5);       
       
        System.out.println ( "The map size: " + map.size()); 
        System.out.println(map.get("Rana"));

        for (String str : map.keySet()) {
            System.out.println("Key: " + str + ", Value: " + map.get(str));
        }
        
    }

}
