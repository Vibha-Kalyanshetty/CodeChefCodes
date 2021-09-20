

import java.util.*;
import java.lang.*;
import java.io.*;


class sumOfDigits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int num=sc.nextInt();
		    String num2=Integer.toString(num);
		    for(int j=0;j<num2.length();j++){
		       int num3= Character.getNumericValue(num2.charAt(j));
		       sum+=num3;
		    }
		    System.out.println(sum);
		    sum=0;
		}
	}
}
