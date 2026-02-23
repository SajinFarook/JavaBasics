package Pattern;

import java.util.Scanner;
//A
//A B
//A B C
//A B C D
//A B C D E
public class CharPattern2 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int size= sc.nextInt();
        for (int i = 0; i <size ; i++) {
            char ch='A';
            for (int j = 0; j <size; j++) {
                if(i>=j){
                    System.out.print(ch+" ");
                }
                else {
                    System.out.print(" ");
                }
                ch++;
            }
            System.out.println();
        }
    }
}
