import java.util.*;
import java.io.*;
import java.util.Arrays;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
   Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n,k,ptr,count;
        int ans=0;
        int a[]=new int[100000];
        while(t>0)
        { t--;
        ptr=0;
        count=0;
         n=sc.nextInt();
         k=sc.nextInt();
         for(int i=0;i<n;i++)
         { a[i]=sc.nextInt();
         }
         Arrays.sort(a,0,n);
         k++;
        while(k>0){
         k--;
         if(ptr==n)
         ans=a[n-1]+1;
         else{
         while(ptr<n)
         { if(count<a[ptr])
         {ans=count;
         count++;
         break;
         }
         else{
         if(a[ptr]==count)
             count++;
              ptr++;
         }
         }
         }
         if(ptr==n)
         { 
         a[n-1]++;
         ans=a[n-1];
         }
         }
         System.out.println(ans);
        }
    }
    } 