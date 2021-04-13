import java.util.*;
public class PowerBestWay 
{

    public static void main(String a[])
    {
        PowerBestWay o=new PowerBestWay();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no.");
        int v=sc.nextInt();
        System.out.print("enter the power");
        int b=sc.nextInt();
        int l=o.hyper(v,b);
        System.out.println(l);
    }

    int hyper(int m,int n)
    {
        if(n==0)
            return 1;

        else
        {
            if(n%2==0)
                return hyper(m*m,n/2);

            else
                return m*hyper(m*m,(n-1)/2);
            
        }    
    }
    
}
