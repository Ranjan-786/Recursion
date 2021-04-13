import java.util.*;
class Power 
{
    public static void main(String args[])
    {
        Power p=new Power();
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no.");
        int d=s.nextInt();
        System.out.println("enter the power");
        int c=s.nextInt();
        int y=p.pow(d,c);
        System.out.println(y);

    }

    int pow(int k,int j)
    {
        if(j==0)
            return 1;
        else
            return k*pow(k,j-1);
    }
}