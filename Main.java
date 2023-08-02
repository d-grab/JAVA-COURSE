import java.util.Scanner;

class Main {
 
    public static void main(String[] args) {
    //     String name = new String ("Daniel");
    //     String country = new String ("daniel");

    //     String formattedString = String.format("My name is %s I am from %s",name,country);
    //     String newName= name.replace("Daniel", "Rambo");

    // //    System.out.println(formattedString);
    // //    System.out.println(name.equalsIgnoreCase(country));
    // //    System.out.println(newName);
    // //    System.out.println(formattedString.contains("My name"));

    //SCANNER INPUT

    Scanner scanner = new Scanner (System.in);
        
        System.out.println("What is your name ? \n" );
        String name = scanner.nextLine();

        System.out.printf(" \n Hello %s how old are You \n", name);
        int age = scanner.nextInt();

        //Clean the input buffer from nextInt() <enter key>
        scanner.nextLine();

        System.out.printf("\n %d Is a perfect age to start coding. What language You prefer \n", age);
        String language = scanner.nextLine();

        System.out.printf("\n %s Is very popular language", language);


        scanner.close();
    }
}