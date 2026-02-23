package Math;
import java.util.Scanner;
public class BankBalance {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your account balance:");
        int bal= sc.nextInt();//5000
        int total_attempt=3;
        for(int attempt=1;attempt<=total_attempt;attempt++){
            System.out.println("Enter amount to withdraw: ");
            int withdraw= sc.nextInt();
            if(withdraw>bal){
                System.out.println("Insufficient Balance");
                if (attempt==total_attempt) {
                    System.out.println("You Ran out of attempts Please try again tomorrow :)");
                }
            }
            else{
                int Total_bal=bal-withdraw;
                System.out.println("Amount withdrawed: "+withdraw);
                System.out.println("Total Balance: "+Total_bal);
                break;
            }
        }
    }
}
