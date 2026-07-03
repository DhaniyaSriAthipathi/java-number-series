import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        //cubes : 1 8 27 64 125
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                for(int k=1;k<=j;k++)
                {
                    sum=i*j*k;
                }
            }
             System.out.println(sum);
        }
        sc.close();
    }
}
