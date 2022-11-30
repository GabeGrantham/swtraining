import java.util.Scanner;

public class YouCanDrive2 {
    public static void main(String ... args) {

        Scanner scan = new Scanner(System.in);
        
        int people = 5;

        while (people > 0){
        System.out.println("How old are you?");
        
        double age = scan.nextDouble();
        
        System.out.println("What is your name?");
        String name = scan.next();
        

        if (age >= 16) {
            System.out.println("You can drive because you are " + age + ", " + name);
        }
        else if(age >= 15.5 && age < 16.0){
            System.out.println("Learners Permit!");
        }

        else if(age < 16) {
            System.out.println("No Car for you!");
            //break;
        }
        people--;
    
    }
    }
    }
