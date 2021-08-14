import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        
       Map<String, String> details = new  HashMap<String, String>();
    // add objects as key value to the map
       details.put("ebinezer", "7890789090");// one entry
       details.put("kumar","6789678989"); // entry

       /*
          Key value always should be unique
          If try to add object with duplicate key
          then that key will be overridden with new value
       */

       details.put("kumar","890890765");

       System.out.println(details);


       String value = details.get("ebinezer");

       System.out.println(value);

       /*
           1. first retrive all the key values then using get()
       */

       Set<String> keys = details.keySet();

       for(String key: keys){
           System.out.println(details.get(key));
       }

       /*
           2. Can retrive only the values
       */

       Collection<String> values = details.values();

       System.out.println(values);

       /*
            3. to retreive all the values along with key
            
            What is an entry?
            Each element that you place in map is called an entry
       */

       Set<Map.Entry<String,String>> entires = details.entrySet();

       for(Map.Entry<String, String>  entry : entires){
           System.out.println(entry.getKey()+" "+ entry.getValue());
       }


       

    }
    
}
