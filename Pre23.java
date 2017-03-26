import java.util.Scanner;
public class Pre23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        String b = sc.next();
        
        String ans = "";
        
        if(b.equals("C")){
            if(a>=100){
                ans = "Gas";
            }else if(a>0){
                ans = "Liquid";
            }else{
                ans = "Solid";
            }
        }else{
            if(a>=212){
                ans = "Gas";
            }else if(a>32){
                ans = "Liquid";
            }else{
                ans = "Solid";
            }
        }
        System.out.println(ans);
    }
}
