import java.util.Scanner;
public class Pre40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        
        String ans = "";
        
        if(a.length()==b.length()&&b.length()==c.length()){
            if(a.charAt(0)==b.charAt(0)&&b.charAt(0)==c.charAt(0)){
                ans = "YES";
            }
        }else if(a.length()!=b.length()&&b.length()!=c.length()){
            ans = "NO";
        }else{
            ans = "Relatives";
        }
        System.out.println(ans);
    }
}
