import java.util.Scanner;
public class Pre28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int even = 0;
        int odd = 0;
        if(a%2==0){
            even++;
        }if(b%2==0){
            even++;
        }if(c%2==0){
            even++;
        }if(a%2!=0){
            odd++;
        }if(b%2!=0){
            odd++;
        }if(c%2!=0){
            odd++;
            
        }
        System.out.println("even "+even);
        System.out.println("odd "+odd);
    }
}
