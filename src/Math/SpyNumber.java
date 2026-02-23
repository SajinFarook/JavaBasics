package Math;

import java.util.Scanner;

public class SpyNumber {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= sc.nextInt();
        int sum=0;
        int prod=1;
        while(num!=0){
            int last=num%10;
            prod*=last;
            sum+=last;
            num/=10;
        }
        if(sum==prod){
            System.out.println("The entered number is a spy number");
        }
        else{
            System.out.println("The entered number is a spy number");
        }
    }
}
