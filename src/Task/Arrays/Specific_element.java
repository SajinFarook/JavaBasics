package Task.Arrays;

import java.util.Scanner;

public class Specific_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter key element:");
        boolean found=false;
        int key=sc.nextInt();
        for (int i = 0; i <size ; i++) {
            if(arr[i]==key) {
                found = true;
            }
        }
        if(found){
            System.out.println("Element found");
        }
        else {
            System.out.println("Element not found");
        }
    }
}

