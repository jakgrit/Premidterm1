import java.util.Scanner;
public class Pre5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String c = sc.next();
        int pass = sc.nextInt();
        
        if(c.charAt(0) == 'H' && pass == 4567)
            System.out.println("safe unlocked");
        else if(c.charAt(0) == 'H' && pass != 4567)
            System.out.println("safe locked - change digit");
        else if(c.charAt(0) != 'H' && pass == 4567)
            System.out.println("safe locked - change char");
        else{
            System.out.println("safe locked");
        }
    }
}
