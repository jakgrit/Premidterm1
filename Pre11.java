import java.util.Scanner;
public class Pre11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a==b && a==c){
            System.out.println("all the same");
        }else if(a !=b && a!=c && b!=c){
            System.out.println("all different");
        }else{
            System.out.println("neither");
        }
    }
}
