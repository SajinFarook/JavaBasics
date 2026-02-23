package Pattern;
import java.util.Scanner;
//A
//B F
//C G J
//D H K M
//E I L N O
public class CharPattern3 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int size= sc.nextInt();
        char ch='A';
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
            ch--;
            System.out.println();
        }
    }
}
