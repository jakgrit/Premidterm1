import java.util.Scanner;
public class Pre9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,max = 0,min = 0;       
        
        for(int i=0;i<5;i++){
            x = sc.nextDouble();
            if(i == 0) max = min = x;
            if(max < x) max = x;
            if(min > x) min = x;
        }    
        System.out.printf("Max %.2f\n",max);
        System.out.printf("Min %.2f\n",min);
    }
}
