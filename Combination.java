     import java.util.*;
     class Combination
     {
         public static void main(String a[])
         {
            Combination c=new Combination();
            Scanner p=new Scanner(System.in);
            System.out.println("enter the no.");
            int k=p.nextInt();
            System.out.println("enter the require no.");
            int j=p.nextInt(); 
            int l=c.combo(k,j);
            System.out.println("combination of"+ " " +k+ " " + "and"+" "+j+" "+"is"+" "+l);

         }

         int combo(int n,int r)
         {
             int u=fact(n);
             int v=fact(r)*fact(n-r);
            int y=n/r;
            return y;
         }

         int fact(int z)
         {
             if(z==1)
                return 1;

             else
                return fact(z-1)*z;   
         }
     }
