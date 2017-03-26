import java.util.Scanner;
public class Pre17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        String[] s = a.split(" ");
        
        int x = 0, o = 0;
        for(int i=0;i<9;i++){
            if(!s[i].equals("X") && !s[i].equals("O")){
                System.out.println("PROGRAM ERROR !!!");
                return;
            }
            else if(s[i].equals("X")) x++;
            else if(s[i].equals("O")) o++;
        }
        if(x >= 6 || o >= 6){
            System.out.println("ERROR PROGRAM !!!");
            return;
        }
        
        
        String[][] xo = new String[3][3];
        
        int k=0;
        for(int i=0;i<3;i++){
            System.out.println("+---+---+---+");
            for(int j=0;j<3;j++){
                xo[i][j] = s[k++];
                if(j == 0) System.out.print("|");
                System.out.print(" "+xo[i][j]+" |");                
            }System.out.println();
            if(i == 2) System.out.println("+---+---+---+");
        }     
        char w = win(xo);
        if(w != '-')
            System.out.println("\""+w+"\" IS WINNER");
        else
            System.out.println("!!! DRAW !!!");
    }
    public static char win(String[][] xo){
        int tung=0,non=0,chl=0,chr=0;
        char ans = '-',t,n,cl,cr;
        cl = xo[0][0].charAt(0);
        cr = xo[0][2].charAt(0);
        for(int i=0;i<3;i++){
            tung = 0; non = 0;
            t = xo[0][i].charAt(0);
            n = xo[i][0].charAt(0);
            for(int j=0;j<3;j++){
                if(n == xo[i][j].charAt(0)) non++;
                if(t == xo[j][i].charAt(0)) tung++;
                if(i == j && cl == xo[i][j].charAt(0)) chl++;
                if(i == 3-j-1 && cr == xo[i][j].charAt(0)) chr++;
            }
            if(non == 3) return n;
            if(tung == 3) return t;
        }
        if(chl == 3) return cl;
        if(chr == 3) return cr;       
        
        return ans;
    }
}
