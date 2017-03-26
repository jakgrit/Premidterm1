import java.util.Scanner;
public class Pre43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();
        int sum=0;
        
        for(int i=0;i<c.length();i++){
            sum += (int)c.charAt(i)-48;
        }
        
        sum += a+b;
        if(sum%2==0){
            System.out.printf("%d \nGroup A\n",sum);
        }else{
            System.out.printf("%d \nGroup B\n",sum);
        }
        
        
    }
}
