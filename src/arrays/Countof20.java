package arrays;

import java.util.Scanner;

public class Countof20 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int size=sc.nextInt();
        int count=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a key number:");
        int key=sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]>key){
                count+=1;
            }
        }
        System.out.println("The number a element that are above"+key+" in the arrays is "+count);
    }
}
