import java.util.Scanner;
public class Pre45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int r = 0;
        int g = 0;
        int p = 0;
        
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='R'){
                r++;
            }if(a.charAt(i)=='G'){
                g++;
            }if(a.charAt(i)=='P'){
                p++;
            }
        }
        System.out.println(r+"R"+g+"G"+p+"P");
    }
}
