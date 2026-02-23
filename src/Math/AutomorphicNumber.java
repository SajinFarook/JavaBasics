package Math;

import java.util.Scanner;

public class AutomorphicNumber {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int sq=num*num;
        int temp=num;
        int count=1;
        while(temp!=0){
            count*=10;
            temp/=10;
        }
        if(sq%count==num){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not an Automorphic Number");
        }
    }
}
