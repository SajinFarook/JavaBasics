package Pattern;

import java.util.Scanner;
//A
//B C
//D E F
//G H I J
//K L M N O
public class CharPattern1 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        char ch='A';
        int size= sc.nextInt();
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size; j++) {
                if(i>=j){
                    System.out.print(ch+" ");
                    ch++;
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            ch++;
        }
    }
}
