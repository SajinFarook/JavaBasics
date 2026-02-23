package Task.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size=sc.nextInt();
        System.out.println("Enter elements of array:");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before Reversing");
        System.out.println(Arrays.toString(arr));
        System.out.println("After Reversing");
        for(int i=0;i<size/2;i++){
            int temp=arr[i];
            arr[i]=arr[size-1-i];
            arr[size-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
