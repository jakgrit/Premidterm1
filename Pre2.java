import java.util.Scanner;
public class Pre2 {
    static int a[] = new int[3];
    static int b[] = new int[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++)
            a[i] = sc.nextInt();
        for(int i=0;i<3;i++)
            b[i] = sc.nextInt();
        
        swap(2);
        if(a[0]%2 == 0 || b[0]%2 == 0)  swap(0);
        if(a[1]%2 == 1 || b[1]%2 == 1)  swap(1);
        
        int sumA,sumB;
        sumA = a[0]+a[1]+a[2];
        sumB = b[0]+b[1]+b[2];
        
        if(sumA > sumB) System.out.printf("A %d %d %d\n",a[0],a[1],a[2]);
        else if(sumB > sumA) System.out.printf("B %d %d %d\n",b[0],b[1],b[2]);
        else{
            System.out.printf("A %d %d %d\n",a[0],a[1],a[2]);
            System.out.printf("B %d %d %d\n",b[0],b[1],b[2]);
        }
    }
    public static void swap(int i){
        int tmp;
        tmp = a[i];
        a[i] = b[i];
        b[i] = tmp;
    }
}