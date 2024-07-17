import java.util.*;
import java.lang.Math;

public class gold5_1456 {
static long A, B;
	public static void main(String[] ar) {
		Scanner in= new Scanner(System.in);
		A = in.nextLong();
		B = in.nextLong();
		int [] number = new int[(int)Math.ceil(Math.sqrt(B)+1)];
		long count = 0;
		for(int i=2; i<number.length-1;i++)
		{
			number[i]=i;
		}
		primeNumber(number);
		
        for(int i=2; i<=Math.sqrt(B); i++)
        {
        	for(int s=2; s<=Math.log(B)/Math.log(i);s++)
        	{
        		if(number[i]!=0)
        		{
        			long num = (long)Math.pow(i, s);
        			if(A<=num && num<=B)
        			{
        				count++;
        			}
        		}
        	}
        }
        System.out.println(count);   
	}
	
	public static void primeNumber(int[] number)
	{
		for(int i=2; i<Math.sqrt(B); i++)
		{
			for(int j=2*i; j<=number.length-2; j=j+i)
			{
				if(number[j] == 0)
				{
					continue;
				}
				number[j]=0;
			}
		}
	}
}