public import java.util.*;

public class silver1_1124 {

	public static void main(String[] ar) {
		Scanner in= new Scanner(System.in);
		int a= in.nextInt();
		int b= in.nextInt();
		int val=0;
		
		boolean[]ch=new boolean[b+1];
        ch[0] = ch[1]=true;
        for(int i1=2; i1*i1<=b; i1++)
        {
            if(!ch[i1])
            {
                for(int i2=i1*i1; i2<=b; i2+=i1) ch[i2] = true;
            }
        }
        
		for(int i=a; i<=b; i++)
		{
			int cnt=0;
			int n=i;
			while(n!=1)
	        {
	            for(int i1=2; i1<=n; i1++)
	            {
	                if(n%i1==0)
	                {
	                    n=n/i1;
	                    cnt++;
	                    break;
	                }
	            }
	        }
			if(!ch[cnt])
			{
				val++;
			}
		}
		
		System.out.println(val);
 
	}
} silver1_1114 {
    
}
