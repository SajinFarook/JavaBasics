package Math;

import java.util.Scanner;

public class BuzzNumber {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if(num%10==7 || num%7==0){
            System.out.println("The number is a bus number");
        }
        else{
            System.out.println("The number is not a bus number");
        }
    }
}
