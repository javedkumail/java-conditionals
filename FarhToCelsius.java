import java.util.Scanner;

public class FarhToCelsius {
    public static void main (String [] args) {
        int S, E, W;
        int C;

        Scanner sc = new Scanner(System.in);
        S = sc.nextInt();
        E = sc.nextInt();
        W = sc.nextInt();

        while (S <= E){
            C = (5* (S-32))/9;
            System.out.println(S + " " + C);
            S = S + W;
        }
    }
}
