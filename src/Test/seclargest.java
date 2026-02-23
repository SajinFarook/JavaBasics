package Test;

import java.util.Scanner;

public class seclargest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        int sec_largest=0;
        for(int i=0;i<size;i++){
            if(arr[i]>largest){
                sec_largest=largest;
                largest=arr[i];
            }
            else if(arr[i]>sec_largest && arr[i]!=sec_largest){
                sec_largest=arr[i];
            }
        }
        System.out.println("Second largest number:"+sec_largest);
    }
}
