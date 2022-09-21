import java.util.Scanner;
public class TrianglePattern2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while ( i<=n){
            int j = 1;
            int t = i;
            while (j <= i){
                System.out.print(t);
                t--;
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
