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
		int t = sc.nextInt();
		 int pl1=0,pl2=0;
		 int player,lead;
		 int win=0,temp=0;
		    
		while(t--!=0)
		{
		    int p1 =sc.nextInt();
		    int p2 =sc.nextInt();
		    
		    pl1+=p1;
		    pl2+=p2;
		    
		
		   if(pl1>pl2)
		    {
		        player=1;
		        lead=pl1-pl2;
		    }
		    else
		    {
		        player=2;
		        lead=pl2-pl1;
		    }
		    if(temp<lead)
		    {
		        win=player;
		        temp=lead;
		    }
		}  
		System.out.println(win+" "+temp);
	}
}
