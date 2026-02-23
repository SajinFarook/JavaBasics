package string;

import java.util.Scanner;

public class ReverseSB {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s= sc.nextLine();
        StringBuilder sr=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sr.append(s.charAt(i));
        }
        System.out.println("Reversed String: "+sr);
    }
}
