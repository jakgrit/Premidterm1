import java.util.Scanner;
public class Pre35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = "";
        String c = "";
        String ans = "";
        
        b = a.substring(0,1);
        c = a.substring(a.length()-1);
        
        if(b.charAt(0)=='5'&&c.charAt(0)=='5'){
            ans = "Very Lucky";
        }else if(b.charAt(0)=='9'&&c.charAt(0)=='9'){
            ans = "Very Lucky";
        }else if(b.charAt(0)==c.charAt(0)){
            ans = "Lucky";
        }else{
            ans = "Usual";
        }
        System.out.println(ans);
    }
}
