import java.util.Scanner;;
public class Pre22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = sc.next();
        
        int t1s = toMinute(a);
        int t1e = toMinute(b);
        int t2s = toMinute(c);
        int t2e = toMinute(d);
        
        String ans = "";
        if(t1s < t2s){
            if(t1e <= t2s)   ans = "ok";
            else    ans = "overlap";
        } 
        else{
            if(t2e <= t1s)  ans = "ok";
            else    ans = "overlap";
        }
        System.out.println(ans);
    }
    public static int toMinute(String s){
        int minute = Integer.parseInt(s.substring(0,2))*60;
        minute += Integer.parseInt(s.substring(2));        
        return minute;
    }
}
