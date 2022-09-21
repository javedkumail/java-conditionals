import java.util.Scanner;
public class square1 {
    public static void main (String [] agrs){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int i= 1;
        while ( i <= n){           // 'i' represents row no.
                                   // when i = 1 or 2, prints 1st/2nd row
            int j = 1;          // j is column no.
            while (j <= n) {    // every row will have n column
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
