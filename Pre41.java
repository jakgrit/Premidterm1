import java.util.Scanner;
public class Pre41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int max = a;
        String ans = "";
        if(max<b){
            max = b;
        }if(max<c){
            max = c;
        }if(max<d){
            max = d;
        }
        if(max>450){
            ans = "YES";
        }else{
            ans = "NO";
        }
        System.out.println(max+" "+ans);
    }
}
