package Math;
import java.util.Scanner;
public class Largestdigit {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1=sc.nextInt();
        int largest=0;
        while(num1!=0){
            int last=num1%10;
            if(last>largest){
                largest=last;
            }
            num1/=10;
        }
        System.out.println("Largest digit in the number is "+largest);
    }
}
