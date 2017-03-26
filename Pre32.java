import java.util.Scanner;
public class Pre32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String ans = "";
        int cnt = 0;
        
        if(a.length()>5){
            System.out.println("Too Long");
        }else if(a.length()<3){
            System.out.println("Too Short");
        }else{
            
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)=='1'){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
