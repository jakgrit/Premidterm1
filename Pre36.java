import java.util.Scanner;
public class Pre36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next()+sc.next()+sc.next();
        
        int cnt = 0;
        
        for(int i=0;i<a.length();i++){
         
            if(a.charAt(i)=='A'){
                cnt++;
            }
        }
        if(cnt==8){
            System.out.println("A");
        }else if(cnt<4||a.indexOf("FXF")!=-1){
            System.out.println("F");
        }else{
            System.out.println("X");
        }
    }
}
