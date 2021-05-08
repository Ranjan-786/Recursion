import java.util.*;
public class Infq 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter the size of inputs");
        int n=sc.nextInt();
       
        System.out.println("enter the element of input1");
        char input1[]=new char[n];
        for(int i=0;i<=n-1;i++)
        {
         input1=sc.next().charAt(i); 
         
        }
       
        System.out.println("enter the element of input2");
        char input2[]=new char[n];
        for(int j=0;j<=n-1;j++)
        {
         input2=sc.next().charAt(j); 
    
        }
       
        Infq in=new Infq();
        int y=in.findSum(input1,input2);
        System.out.println(y);
    }
    
    int findSum(char input1[],char input2[])
    {
        int p=input1.length; //length of input1 or input2 is same
        int s1=0;
        int s2=0;
        for(int i=0;i<=p-1;i++)
        {
            for(int j=0;j<=p-1;j++)
            {
                if(input1.charAt[i]!=input2.charAt[j])
                {
                       int h= input1[i];
                       s1=s1+h;
                }
            }
            for(int k=0;k<=p-1;k++)
            {
                if(input2.charAt[i]!=input1.charAt[k])
                {
                       int g= input2[i];
                       s2=s2+g;
                }
            }
        }
        int s=s1+s2;
        //int q=0;
        int z=0;
        while(s!=0 || z>=9)
        {
            if(s==0)
            {
                s=z;
                z=0;
            }
            int l=s%10;
            z=z+l;
            s=s/10;

        }
         return z;
        
    }
}
