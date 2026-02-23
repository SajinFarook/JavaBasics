package Math;

import java.util.Scanner;

public class PetersonNumber {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= sc.nextInt();
        int temp=num;
        int sum=0;
        while(num>0){
            int last=num%10;
            int fact=1;
            for(int i=1;i<=last;i++){
                fact*=i;
            }
            num/=10;
            sum+=fact;
        }
        if (sum==temp){
            System.out.println("Entered number is a Peterson Number");
        }
        else{
            System.out.println("Entered number is a Peterson Number");
        }
    }
}
