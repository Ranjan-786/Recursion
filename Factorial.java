import java.util.*;
class Factorial
{

    public static void main(String ar[])
    {
        Factorial fb=new Factorial();
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no.");
        int n=s.nextInt();
        int r=fb.fac(n);
        System.out.println(r);
    }

    int fac(int u)
    {
        if(u==1)
            return 1;

        else
            return fac(u-1)*u;    
    }
     
} 