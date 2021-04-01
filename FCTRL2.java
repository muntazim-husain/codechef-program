import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
class CodeChef{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i;
        while(t--!=0){
            int n = sc.nextInt();
            BigInteger factorial=new BigInteger("1");
            for(i=1; i<=n; i++)
            {
                factorial=factorial.multiply(BigInteger.valueOf(i));
            }
            System.out.println(factorial);
        }
	}    
}