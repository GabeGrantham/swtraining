import java.util.Scanner;

public class Calculator {
    public static void main(String ... args) {
        
        double answer = 0;
        boolean restart = true;
       
       while (restart == true) {
        System.out.println("What kind of operation do you want to use?");
        System.out.println("+ : Addition  - : Subtraction");
        System.out.println("x : Multiplication  / : Division");
        Scanner scan = new Scanner(System.in);
        String operation = scan.next();

        System.out.println("How many operations do you want to use?");
        int opcount = scan.nextInt();



        System.out.println("What is your first value?");
        double val1 = scan.nextDouble();


        System.out.println("What is your second value?");
        double val2 = scan.nextDouble();

        if (operation.equals("+")) {
            answer = val1 + val2;
        }

        else if (operation.equals("-")) {
            answer = val1 - val2;
        }

        else if (operation.equals("x")) {
            answer = val1 * val2;
        }
        
        else {
            answer = val1 / val2;
        }

        System.out.println(val1 + " " + operation + " " + val2 + " = " + answer);

        System.out.println("Would you like to perform another operation?");
        restart = scan.nextBoolean();

    }

    }
    
}
//remember to set things up in a loop to do multiple operations