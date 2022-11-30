import java.util.Scanner;

public class Review {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x;

        System.out.println("How many numbers: ");
        x = scan.nextInt();

        for (int i = 0; i <= x; i++) {
            if ((i % 5) == 0) {
                if ((i % 3) == 0) {
                    System.out.println("fizzbuzz");
                } else {
                    System.out.println("fizz");
                }
            } else if ((i % 3) == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}