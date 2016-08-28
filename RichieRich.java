import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RichieRich {
static String s,temp1;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        s = in.next();
        temp1 = s;
        int j=s.length()-1;
        for(int i=0; i<= s.length()-1 && k > 0; i++){ 
            if(i>=j) break;
            if( s.charAt(i)!=s.charAt(j) ){
                if((int)s.charAt(i) > (int)s.charAt(j))
                    s=setChar(j,s.charAt(i),s);
                else
                    s=setChar(i,s.charAt(j),s);
                k--;    
            }
            j--;
        }
        if(isPalindrome(s) && k > 0)
            bigPalindrome(s,k);
        else 
            if(k==0 && isPalindrome(s))
                System.out.println(s);
        else
            System.out.println("-1");
    }
    
    public static boolean isPalindrome(String s){
        int n = s.length();
        for(int i=0;i<=(n / 2);++i){
            if(s.charAt(i) != s.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
    }
    
    public static String setChar(int i,char c,String s){
        char[] ar=s.toCharArray();
        ar[i] =c;
        String temp = String.valueOf(ar);
        return temp;
    }
    
    public static String setCharBoth(int i,int j,char c,String s){
    	char[] ar=s.toCharArray();
    	ar[i]=c;
    	ar[j]=c;
    	String temp=String.valueOf(ar);
    	return temp;
    }
    
    public static void bigPalindrome(String s,int k){
        int j=s.length()-1;
        char c='9';
         for(int i=0; i<= s.length()-1 && k > 0  ; i++){
         if(s.charAt(i)=='9') 
         {
         j--;
         continue;
         }
         
         
         if(temp1.charAt(i)!=temp1.charAt(j) || i==j)
         {
         s=setCharBoth(i,j,c,s);
          k--;
         } 
         else if(k>1)
         {
         s=setCharBoth(i,j,c,s);
         k-=2;
         }
       		j--;  
       	         
         } 
        System.out.println(s);
    }
    
}

