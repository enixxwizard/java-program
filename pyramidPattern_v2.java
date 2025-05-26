// Write a Java program to print the following pyramid pattern using stars (*) for n rows:
public class Main {
    public static void main(String[] args) {
        int n = 5; // number of rows

        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
