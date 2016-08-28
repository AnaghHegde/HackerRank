import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FlipingBits {

    public static void main(String[] args)
            {
        int n;
    Scanner in = new Scanner(System.in);
    n=in.nextInt();
    
        for(int i=0;i<n;i++)
            {
           long a;
                       
           a=in.nextLong();
            long m=BinCon(a);
            System.out.println(m);
            }

            }
    
    public static long BinCon(long n)
        {
     long val=n;
       long[] x = new long [32];
        
        for(int i=31;i>=0;i--)
            {
         x[i]=  val%2;
            val/=2;
            }
        
        
        
         for(int i=0;i<32;i++)
            { 
             if(x[i]==0)
                 x[i]=1;
             else
                 x[i]=0;
            
           }
         
        
        long  sum=0;
        
        for(int i=31;i>=0;i--)
            {
            long h=(long)(x[i]*Math.pow(2,31-i));
            
            sum=sum + h ;
            
            }
        return sum ;
        
        }
    
        
}
