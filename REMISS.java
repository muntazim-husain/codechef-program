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
		
		int t= sc.nextInt();
		while(t--!=0)
		{
		    int g1 =sc.nextInt();
		    int g2 =sc.nextInt();
		    int min=0;
		    if(g1>g2)
		    {
		        min=g1;
		    }
		    else
		    {
		        min=g2;
		    }
		    int max=g1+g2;
		    System.out.println(min+" "+max);
		}
	}
}
