import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
    HashMap<String, Integer> examScore = new HashMap<String, Integer>();

      examScore.put("Math", 75);
      examScore.put("Biology", 56);
      examScore.put("Polish", 98);
      examScore.put("English", 92);
      examScore.put("EA", 95);

      //For Each method
      examScore.forEach((subject, score) -> {
        examScore.replace(subject, score-10);
      });  
      System.out.println(examScore.toString());

      //Check if item exisist by value
      //System.out.println(examScore.containsValue(98));
      //or
      //System.out.println(examScore.containsValue(Integer.valueOf(100)));

      //Check if item exists in HashMap by key
      //System.out.println(examScore.containsKey("Math"));

      
      //Removing item by key
      //examScore.remove("Biology");

      //Checking size of HashMap
     //System.out.println(examScore.size());

      //Replacing value
      //examScore.replace("Math", 100);

      // Adding value if not existing
      examScore.putIfAbsent("Acrobatic", 75)  ;
      System.out.println(examScore.toString());


    //Get value by the key 
     // System.out.println(examScore.get("Math"));
    }}
