package string;

import java.util.Scanner;

public class ReverseTheCharacterInAString {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word= sc.nextLine().trim();
        String[] String_Array =word.split(" ");
        StringBuilder newword=new StringBuilder();
        for (int i = 0; i < String_Array.length; i++) {
            StringBuilder sb=new StringBuilder(String_Array[i]);
            newword.append(sb.reverse());
            newword.append(" ");
        }
        System.out.println(newword);
    }
}
