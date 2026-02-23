package Task.Arrays;

import java.util.Scanner;

public class Find_index {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array elements:");
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter key element:");
        boolean found=false;
        int index=0;
        int key=sc.nextInt();
        for (int i = 0; i <size ; i++) {
            if(arr[i]==key) {
                found = true;
                index=i;
            }
        }
        if(found){
            System.out.println("Element found at index:"+index);
        }
        else {
            System.out.println("Element not found");
        }
    }
}
