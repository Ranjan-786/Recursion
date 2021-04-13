import java.util.*;
class Add
{
    public static void main (String  a[])
    {   Add obj=new Add();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=s.nextInt();
        int p=obj.sum(n);
        System.out.println(p);
    }

    int sum(int n)
    {
        if(n==0)
            return 0;

          else
           return sum(n-1)+n;  

    }
    

}