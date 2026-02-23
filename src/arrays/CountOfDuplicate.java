package arrays;

import java.util.Scanner;

public class CountOfDuplicate {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i <size ; i++) {
            arr[i]= sc.nextInt();
        }
        int count=0;
        for (int i = 0; i <size ; i++) {
            count=1;
            for (int j = i+1; j <size ; j++) {
                if(arr[i]==arr[j]){
                    count+=1;
                }
            }
            if(count>1){
                System.out.println("Count of duplicates: "+count);
            }
        }
    }
}
