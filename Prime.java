public class Prime{
    public static void main(String[] args) {
        //prime no starts from 2 upto 100
        for(int i=2;i<=100;i++){
            //count values not prime no
            int count=0;
            for(int j=2;j<=i/2;j++)
            {
                //eg:10%2==0 
                //count=1 set 
                if(i%j==0)
                {
                    count++;
                    break;
                }
            }
            //count =1 not prime number
            if(count==0)
            {
                System.out.println(i);
            }
        }
    }
}