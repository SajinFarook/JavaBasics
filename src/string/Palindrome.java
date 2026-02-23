package string;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Palindrome {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String word=sc.nextLine();
//        StringBuilder sb=new StringBuilder(word);
//        sb=sb.reverse();
//        if(word.equals(sb.toString())){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not Palindrome");
//        }
        String newword=" ";
        for (int i = word.length()-1; i >=0 ; i--) {
            StringBuilder sb=new StringBuilder(newword);
            sb.append(word.charAt(i));
            sb.append(sb.toString());
        }
        System.out.println("Reverse word: "+newword);
        if(word.equals(newword)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
