package Pattern;
//A
//B B
//C C C
//D D D D
//E E E E E
import java.util.Scanner;
public class CharPattern {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int size= sc.nextInt();
        char ch='A';
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size; j++) {
                if(i>=j){
                    System.out.print(ch+" ");
                }
                else {
                    System.out.print(" ");
                }
            }
            ch++;
            System.out.println();
        }
    }
}
