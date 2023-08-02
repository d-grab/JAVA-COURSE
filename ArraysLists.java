import java.util.ArrayList;

public class ArraysLists {
    //int , double, float, boolean ( PRIMITIVE TYPE)
    // Integer, Float, Boolean, (Wrapper class for the primitive type int)
    public static void main(String[] args) {

     ArrayList<Integer> numbers = new ArrayList<Integer>();

        //Adding Elements to an ArrayLists
        numbers.add(5);
        numbers.add(2);
        numbers.add(1);
        numbers.add(6);
        numbers.add(5);

        System.out.println("Before"+numbers.toString());

        //For Each loop and Setting new values to new array
        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number*2);
            
        });

        System.out.println("After"+numbers.toString());


        //Check if the value exists in the ArrayList (Boolean value)
        //System.out.println(numbers.contains(Integer.valueOf(2)));


        //Checking size of an Array
        //System.out.println(numbers.size());

        //Reverse Order
        // numbers.sort(Comparator.reverseOrder());

        //Sort an Array
        //numbers.sort(Comparator.naturalOrder());

        // System.out.println(numbers.toString());

        //Replacing value
        //numbers.set(1, Integer.valueOf(100));

        //Clearing all ArrayList
        //numbers.clear();

        //Deleting by value
        //numbers.remove(Integer.valueOf(1));

        //Deleting Elements by Index from an ArrayLists
        //numbers.remove(1);
        
        //Printing ArraysList
        //System.out.println(numbers.toString());

        //Printing single value
        //System.out.println(numbers.get(1));
        
    }}

