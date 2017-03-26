import java.util.Scanner;
public class Pre21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        char k;
        String b ;
        String ans = "";
        int c = 0;
        
        b = a.substring(a.length()-1);
        k = a.charAt(0);
        c = Integer.parseInt(b);
        
        if(k=='a'||k=='c'||k=='r'||k=='g'){
            if(c%2==0){
                ans = "white";
            }else{
                ans = "black";
            }
        }else if(k=='b'||k=='d'||k=='f'||k=='h'){
            if(c%2==0){
                ans = "black";
        }else{
                ans = "white";
            }
            
        }
        System.out.println(ans);
    }
}
