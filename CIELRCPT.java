/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{    
		    int count=0;
		    int n=sc.nextInt();
		    while(n>=2048)
		    {
		        n=n-2048;
		        count++;
		    }
		    while(n>0)
		    {
		        if(n>=1024)
		        {
		          n=n-1024;  
		         count++;
		        }
		         else if(n>=512)
		        {
		          n=n-512; 
		         count++;
		        }
		        else if(n>=256)
		        {
		          n=n-256;  
		         count++;
		        }
		        else if(n>=128)
		        {
		          n=n-128;  
		         count++;
		        }
		        else if(n>=64)
		        {
		          n=n-64;  
		         count++;
		        }
		        else if(n>=32)
		        {
		          n=n-32;  
		         count++;
		        }
		        else if(n>=16)
		        {
		          n=n-16;  
		         count++;
		        }
		        else if(n>=8)
		        {
		          n=n-8;  
		         count++;
		        }
		        else if(n>=4)
		        {
		          n=n-4;  
		         count++;
		        }
		        else if(n>=2)
		        {
		          n=n-2;  
		         count++;
		        }
		        else
		        {
		          n=n-1;  
		         count++;
		        }
		        
		    }
		    System.out.println(count);
		    
		}
	}
}
