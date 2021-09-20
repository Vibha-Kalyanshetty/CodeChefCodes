/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ATM
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		double bal=sc.nextDouble();
		if(n%5==0  && (n+0.5)<=bal){
		    bal-=(double)n;
		    bal-=0.5;
		    System.out.println(String.format("%.2f", bal));
		}
		else{
		    System.out.println(String.format("%.2f", bal));
		}
	}
}