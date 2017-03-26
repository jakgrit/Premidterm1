import java.util.Scanner;
public class Pre29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String ans = "";
        
        int indx = s.indexOf("555");
        if(indx != -1){
            s = s.substring(0,indx)+s.substring(indx+3);
            if(s.indexOf("5")==-1){
                ans += "hahaha";
            }else{
                ans += "none";
            }
        }else{
            ans += "none";
        }
        System.out.println(ans);
    }
}
