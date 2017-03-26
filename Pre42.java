import java.util.Scanner;
public class Pre42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        
        String s = "Science Building";
        String p = "Physics Building";
        String e = "Engineering Building";  
        String ans = "";
        if(a.charAt(0)=='S'){
            ans = s;
        }else if(a.charAt(0)=='P'){
            ans = p;
        }else if(a.charAt(0)=='E'){
            ans = e;
        }
        System.out.println(ans);
        System.out.println("Floor "+a.charAt(2));
        System.out.println("Room "+a.charAt(3)+a.charAt(4));       
    }
}
