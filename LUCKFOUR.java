/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t;
		Scanner sc = new Scanner(System.in);
		t =sc.nextInt();
		while(t--!=0)
		{
		   
		  int n =sc.nextInt();
          int count=0;
		  while(n!=0)
		  {
		    if(n%10==4)
		    {
		       count=count+1;
		     }
		      n=n/10;
		  }
		    System.out.println(count);
		}
	}
}
