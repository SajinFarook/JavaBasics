package arrays;
import java.util.Scanner;
public class FindElementSumEqualtoGivenTarget {
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
                int sum=arr[i]+arr[j];
                if(sum==target){
                    System.out.println("Sum of element equal to the target was found at index "+i+" and "+j);
                }
            }
        }
    }
}
