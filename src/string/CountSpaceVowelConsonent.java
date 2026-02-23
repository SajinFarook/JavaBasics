package string;

import java.util.Scanner;

public class CountSpaceVowelConsonent {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name:");
        String name=sc.nextLine();
        String vowel="aeiouAEIOU";
        String digit="1234567890";
        int vowel_count=0;
        int consotent_count=0;
        int space_count=0;
        int digit_count=0;
        for(int i=0;i<name.length();i++){
//            StringBuilder sb=new StringBuilder();
//            sb.append(name.charAt(i));
            if(vowel.contains(Character.toString(name.charAt(i)))){
                vowel_count+=1;
            }
            else if (name.charAt(i)==' ') {
                space_count+=1;
            }
            else if (digit.contains(Character.toString(name.charAt(i)))) {
                digit_count+=1;
            }
            else{
                consotent_count+=1;
            }
        }
        System.out.println("The count of vowel in the string is: "+vowel_count);
        System.out.println("The count of consonent in the string is: "+consotent_count);
        System.out.println("The count of digit in the string is: "+digit_count);
        System.out.println("The count of space in the string is: "+space_count);
    }
}
