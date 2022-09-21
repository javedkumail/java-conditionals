
import java.util.Scanner;

public class MultiplicationTable {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for ( int ctr = 1; ctr <=10; ctr ++)
        {
            System.out.print(n * ctr + " " );
        }

    }
}
