package Math;

import java.util.Scanner;

public class Palindrome{
    static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(num>0){
            int remin=num%10;
            rev=rev*10+remin;
            num/=10;
        }
        if (rev==temp){
            System.out.println("Is a palindrome number");
        }
        else{
            System.out.println("Not a palindrome number");
        }
    }
}
