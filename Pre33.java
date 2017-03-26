import java.util.Scanner;
public class Pre33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        int d = 0,ans = 0;
        for(int i=a.length()-1;i>=0;i--){
            ans += (a.charAt(i)-48)*Math.pow(2, d++);
        }
        System.out.println(ans);
    }
}
