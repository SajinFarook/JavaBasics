package Alphabet;

import java.util.Scanner;

public class charlowerorupper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.nextLine().charAt(0);
        if(ch>= 'a' &&ch<= 'z'){
            System.out.println("lowercase "+ch);
        }
        else if(ch >= 65 && ch<=90){
            System.out.println("lowercase "+ch);
        }
        else{
            System.out.println("invalid");
        }
    }
}
