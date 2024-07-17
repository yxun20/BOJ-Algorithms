import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

public class gold5_2447{
    static char[][] arr;
    
     public static void main(String[] ar){
         Scanner in= new Scanner(System.in);
         int n =in.nextInt();
         arr = new char[n][n];
         
         star(0,0,n,false);
         
         StringBuilder sb = new StringBuilder();
         for (int i = 0; i < n; i++) 
         {
             for (int j = 0; j < n; j++) 
             {
                 sb.append(arr[i][j]);
             }
             sb.append('\n');
         }
         System.out.print(sb);
         
         
     }
    public static void star(int x, int y, int n, boolean blank)
    {
        if(blank)
        {
            for(int i1=x; i1<x+n; i1++)
            {
                for(int i2=y; i2<y+n; i2++)
                {
                    arr[i1][i2]=' ';
                }
            }
            return;
        }
        if(n==1)
        {
            arr[x][y]='*';
            return;
        }
        
        int size=n/3;
        int cnt=0;
        for(int i1=x;i1<x+n; i1+=size)
        {
            for(int i2=y; i2<y+n; i2+=size)
            {
                cnt++;
                if(cnt==5)
                {
                    star(i1,i2,size,true);
                }
                else 
                {
                    star(i1,i2,size,false);
                }
            }
        }
    }
}