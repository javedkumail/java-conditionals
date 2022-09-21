import java.util.Scanner;
public class SumOfEvenDigits {
     public static void main (String [] args){
          int number = 0;
          int sumOfEvenDigits = 0;

          // create Scanner class object 
          // for reading the values
          Scanner scan =  new Scanner(System.in);

          // read inputs
          System.out.print("Enter an integer number:: ");
          number = scan.nextInt();

          // find sum of digits of number
          sumOfEvenDigits = findEvenDigitSum(number);

          // display result
          System.out.println("The sum of even digits of"+
                  " the number "+number+" = "+ sumOfEvenDigits);

          // close Scanner class object
          scan.close();
          
     }

     private static int findEvenDigitSum(int number) {
     }

}
}

