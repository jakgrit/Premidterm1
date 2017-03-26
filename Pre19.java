import java.util.Scanner;
public class Pre19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String a1 = "Capricorn";
        String a2 = "Aquarius";
        String a3 = "Pisces";
        String a4 = "Aries";
        String a5 = "Taurus";
        String a6 = "Gemini";
        String a7 = "Cancer";
        String a8 = "Leo";
        String a9 = "Virgo";
        String a10 = "Libra";
        String a11 = "Scorpio";
        String a12 = "Sagittarius";
        
        String c ="";
        
        if((a >= 22 && b == 12)||(a <= 19 && b == 1) ){
            c = a1;
        }else if((a >= 20 && b == 1)||(a <= 18 && b == 2) ){
            c = a2;
        }else if((a >= 19 && b == 2)||(a <= 20 && b == 3) ){
            c = a3;
        }else if((a >= 21 && b == 3)||(a <= 19 && b == 4) ){
            c = a4;
        }else if((a >= 20 && b == 4)||(a <= 20 && b == 5) ){
            c = a5;
        }else if((a >= 21 && b == 5)||(a <= 21 && b == 6) ){
            c = a6;
        }else if((a >= 22 && b == 6)||(a <= 22 && b == 7) ){
            c = a7;
        }else if((a >= 23 && b == 7)||(a <= 22 && b == 8) ){
            c = a8;
        }else if((a >= 23 && b == 8)||(a <= 22 && b == 9) ){
            c = a9;
        }else if((a >= 23 && b == 9)||(a <= 23 && b == 10) ){
            c = a10;
        }else if((a >= 24 && b == 10)||(a <= 21 && b == 11) ){
            c = a11;
        }else{
            c = a12;
        }
        System.out.println(c);
   
    }
}
