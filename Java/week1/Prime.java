import java.lang.*;
import java.util.Scanner;
class Prime {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter an integer");
        int num=Sc.nextInt();
        System.out.println("Prime Number");
        for(int i=2;i<=num;i++)
        {
            int f=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    f++;
                }
            }
            if(f==2)
            {
                System.out.println("Prime numbers are "+i);
            }
        }
    }
    
}
