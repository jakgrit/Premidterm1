import java.util.Scanner;
public class Pre38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cap = sc.nextInt();
        int[][] m = new int[3][2];
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                m[i][j] = sc.nextInt();
            }
        }
        
        int[] store = new int[3];
        int indx = 0;
        
        int min = (int)(Math.pow(2,31)-1);
        for(int i=0;i<3;i++){
            if(m[i][0] > cap){
                if(min > m[i][1]){
                    min = m[i][1];
                    indx = 0;
                    store[indx++] = i+1; 
                }
                else if(min == m[i][1]){
                    store[indx++] = i+1;
                }
            }
        }
        if(indx == 0)   System.out.println("none");
        for(int i=0;i<indx;i++){
            System.out.println(store[i]);
        }
    }
}
