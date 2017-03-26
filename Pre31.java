import java.util.Scanner;
public class Pre31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String ans = "";
        int cnt = 0;
                
        for(int i=0;i<a.length();i++){
            
            if((int)a.charAt(i)>=65&&(int)a.charAt(i)<=90){
                cnt++;    
            }
              
        }if (cnt == a.length()){
            ans = "Capital Letter";
        }else if(cnt == 0){
            ans = "Small Letter";
        }else{
            ans = "Mix";
        } 
      System.out.println(ans);
    }
}
