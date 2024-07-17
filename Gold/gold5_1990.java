
import java.util.*;

public class gold5_1990 {

	public static void main(String[] ar) {
		Scanner in= new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		
		boolean[]ch=new boolean[100000001+1];
        ch[0] = ch[1]=true;
        for(int i1=2; i1*i1<=100000001; i1++)
        {
            if(!ch[i1])
            {
                for(int i2=i1*i1; i2<=100000001; i2+=i1) ch[i2] = true;
            }
        }
        
		for(int i1=a; i1<=b; i1++)
		{
			if(!ch[i1])
			{
				String s= Integer.toString(i1);
				int y=s.length();
				int cnt=0;
				for(int i3=0; i3<=(y-1)/2; i3++)
				{
					if(s.charAt(i3)!=s.charAt((y-1)-i3))
					{
						cnt++;
					}
				}
				
				if(cnt==0)
				{
					System.out.println(i1);
				}
			}
		}
		System.out.println(-1);
 
	}
}