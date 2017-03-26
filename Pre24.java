import java.util.Scanner;
public class Pre24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        String ans = "";
        
        if(a<=1990){
            if(b<=1500){
                ans = "1250";
            }else if(b>2000){
                ans = "2000";
            }else if(b>1500){
                ans = "1400";
            }
        }else if(a>=1991&&a<=1999){
            if(b<=1500){
                ans = "1100";
            }else if(b>2000){
                ans = "1700";
            }else if(b>1500){
                ans = "1300";
            }
        }else{
            if(b<=1500){
                ans = "1000";
            }else if(b>2000){
                ans = "1500";
            }else if(b>1500){
                ans = "1200";
            }
        }
        System.out.println(ans);
    }
}
