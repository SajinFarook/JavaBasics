package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array before sorting:-");
        System.out.println(Arrays.toString(arr));
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
    }
}
