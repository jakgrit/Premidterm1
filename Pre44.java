import java.util.Scanner;
public class Pre44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a==b){
            System.out.println("Cake");
        }else if(a==b*2){
            System.out.println("Cookie");
        }else if(a*5==b){
            System.out.println("Toffy");
        }else{
            System.out.println("Unknown");
        }
    }
}
