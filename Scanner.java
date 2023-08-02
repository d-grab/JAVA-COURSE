import java.util.Scanner;

class Scanner {
    
        public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
        
        System.out.println("What is your name ? \n" );
        String name = scanner.nextLine();

        System.out.printf(" \n Hello %s how old are You \n", name);
        int age = scanner.nextInt();

        //Clean the input buffer from nextInt() <enter key>
        // Or int age = Integer.parseInt(scanner.nextLine())
        scanner.nextLine();

        System.out.printf("\n %d Is a perfect age to start coding. What language You prefer \n", age);
        String language = scanner.nextLine();

        System.out.printf("\n %s Is very popular language", language);


        scanner.close();
}
}