import java.util.Scanner;
public class Pre16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b ="";
        
        for(int i=0;i<a/1000;i++){
            b += 'M';
        }a = (a%1000);
        
        if(a/100==9){
            b += "CM";
            a-=900;
        }
        if(a/100>=5 && a/100<9){
            b += 'D';
            a -=500;
            for(int i=0;i<a/100;i++){
                b += 'C';
            }
            a = (a%100);
        }
        if(a/100==4){
            b += "CD";
            a -= 400;
        }
        
        for(int i=0;i<a/100;i++){
            b += 'C';
        }a = (a%100);
        
        if(a/10==9){
            b += "XC";
            a -= 90;
        }
        if(a/10>=5 && a/10<9){
            b += 'L';
            a -= 50;
            for(int i=0;i<a/10;i++){
                b +='X';
            }
            a = (a%10);
        }
        if(a/10==4){
            b += "XL";
            a -= 40;
        }
        for(int i=0;i<a/10;i++){
            b += 'X';
        }   a %=10;
        
        if(a/1==9){
            b +="IX";
            a -= 9;
        }
        if(a/1>=5 && a/1<9){
            b += 'V';
            a -= 5;
            for(int i=0;i<a/1;i++){
                b +='I';
            }
            a = (a%1);
        }
        if(a/1==4){
            b += "IV";
            a -= 4;
        }
        for(int i=0;i<a/1;i++){
            b += 'I';
        }   a %=1;
        
        System.out.println(b);
    }
}
