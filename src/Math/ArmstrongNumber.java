package Math;

import java.util.Scanner;

public class ArmstrongNumber {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int pow=0;
        int temp=num;
        int temp2=num;
        int total=0;
        while(temp!=0){
            pow+=1;
            temp/=10;
        }
        while(temp2!=0){
            int prod=1;
            int last=temp2%10;
            for(int i=0;i<pow;i++){
                prod*=last;
            }
            temp2/=10;
            total+=prod;
        }
        if(num==total){
            System.out.println(num+" is a Armstrong Number");
        }
        else{
            System.out.println(num+" is not a Armstrong Number");
        }
    }
}
