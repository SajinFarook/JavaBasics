package Task.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Insert_element {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter Array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter in which index to be inserted:");
        int index=sc.nextInt();
        System.out.println("Enter an element to insert:");
        int new_element=sc.nextInt();
        int[] arr1=new int[n+1];
        for (int i = 0; i <index ; i++) {
            arr1[i]=arr[i];
        }
        arr1[index]=new_element;
        for (int i =index+1; i < arr1.length ; i++) {
            arr1[i]=arr[i-1];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
