package arrays;
import java.util.Scanner;
public class Frenquency {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int size = sc.nextInt();
        System.out.println("Enter the element:");
        int element = sc.nextInt();
        int[] arr = new int[size];
        int count=0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if(arr[i]==element){
                count+=1;
            }
        }
        System.out.println("The frequency of "+element+" is "+count);
    }
}
