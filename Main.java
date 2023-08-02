import java.util.Arrays;

 class Main {
 
    public static void main(String[] args) {
    
        //char vowels[] = new char[5];
        char vowelsNew[] = {'e','u','a','o','i'};

        
        char key ='o';
        Arrays.sort(vowelsNew);

        //findin index of looking element
        int foundItemIndex = Arrays.binarySearch(vowelsNew, key);


        // // Print Array
         System.out.println(Arrays.toString(vowelsNew));
        
        // Print looking letter in the array
        System.out.printf("The looking letter is - %c -", vowelsNew[foundItemIndex]);
        // //Lenght of array
        // System.out.println(vowelsNew.length);
  
    }
}

  // // a e i o u
    //     vowels[0] = 'a';
    //     vowels[1] = 'e';
    //     vowels[2] = 'u';
    //     vowels[3] = 'o';
    //     vowels[4] = 'u';