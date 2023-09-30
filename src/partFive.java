public class partFive {
    public static void main(String[] args) {

        // outer loop
        for (int i = 1; i <= 5; ++i) {

            // inner loop to print the numbers
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
