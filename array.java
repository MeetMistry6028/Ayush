import java.util.Arrays;
import java.util.Scanner;

public class array
{
    public static void FixedSize()
    {
        int i;
       
        int[] a={1,2,3,4,5,6,7,8,9,10};
       

        for(i=0;i<10;i++)
        System.out.println(a[i]);
    }

    public static void size(int n)
    {
        int i;
        int[] a= new int[10];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array elements...");
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();

        System.out.println("\nYour array elements...");
        for(i=0;i<n;i++)
        System.out.println(a[i]);            
    }

    public static void reverse()
    {
        int i;
        int[] a ={1,2,3,4,5};

        System.out.println("\nYour array elements...");
        for(i=0;i<5;i++)
        System.out.println(a[i]); 

        System.out.println("\nreverse array elements...");
        for(i=4;i>=0;i--)
        System.out.println(a[i]);
    }

    public static void maximum()
    {
        int i,j,max;
        int[] a ={1,2,3,4,5};

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array elements...");
        for(i=0;i<5;i++)
        a[i]=sc.nextInt();

        max=a[0];
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if(a[i]<a[j])
                max=a[j];
            }
        }

        System.out.println("Maximum of array is="+max);
    }

    public static void average()
    {
        int i,sum=0,avg;
        int[] a= new int[5];

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array elements...");
        for(i=0;i<5;i++)
        a[i]=sc.nextInt();

        for(i=0;i<5;i++)
        sum = sum + a[i];

        avg =(int) sum/5;
        System.out.println("Average of array elements is="+avg);
    }

    public static void sorting()
    {
        int i,j,temp=0;
        int[] a= new int[5];

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array elements...");
        for(i=0;i<5;i++)
        a[i]=sc.nextInt();

        Arrays.sort(a);

        System.out.println("\nSorted array elements...");
        for(i=0;i<5;i++)
        System.out.println(a[i]); 
        
    }

    public static int search(int n)
    {
        int i;
        int[] a ={1,2,3,4,5};
        System.out.println("hello"+a[2]);
        for(i=0;i<5;i++)
        {
            if(a[i]==n)
            {
                System.out.println(+i);
                return i;
            }
        }
        return -1;
    }

    public static int s()
    {
        int [] a={1,2,3,4,5};
        int size;
        size= a.length;
        System.out.println(size);
        return size;
    }

    public static void main(String[] arg)
    {
        //FixedSize();
        //size(5);
        //reverse();
        maximum();
        average();
        sorting();
        System.out.println(search(3));
        System.out.println("Size of array="+s());
       
    }
}
    
    
