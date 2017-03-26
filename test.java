import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       String a = sc.next();
       int cntr = 0;
       int cntg = 0;
       int cntp = 0;
       
       for(int i=0;i<a.length();i++){
           if(a.charAt(i)=='R') cntr++;
           else if(a.charAt(i)=='G') cntg++;
           else cntp++;
       }
       System.out.println(cntr+"R"+cntg+"G"+cntp+"P");
    }
}
	