//wap to input 10 numbers in an array and a value 
//check if the value is present in the array or not 

import java.util.*;//or import java.util.Scanner;
class LinearSearch
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int arr[]=new int[10];
        int i ,n , c=0;
        for(i=0;i<10;i++)
        {
            System.out.print("Enter a number");
            arr[i]=in.nextInt();
        }
        System.out.println("Enter a number to be searched in array");
        n=in.nextInt();
        for(i=0;i<10;i++)
        {
            if(arr[i]==n)
            {
                c=c+1;
                break;
            }
        }
        if (c==1)
        {
            System.out.println("search successful "+n);
        }
        else
        {
            System.out.println("search NOT successful "+n);
        }
    }
}