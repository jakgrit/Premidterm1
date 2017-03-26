import java.util.Scanner;
public class Pre3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        int b = sc.nextInt();
        double c = 0;
                
        if(a.charAt(0)==('h')){
            
            if(b<200){
            c = (b*1.75);
            }if(b>=200){
            c = (b*2.00);
            }
        }
        else {
            if(b<20){
                c = (b*2.5);
            }else if(b>=200){
                c = (b*2.75);
            }
            }
            
            System.out.printf("%.2f\n",c);
        
    }
}
