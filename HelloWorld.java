public class HelloWorld {

    public static void main(String... args) {
        //System.out.println("Hello, World!");
        
        //System.out.println(2 + 2);
        //System.out.println(4 - 3);
        //System.out.println(5 * 7);
        //System.out.println(5.0 / 2.0);
         
        //int x = 5;
         //double y = 7.0;
         //String name = "Ben from Talking Ben";
        
         boolean roboticsIsFun = true;
        if (roboticsIsFun) {
        System.out.println("Weeeeeeeee!!");
        }
        double age = 17.0;
        if (age >= 16) {
            System.out.println("You can drive!");
        }
        else if(age >= 15.5 && age < 16.0){
            System.out.println("Learners Permit!");
        }

        else if(age < 16) {
            System.out.println("No Car for you!");
        }
    }
}

