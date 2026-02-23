package Math;

import java.util.Scanner;

public class CountPrimeDigit {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        boolean is_prime=true;
        int count=0;
        while(num!=0){
            int last=num%10;
            if(last>1){
                for (int i = 2; i <last ; i++){
                    if(last%i==0){
                        is_prime=false;
                    }
                }
                if (is_prime==true){
                    count+=1;
                }
            }
            num/=10;
        }
        System.out.println("Count of prime digit are: "+count);
    }
}
