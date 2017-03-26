import java.util.Scanner;
public class Pre15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double x = sc.nextInt();
        double sum = 0;
        
        if(x >= 1)  sum += x<=50000?x*0.01:50000*0.01;
        if(x > 50000)  sum += x<=75000?(x-50000)*0.02:25000*0.02;
        if(x > 75000)  sum += x<=100000?(x-75000)*0.03:25000*0.03;
        if(x > 100000) sum += x<=250000?(x-100000)*0.04:150000*0.04;
        if(x > 250000) sum += x<=500000?(x-250000)*0.05:250000*0.05;
        if(x > 500000) sum += (x-500000)*0.06;
        
        System.out.printf("%.2f\n",sum);
    }
}
