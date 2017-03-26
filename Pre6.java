import java.util.Scanner;
public class Pre6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double h = (sc.nextDouble())/100.0;
        double w = sc.nextDouble();
        
        double bmi = w/Math.pow(h,2);
        if(bmi >= 40.0)   System.out.printf("%.2f\nFattest\n",bmi);
        else if(bmi >= 35.0 && bmi < 40) System.out.printf("%.2f\nFat level II\n",bmi);
        else if(bmi >= 28.5 && bmi < 35) System.out.printf("%.2f\nFat level I\n",bmi);
        else if(bmi >= 23.5 && bmi < 28.5) System.out.printf("%.2f\nOverweight\n",bmi);
        else if(bmi >= 18.5 && bmi < 23.5) System.out.printf("%.2f\nNormally\n",bmi);
        else System.out.printf("%.2f\nUnderweight\n",bmi);
    }
}
