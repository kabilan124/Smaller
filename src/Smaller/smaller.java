package Smaller;

import java.util.Scanner;

public class smaller{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr []=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] num=smallnum(arr ,a);
        System.out.println(num);
    }
    public static int[] smallnum(int arr[],int a)
    {
        int i;
        int x[] =new int[arr.length];
        for( i=0;i<a;i++);
        {
            x[i]=0;
        }
        for(int j=i+1;j<a;j++)
        {
            if(arr[j]<arr[i])
            {
                x[i]++;
            }
        }
        return x;
    }


}