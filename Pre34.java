import java.util.Scanner;
public class Pre34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        
        String ans = "";
        
        if(a.length()==b.length()&&b.length()==c.length()){
            System.out.println("All the same");
        }else if(a.length()==b.length()&&a.length()!=c.length()){
            System.out.println("Neither");
        }else if(a.length()==c.length()&&a.length()!=b.length()){
            System.out.println("Neither");
        }else if(b.length()==c.length()&&b.length()!=a.length()){
            System.out.println("Neither");
        }else if(b.length()==a.length()&&b.length()!=c.length()){
            System.out.println("Neither");
        }else{
            if(a.length()>b.length()&&a.length()>c.length()){
                System.out.println(a.length());
            }else if(b.length()>a.length()&&a.length()>c.length()){
                System.out.println(b.length());
            }else if(c.length()>a.length()&&a.length()>b.length()){
                System.out.println(c.length());
            }
        }
    }
 
}
