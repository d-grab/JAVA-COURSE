import java.util.Scanner;

class ScannerTest {
    
        public static void main(String[] args) {
            

// } Scanner with If statement

//  Scanner scanner = new Scanner (System.in);
        
//         System.out.print("Enter first number ? \n" );
//         double number1 = scanner.nextDouble();
        
//         scanner.nextLine();
//         System.out.print("Enter second number ? \n" );
//         double number2 = scanner.nextDouble();
//         scanner.nextLine();

//         System.out.print("What operation you want to perform ? \n" );
//         String operation = scanner.nextLine();

//         if(operation.equals("sum")) {
//             System.out.printf("%f + %f = %f", number1,number2,number1+number2);
//         }else if (operation.equals("sub")) {
//             System.out.printf("%f - %f = %f", number1,number2,number1-number2);}
//         else if (operation.equals("div")) {
//             if( number1==0){
//                 System.out.printf("You cant divide by 0");
//             }else {
//                 System.out.printf("%f / %f = %f", number1,number2,number1/number2);}
//             }
//          else if (operation.equals("mul")){
//             System.out.printf("%f *  %f = %f", number1,number2,number1*number2);
            
//         }else {
//             System.out.printf("%s Is not supported operation",operation);
//         }
        

//         scanner.close();

  //SCANNER SWITCH

    Scanner scanner = new Scanner (System.in);
        
        System.out.print("Enter first number ? \n" );
        double number1 = scanner.nextDouble();
        
        scanner.nextLine();
        System.out.print("Enter second number ? \n" );
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What operation you want to perform ? \n" );
        String operation = scanner.nextLine();


        switch (operation) {
            case "sum":
                System.out.printf("%f + %f = %f", number1,number2,number1+number2);
                break;
            case "sub":
                System.out.printf("%f - %f = %f", number1,number2,number1-number2);
                break;
            case "div":
                if (number1 == 0 || number2 == 0){
                    System.out.printf("You cant divide by 0");
                }else {
                System.out.printf("%f / %f = %f", number1,number2,number1/number2);}
                break;
            case "mul":
                System.out.printf("%f *  %f = %f", number1,number2,number1*number2); 
                break;  
            default:
                System.out.printf("%s Is not supported operation",operation);
        scanner.close();
    }}}