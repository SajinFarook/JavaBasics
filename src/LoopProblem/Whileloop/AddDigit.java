package LoopProblem.Whileloop;
import java.util.Scanner;
public class AddDigit {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int count= sc.nextInt();
        int sum=0;
        while(count!=0){
            int last=count%10;
            sum+=last;
            count/=10;
        }
        System.out.println(sum);
    }
}
