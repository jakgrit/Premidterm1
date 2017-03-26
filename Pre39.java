import java.util.Scanner;
public class Pre39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        
        String ans = "";
        if(c>f){
            ans = "1";
        }else if(f>c){
            ans = "2";
        }else{
            ans = "0";
        } 
        System.out.println(ans);
    }
}
