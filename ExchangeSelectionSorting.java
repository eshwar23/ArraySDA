// wap to input n numbers in an array and arrange the first half number of values in ascending order
// and the second half  of the values in descending order ,
// also print the max within the first half and min within the second half
//****************************************************************************************************
//wap to input 10 numbers in an array and print the sum of 2nd least and 2nd max value
//****************************************************************************************************
// sorting is simply defined as arranging of values in ascending or descending order
// 5 2 4 3 1
// 1 2 3 4 5
//this sorting is known as exchange selection sort or selection sort
//****************************************************************************************************
import java.util.*;
class ExchangeSelectionSorting
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int  i , j ,min ,minp,t; // min to max
        int arr[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the number of the array");
            arr[i]=in.nextInt();
        }
        System.out.println("Original array");
        for(i=0;i<10;i++)
        {
            System.out.print(arr[i]+", ");
        }
        for(i=0;i<10;i++)
        {
            min=arr[i]; // max =arr[i]
            minp=i;  // maxp=i
            for(j=i+1;j<9;j++)
            {
                if(arr[j]<min)// arr[j]>max
                {
                    min=arr[j];
                    minp=j;
                }
            }
            t=arr[i];
            arr[i]=arr[minp];
            arr[minp]=t;
        }
        System.out.println("sorted array");
        for(i=0;i<10;i++)
        {
            System.out.print(arr[i]+", ");
        }
    }
}

/* t=arr[1];
 * arr[1]=arr[8];
 * arr[8]=t
 */




//
        