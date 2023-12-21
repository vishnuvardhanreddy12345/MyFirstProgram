import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int n=scan.nextInt();
        for(int i=m; i<=n; i++){
            int x=0;
            for (int j = 1; j <= n; j++) {
                if (i%j==0) {
                    x++;
                }
            }
            if (x==2) {
                System.out.println(i);
            }
        }
    }
}
