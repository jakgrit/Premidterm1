import java.util.Scanner;
public class Pre14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String[] w = new String[4];
        w[0] = "Winter";
        w[1] = "Spring";
        w[2] = "Summer";
        w[3] = "Fall";
        
        if(a%3 == 0 && b >= 21){
            int tmp = a==12?0:a/3;
            System.out.println(w[tmp]);
        }
        else{
            int tmp = a%3==0?a/3-1:a/3;
            System.out.println(w[tmp]); 
        }
    }
}
