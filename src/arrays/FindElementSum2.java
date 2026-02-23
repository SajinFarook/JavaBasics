package arrays;

import java.util.Scanner;

public class FindElementSum2 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Target:");
        int target=sc.nextInt();
        System.out.println("Enter a size:");
        int size=sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <size ; i++) {
            for (int j = i+1; j < size; j++) {
                for (int k = j+1; k <size ; k++) {
                    int sum=arr[i]+arr[j]+arr[k];
                    if(sum==target){
                        System.out.println("Sum of element equal to the target was found at index "+i+" , "+j+" and "+k);
                    }
                }
            }
        }
    }
}
