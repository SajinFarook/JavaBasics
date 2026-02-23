package Math;

import java.util.Scanner;

public class PrimeNumber {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter digit:");
        int num= sc.nextInt();
        while(num!=0){
            int last=num%10;
            int count=0;
            for(int i=2;i<last;i++){
                if(last%i==0){
                    count+=1;
                }
            }
            if(count==0){
                System.out.println(last+" is a prime number");
            }
            else{
                System.out.println(last+" is not a prime number");
            }
            num/=10;
        }
    }
}
