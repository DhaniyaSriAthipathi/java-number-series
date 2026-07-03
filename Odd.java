import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //print odd number 1 3 5 7 9
        for(int i=1;i<=n;i++){
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
