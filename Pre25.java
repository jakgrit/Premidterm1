import java.util.Scanner;
public class Pre25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        char b ;
        
        b = a.substring(a.length()-1).charAt(0);
        a = a.substring(0,a.length()-1);
        
        if(a.equals("A")){
            a = "Ace";
        }else if(a.equals("J")){
            a = "Jack";
        }else if(a.equals("Q")){
            a = "Queen";
        }else if(a.equals("K")){
            a = "King";
        }
        
        a += " of ";
        
        if(b == 'D'){
            a += "Diamonds";
        }else if(b == 'H'){
            a += "Hearts";
        }else if(b == 'S'){
            a += "Spades";
        }else {
            a += "Clubs";
        }
        
        System.out.println(a);
        
    }
}
