import java.util.Scanner;
public class CharPattern {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int i = 1;
        // ABCD
        // ABCD.  here n rows and n coulumns..dependent on n
        while (  i <= n){
            int j = 1;
            while ( j <= n){       // here
                System.out.print((char)('A' + j -1));
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
}
