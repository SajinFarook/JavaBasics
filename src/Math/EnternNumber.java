package Math;

import java.util.Scanner;

public class EnternNumber {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of number to be entered:");
        int range=sc.nextInt();
        int even_n=0;
        int odd_n=0;
        int no_of_zeros=0;
        int pos_n=0;
        int neg_n=0;
        for(int i=1;i<=range;i++){
            System.out.println("Enter inputs");
            int num=sc.nextInt();
            if(num>0){
                pos_n+=1;
                if(num%2==0){
                    even_n+=1;
                }
                else{
                    odd_n+=1;
                }
            }
            else if (num<0) {
                neg_n+=1;
                if(num%2==0){
                    even_n+=1;
                }
                else{
                    odd_n+=1;
                }
            }
            else{
                no_of_zeros+=1;
            }
        }
        System.out.println("No.of Positive numbers: "+pos_n);
        System.out.println("No.of Negative numbers: "+neg_n);
        System.out.println("No.of Even numbers: "+even_n);
        System.out.println("No.of Odd numbers: "+odd_n);
        System.out.println("No.of zeros: "+no_of_zeros);
    }
}
