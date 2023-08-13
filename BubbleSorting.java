import java.util.*;
class BubbleSorting
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int arr[]=new int[10];
        int i,j,t ;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter a number");
            arr[i]=in.nextInt();
        }
        System.out.println("Values before sorting");
        for(i=0;i<10;i++)
        {
            System.out.print(arr[i]+",");
        }
        for(i=0;i<10;i++)
        {
            for(j=0;j<9-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println();
        System.out.println("Values after sorting");
        for(i=0;i<10;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
    
}