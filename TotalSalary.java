import java.util.Scanner;
public class TotalSalary {
    public static void main (String [] args){
            Scanner s = new Scanner(System.in);
            int basic = s.nextInt();
            double hra,da,pf ;
            char grade = s.next().charAt(0);
            int totalSalary,allow = 0;

            hra = 0.2*basic;
            da = 0.5*basic;
            pf = 0.11*basic;

            if(grade == 'A') {
                allow = 1700;
            }
            else if (grade == 'B') {
                allow = 1500;
            }
            else if (grade >= 'C' && grade <= 'Z' ) {
                allow = 1300;
            }
            totalSalary =(int)Math.round (basic + hra + da + allow - pf);
            System.out.println(totalSalary);

        }
}
