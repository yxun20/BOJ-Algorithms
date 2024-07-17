import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

public class gold3_1644{
    
     public static void main(String[] ar){
         Scanner in= new Scanner(System.in);
         int n =in.nextInt();
         boolean[]ch=new boolean[n+1];
         ch[0] = ch[1]=true;
         //double nn= (double)n;
         //int nnn= (int) Math.sqrt(nn)+10000;
         int [] arr = new int[n];
         
         for(int i1=2; i1*i1<=n; i1++)
         { 
             if(!ch[i1])
             {
                 for(int i2=i1*i1; i2<=n; i2+=i1) ch[i2] = true;
             }
         }
         //에라토스테네스의 체
         
         int good=0;
         int idx=0;
         for(int i1=2; i1<=n; i1++)
         {
             if(!ch[i1])
             {
                 arr[idx]=i1;
                 idx++;
             }
             if(i1==n)
             {
                 good=idx;
             }
         }
         //소수로 이루어진 배열 생성
         int cnt=0;
         int sum=0;
         for(int i1=0; i1<good; i1++)
         {
            sum=0;
            for(int i2=i1; i2<good; i2++)
            {
                sum+=arr[i2];
               //System.out.println(sum+" "+arr[i2]);
                if(sum==n)
                {
                    cnt++;
                    break;
                }
                else if(n<sum)
                {
                    break;
                }
            }
         //    System.out.println();
         }
         System.out.println(cnt);
     }
}