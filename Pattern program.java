// Print Number Pattern in NxN Matrix with Leading Zeros
// ans:--
public class Main {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        int count = 1;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (count < 10) {
                    System.out.print("0");
                }
                System.out.print(count + " ");
                count++;
            }
            System.out.println();  // removed extra spaces for cleaner look
        }
    }
}
