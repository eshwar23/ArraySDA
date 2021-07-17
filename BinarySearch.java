/*write a program to impliment Binary Search
 * 
 */
import java.util.*;
class BinarySearch
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int arr[]=new int[10];
        int lb,ub,mid=0,sv,i,k=0 ;
        System.out.println("Enter numbers in Ascending order");
        for(i=0;i<10;i++)
        {
            System.out.println("Enter a number");
            arr[i]=in.nextInt();
        }
        System.out.println("Enter a number to be searched");
        sv=in.nextInt();
        lb=0;
        ub=9;
        while(lb<ub)
        {
            mid=(lb+ub)/2;
            if(arr[mid]==sv)
            {
                k=1;
                break;
            }
            if (arr[mid]>sv)
            {
                ub=mid-1;
            }
            if(arr[mid]<sv)
            {
                lb=mid+1;
            }
        }
        if(k==0)
        {
            System.out.println("Value not found");
        }
        else
        {
            System.out.println("Value found at "+(mid+1) +" position");
        }
    }
}