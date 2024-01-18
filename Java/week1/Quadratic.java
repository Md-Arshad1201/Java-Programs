import java.lang.*;
import java.util.Scanner;
class Quadratic
{
    public static void main(String args[])
    {
        double a,b,c,r1,r2,D;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a,b,c values");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        D=b*b-4*a*c;
        System.out.println("Discriminate value"+D);
        if(D>0)
        {
            r1=(-b+Math.sqrt(D))/(2*a);
            r2=(-b+Math.sqrt(D))/(2*a);
            System.out.println("root1="+r1+"root2="+r2);
            System.out.println("roots are real and distinct");
        }
        else if(D<0)
        {
            r1=-b/(2*a);
            r2=(-Math.sqrt(D))/(2*a);
            System.out.println("root1="+r1+"+i"+r2);
            System.out.println("root2="+r1+"-i"+r2);
            System.out.println("roots are imaginary");
        }
        else 
        {
            r1=r2=-b/(2*a);
            System.out.println("root1="+r1+"root2="+r2);
            System.out.println("roots are real and equal");
        }
    }
}