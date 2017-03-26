import java.util.Scanner;
public class Pre10 {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        if(x == 0 || x > 9) System.out.println("Error : Out of range");
        else if(x < 0) System.out.println("Error : Please input positive number");
        else{
            String s = "";
            while(x <= 3 && x > 0){
                s += 'I';
                x--;
            }
            if(x == 4) s = "IV";
            if(x >= 5 && x < 9){
                s = "V";
                x -= 5;
                while(x > 0){
                    s += 'I';
                    x--;
                }
            }
            else if(x == 9) s = "IX";
            System.out.println(s);
        }
    }
}