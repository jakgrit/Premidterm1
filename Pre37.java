import java.util.Scanner;
public class Pre37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int h = s.indexOf("H");
        int x = s.indexOf("X");
        System.out.println((h<x?"L":"R")+Math.abs(h-x));
    }
}
