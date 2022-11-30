public class Fibonacci {

    public static void main(String[] args) {
        // Variables
        int prevNumb = 0;
        int tempNumb = 1;

        // Calculations
        for (int i = 0; i < 100; i++) {

            int currentNumb = (prevNumb + tempNumb);

            currentNumb = prevNumb;
            prevNumb = tempNumb;
            tempNumb = (currentNumb + prevNumb);

            System.out.println(currentNumb);
        }

    }

}
