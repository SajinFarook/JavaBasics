package string;

import java.util.Scanner;

public class WordCount {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String word=sc.nextLine();
        String [] arr=word.split(" ");
        System.out.println(arr.length);
    }
}

