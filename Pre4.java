import java.util.Scanner;
public class Pre4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int y1 = sc.nextInt();
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int y2 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();     
                
        if(y1 == y2 && m1 == m2 && d1 == d2)
            System.out.println("equal");
        else{
            int t = -1;
            if(y1 > y2) t = 2;
            else if(y1 < y2) t = 1;
            else{
                if(m1 > m2) t = 2;
                else if(m1 < m2)  t = 1;
                else{
                    if(d1 > d2) t = 2;
                    else if(d1 < d2)  t = 1;
                }
            }
            System.out.println(t);
        }
    }
}