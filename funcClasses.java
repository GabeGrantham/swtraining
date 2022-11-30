import java.util.Scanner;

public class funcClasses {

    // Person Class
    public static class Person {

        // Members, constructor, functions, then inherited class functions
        // Variables inside of a class are called members
        // Members
        String name;
        double ageYears;
        double heightInches;
        boolean wearsGlasses;
        String gender;

        // Constructor
        public Person(String aName, double age, double height, boolean wearsGlasses, String gender) {
            name = aName;
            this.ageYears = age;
            this.heightInches = height;
            this.wearsGlasses = wearsGlasses;
            this.gender = gender;
        }

        public Person() {
            Scanner scan = new Scanner(System.in);

            System.out.println("What is your age? ");
            this.name = scan.next();

            System.out.println("What is your gender? ");
            this.gender = scan.next();
        }

        boolean giveLasik() {
            wearsGlasses = false;
            System.out.println("You got surgery");
            return wearsGlasses;
        }

        public String toString() {
            return name + " is " + ageYears + " years old, is " + heightInches + " inches tall, and "
                    + (wearsGlasses ? "wears" : "doesn't wear") + " glasses.";
        }
    }

    public static void main(String... args) {

        // Gabe
        Person gabe = new Person("Gabe", 15, 72, true, "male");

        System.out.println(gabe.wearsGlasses);

        gabe.giveLasik();
        System.out.println(gabe.wearsGlasses);

        System.out.println(gabe);

        // New Person
        Person user = new Person();
        Person users[] = new Person[10];
        users[0] = new Person();

        for (int i = 0; i < users.length; i++) {
            users[i] = new Person();
        }

        System.out.println(users[0]);

    }
}
