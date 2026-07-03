import java.util.Scanner;

public class Multiple5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit=0;
        //multiple of 5: 5 10 15 20 25
        for(int i=1;i<=n;i++)
        {
            digit=i*5;
            System.out.println(digit);
        }
        sc.close();
    }
}
