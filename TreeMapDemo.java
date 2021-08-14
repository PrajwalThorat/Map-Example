import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        
        // in TreeMap by default All the keys are arranged in ascending order

        TreeMap<String, String> details = new  TreeMap<String, String>();
        // add objects as key value to the map
           details.put("sarath", "789076686087");
           details.put("ebinezer", "7890789090");// one entry
           details.put("kumar","6789678989"); // entry
    
           /*
              Key value always should be unique
              If try to add object with duplicate key
              then that key will be overridden with new value
           */
    
           details.put("kumar","890890765");

           System.out.println(details);

           NavigableMap<String,String> desDetails = details.descendingMap();
           System.out.println(desDetails);


    }
    
}
