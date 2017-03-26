import java.util.Scanner;
public class Pre1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        double b = sc.nextDouble();
        String c = sc.next();
        double total = a*b;
        double discount = 0;
        
        if(c.charAt(0)==('y')){
            if(total<=500){
                discount = 0.1;
            }
            else if(total >500 && total<1000){
                discount = 0.15;
            }
            else{
                discount = 0.2;
            }
        }
        else if(total<=500){
            discount = 0.05;
            }
            else if(total > 500 && total < 1000){
            discount = 0.1;
            }
            else{
            discount = 0.15;
        }
        System.out.printf("Total %.2f\n",total);
        System.out.printf("Discount %.2f\n",total*discount);
        System.out.printf("Amount %.2f\n",total-(total*discount));
            
        
    }
}
