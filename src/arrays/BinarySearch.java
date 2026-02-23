package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        // bubble sorting
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int end=arr.length-1;
        int start=0;
        System.out.println("Enter a target element:");
        int target= sc.nextInt();
        while(start<=end){
            System.out.println("in");
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                System.out.println("Element found in index: "+mid);
                break;
            }
            else if (target>arr[mid]) {
                start=mid+1;
            }
            else if (target<arr[mid]) {
                end=mid-1;
            }
            else{
                System.out.println("Target not found");
                break;
            }
        }
        System.out.println("Out of loop");
    }
}
