package string;

import java.util.Scanner;

public class Duplicate {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s= sc.nextLine();
        StringBuilder sr=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sr.append(s.charAt(i)).append(s.charAt(i));
        }
        System.out.println("Duplicate String: "+sr);
    }
}
