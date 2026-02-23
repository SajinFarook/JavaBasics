package Math;

import java.util.Scanner;

public class BinaryNumber {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= sc.nextInt();
        int count=0;
        int temp=num;
        while(num!=0){
            int last=num%10;
            if(last>1){
                count+=1;
            }
            num/=10;

        }
        if(count==0){
            System.out.println(temp+" is a binary number");
        }
        else{
            System.out.println(temp+" is not a binary number");
        }
    }
}
