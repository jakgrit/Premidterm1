import java.util.Scanner;
public class Pre20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String num = sc.next();
        String con = sc.next();
        
        int a = Integer.parseInt(num);
        int b = Integer.parseInt(num.substring(1)+num.substring(0,1));
        System.out.printf("%d %s %d = %d\n",a,con,b,con.equals("+")?a+b:a*b);
    }
}
