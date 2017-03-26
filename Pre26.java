import java.util.Scanner;
public class Pre26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        String s = sc.next();
        String ans = "";
        if(s.charAt(0) == '-')  ans = "negative";
        else if(s.charAt(0) == '0')  ans = "zero";
        else ans = "positive";
        
        if(s.indexOf(".") != -1) ans += " decimal";
        else ans += " integer";
        
        System.out.println(ans);
    }
}