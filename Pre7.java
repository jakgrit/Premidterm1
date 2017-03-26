import java.util.Scanner;
public class Pre7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        int cnt = 1;
        for(int i=1;i<s.length();i++){
            if(c == s.charAt(i)) cnt++;
            else{
                System.out.printf("%d%c",cnt,c);
                c = s.charAt(i);
                cnt = 1;
            }
        }
        if(cnt != 1 || c == s.charAt(s.length()-1)){
            System.out.printf("%d%c",cnt,c);
        }System.out.println();
    }
}