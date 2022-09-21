import java.util.Scanner;
public class DiamondPattern {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int i, j, k;
        int rows = sc.nextInt();
        i = 1 ;
        while(i <= rows )
        {
            j = 1 ;
            while( j <= rows - i  )
            {
                System.out.print(" ");
                j++;
            }
            k = 1 ;
            while ( k <= i * 2 - 1 )
            {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
        i = rows - 1 ;
        while( i > 0 )
        {
            j = 1 ;
            while ( j <= rows - i )
            {
                System.out.print(" ");
                j++;
            }
            k = 1 ;
            while( k <= i * 2 - 1 )
            {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i--;
        }
    }
}
