
import java.util.Scanner;

public class Pre13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        double cnt = 0;

        if (a.equals("A+")) {
            cnt = 4.0;
        } else if (a.equals("A")) {
            cnt = 4.0;
        } else if (a.equals("A-")) {
            cnt = 3.7;
        } else if (a.equals("B+")) {
            cnt = 3.3;
        } else if (a.equals("B")) {
            cnt = 3.0;
        } else if (a.equals("B-")) {
            cnt = 2.7;
        } else if (a.equals("C+")) {
            cnt = 2.3;
        } else if (a.equals("C")) {
            cnt = 2.0;
        } else if (a.equals("C-")) {
            cnt = 1.7;
        } else if (a.equals("D+")) {
            cnt = 1.3;
        } else if (a.equals("D")) {
            cnt = 1.0;
        }else if (a.equals("D-")){
            cnt = 0.7;
        }else if  (a.equals("F")){
            cnt = 0.0;
        } 
        System.out.printf("%.1f\n", cnt);

    }
}
