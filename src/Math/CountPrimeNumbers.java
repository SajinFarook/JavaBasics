package Math;

import java.util.Scanner;

public class CountPrimeNumbers {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter digit:");
        int num= sc.nextInt();
        int no_of_prime=0;
        while(num!=0){
            int last=num%10;
            int count=0;
            for(int i=2;i<last;i++){
                if(last%i==0){
                    count+=1;
                }
            }
            if(count==0){
                no_of_prime+=1;
            }
            num/=10;
        }
        System.out.println("No of prime numbers is "+no_of_prime);
    }
}
