import java.util.HashMap;
import java.util.Map;


public class FirstExample {
    public static void main(String[] args) {
        HashMap <String, Integer> set = new HashMap<>();

        set.put("Gourab",16);
        set.put("Rana",17);
        set.put("Raja",18);
        set.put("Hopo",19);
        set.put("Pallabi",20);     // in this case the name is the key and the number is the value.
        set.put("Pallabi",21);     // key always be unique.
        set.put("budda",21);

        System.out.println("All key : " + set.keySet());
        System.out.println("All value : " + set.values());

        //get 
        System.out.println(set.get("Rana"));

        //size of the Hash map
        System.out.println("The size of the Hashmap " + set.size() );

        //contains 
        if(set.containsKey("Gourab")){
            System.out.println("Yes the Gourab is Present");
        }else{
            System.out.println("No! Gourab is not Present.");
        }

        System.out.println();

        // all key value 
        System.out.println("All key value pairs : ");

        for (Map.Entry<String,Integer> e : set.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }

}
