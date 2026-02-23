package Math;

import java.util.Scanner;

public class SumOfEven_Odd {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= sc.nextInt();
        int sum_even=0;
        int sum_odd=0;
        while(num!=0){
            int last=num%10;
            if(last%2==0){
                sum_even+=last;
            }
            else{
                sum_odd+=last;
            }
            num/=10;
        }
        System.out.println("The sum of even digit is: "+sum_even);
        System.out.println("The sum of odd digit is: "+sum_odd);
    }
}
