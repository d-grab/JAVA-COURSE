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
        
        System.out.print("Enter first number ? \n" );
        double number1 = scanner.nextDouble();
        
        scanner.nextLine();
        System.out.print("Enter second number ? \n" );
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What operation you want to perform ? \n" );
        String operation = scanner.nextLine();

        if(operation.equals("sum")) {
            System.out.printf("%f + %f = %f", number1,number2,number1+number2);
        }else if (operation.equals("sub")) {
            System.out.printf("%f - %f = %f", number1,number2,number1-number2);}
        else if (operation.equals("div")) {
            if( number1==0){
                System.out.printf("You cant divide by 0");
            }else {
                System.out.printf("%f / %f = %f", number1,number2,number1/number2);}
            }
         else if (operation.equals("mul")){
            System.out.printf("%f *  %f = %f", number1,number2,number1*number2);
            
        }else {
            System.out.printf("%s Is not supported operation",operation);
        }
        

        scanner.close();
    }
}