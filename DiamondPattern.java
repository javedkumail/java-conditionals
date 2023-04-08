import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        int i = 1;
        int n1 = (n + 1) / 2;
        int n2 = n / 2;
        while (i <= n1) {
            // Print spaces before the asterisks
            int space = 1;
            while (space <= n1 - i) {
                System.out.print(" ");
                space++;
            }

            // Print asterisks
            int j = 1;
            while (j <= (2 * i) - 1) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }

        i = n2;
        while (i >= 1) {
            int space = 1;
            while (space <= (n2 - i + 1)) {
                System.out.print(" ");
                space++;
            }

            int j = 1;
            while (j <= (2 * i - 1)) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
