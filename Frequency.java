import java.util.*;
class Frequency
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int arr[]=new int[10];
        int num , i , j , c , c1 , k ;
        for(i=0;i<10;i++)
        {
            System.out.print("Enter  a number");
            arr[i]=in.nextInt();
        }
        for(i=0;i<10;i++)
        {
            c=0;
            num=arr[i];
            for(j=0;j<10;j++)
            {
                if(arr[j]==num)
                {
                    c=c+1;
                }
            }
            c1=0;
            for(k=i-1;k>=0;k--)
            {
                if(num==arr[k])
                {
                    c1=1;
                    break;
                }
            }
            if(c1==0)
            {
                System.out.println(num + " ---" +c);
            }
        }
    }
}


/* example input 1 , 2 , 1 , 5 , 3 , 2 , 2
 * output : 1 - 2
 *          2 - 3
 *          3 - 1
 *          5 - 1
 */

/*  example input 1 , 2 , 1 , 5 , 3 , 2 , 2
 *  output : 2 (the value which appears for maximum number of times)
 */