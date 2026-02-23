package Task.Arrays;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;

public class Remove_element {
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
        System.out.println("Enter index to be removed:");
        int index=sc.nextInt();
        int[] arr1=new int[n-1];
        for (int i = 0; i <index ; i++) {
            arr1[i]=arr[i];
        }
        for (int i = index; i < arr1.length ; i++) {
            arr1[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
