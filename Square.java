import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //square the number n =upto the range given by the user
        int n=sc.nextInt();
        //square number if n=2;square=2 o/p=1,4
        int Square=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                Square=i*j;
            }
            System.out.println(Square);
        }
    }
}
