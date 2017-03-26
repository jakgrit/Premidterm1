import java.util.Scanner;
public class Pre30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        
        if(a.charAt(0)>=48&&a.charAt(0)<=57){
           System.out.println((a)+((a.charAt(0)-48+9)%5));
        
        
        }else if(a.charAt(0)>=97&&a.charAt(0)<=122){
            int cnt =0;
            if(a.charAt(1)>=48&&a.charAt(1)<=57){
                cnt++;
            }if(a.charAt(2)>=48&&a.charAt(2)<=57){
                cnt++;
            }if(a.charAt(3)>=48&&a.charAt(3)<=57){
                cnt++;   
            }
            System.out.println((a)+((cnt+2)%3));
        
        
        }else if(a.charAt(0)>=65&&a.charAt(0)<=90){
            if(a.charAt(3)>=97&&a.charAt(3)<=122){
                System.out.println((a)+a.substring(0,1).toUpperCase());
            }else{
                System.out.println((a)+(a.substring(0,1).toLowerCase()));
            }
        }
    }
}
