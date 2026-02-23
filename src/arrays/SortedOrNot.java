package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedOrNot {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int size=sc.nextInt();
        int[] arr1=new int[size];
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
            arr1[i]= arr[i];
        }
        System.out.println("Array before sorting:-");
        System.out.println(Arrays.toString(arr1));
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Array after sorting:-");
        System.out.println(Arrays.toString(arr));
        if(Arrays.toString(arr).equals(Arrays.toString(arr1))){
            System.out.println("The is sorted");
        }
        else{
            System.out.println("Not sorted");
        }
    }
}
