import java.util.Scanner;
public class Pre8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int c = sc.nextInt();
        
        switch(c){
            case 1:
                System.out.printf("%.5f\n",a+b);break;
            case 2:
                System.out.printf("%.5f\n",a-b);break;
            case 3:
                System.out.printf("%.5f\n",a*b);break;
            case 4:
                System.out.printf("%.5f\n",a/b);break;
            case 5:
                System.out.printf("%d\n",(int)a%(int)b);break;
            case 6:
                System.out.printf("%.5f\n",Math.pow(a,b));break;
            case 7:
                System.out.printf("%.5f\n",(a+b)/2);break;
            default:
                System.out.printf("Error\n");
        }
    }
}