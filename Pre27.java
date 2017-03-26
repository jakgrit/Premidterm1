import java.util.Scanner;
public class Pre27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        
        int m1 = (y2-y1)/(x2-x1); 
        int m2 = (y4-y3)/(x4-x3);
        if(m1==m2){
            System.out.println("parallel");
        }else if(m1==-1/m2){
            System.out.println("perpendicular");
        }else{
            System.out.println("none");
        }
            
        
        
        
        
        
        
        
    } 
}
