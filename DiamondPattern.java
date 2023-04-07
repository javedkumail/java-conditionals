import java.util.Scanner;
public class DiamondPattern {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        // int i, j, k;
        // int rows = sc.nextInt();
        // i = 1 ;
        // while(i <= rows )
        // {
        //     j = 1 ;
        //     while( j <= rows - i  )
        //     {
        //         System.out.print(" ");
        //         j++;
        //     }
        //     k = 1 ;
        //     while ( k <= i * 2 - 1 )
        //     {
        //         System.out.print("*");
        //         k++;
        //     }
        //     System.out.println();
        //     i++;
        // }
        // i = rows - 1 ;
        // while( i > 0 )
        // {
        //     j = 1 ;
        //     while ( j <= rows - i )
        //     {
        //         System.out.print(" ");
        //         j++;
        //     }
        //     k = 1 ;
        //     while( k <= i * 2 - 1 )
        //     {
        //         System.out.print("*");
        //         k++;
        //     }
        //     System.out.println();
        //     i--;
        // }
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            // Print spaces before the asterisks
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }

            // Print asterisks
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }

        i = n - 1;
        while (i >= 1) {
            // Print spaces before the asterisks
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }

            // Print asterisks
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i--;
        }
    }
}
