package Test;

import java.util.Scanner;

public class secsmallest {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int smallest=arr[0];
        int sec_smallest=0;
        for (int i=0;i<size;i++) {
            if(arr[i]<smallest){
                sec_smallest=smallest;
                smallest=arr[i];
            }
            else if (arr[i]<sec_smallest && arr[i]!=smallest) {
            }
        }
        System.out.println("Second Smallest number: "+sec_smallest);
    }
}
