import java.util.Arrays;
public class ArraysTest {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5};
        //Lenght of the same array
        int copyofNumbers[]=Arrays.copyOf(numbers, numbers.length);
        //Lenght specified 
        //int copyofNumbers1[]=Arrays.copyOf(numbers, 10);

        //Replacing elements of the Array
        //Arrays.fill(numbers, 0);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyofNumbers));

        //Check if the arrays are the same
        System.out.println(Arrays.equals(numbers, copyofNumbers));



        char vowels[] = new char[5];
        char vowelsNew[] = {'e','u','a','o','i'};

        //Filling array with values
       Arrays.fill(vowelsNew, 'x');
       System.out.print(vowelsNew);

        //Filling array with values in certain indexes
        int start = 1;
        int end = 2;
        Arrays.fill(vowelsNew,1,2, 'x');
        System.out.print(Arrays.toString(vowelsNew));

        char key ='o';
        Arrays.sort(vowelsNew);

        //findin index of looking element
        int foundItemIndex = Arrays.binarySearch(vowelsNew, key);


        // // Print Array
         System.out.println(Arrays.toString(vowelsNew));
        
        // Print looking letter in the array
        System.out.printf("The looking letter is - %c -", vowelsNew[foundItemIndex]);
        //Lenght of array
        System.out.println(vowelsNew.length);
  
    }
}

  // // a e i o u
    //     vowels[0] = 'a';
    //     vowels[1] = 'e';
    //     vowels[2] = 'u';
    //     vowels[3] = 'o';
    //     vowels[4] = 'u';


