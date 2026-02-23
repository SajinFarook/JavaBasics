package ConsoleApplication;
import java.util.Scanner;
public class MovieTicketApplication {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("This is a Console Based Movie Booking Application");
        String og_name="SajinFarook";
        String og_password="sajin123";
        int attempt=1;
        int pass_attempt=1;
        while(attempt<=3){
            System.out.println("Enter Username:");
            String name=sc.nextLine();
            if(name.equals(og_name)){
                while(pass_attempt<=3){
                    System.out.println("Enter Password:");
                    String pass=sc.nextLine();
                    if(pass.equals(og_password)){
                        System.out.println("Available Movies:\n 1)Jana Nayagan\n 2)Coolie\n 3)Parasakthi\n 4)Sirai\n 5)Exit");
                        System.out.println("Enter an Option:");
                        int opt=sc.nextInt();
                        double price=180.30;
                        double convience_charge=35.4;
                        switch (opt){
                            case 1:
                                System.out.println("Show Timings");
                                System.out.println("1)9:30 am\n2)10:30 am\n3)1:30 pm\n4)4:45 pm");
                                System.out.println("Choose a Timing:");
                                int opt1=sc.nextInt();
                                switch (opt1){
                                    case 1:
                                        System.out.println("Enter Number Tickets Needed:");
                                        int no_of_Ticket= sc.nextInt();
                                        double convience_charge1=convience_charge*no_of_Ticket;
                                        System.out.println("Ticket Succesfully Booked:-\n"+"Movie Name: Jana Nayagan\n"+"Movie Timing: 9:30 am\n"+"No of Tickets Booked: "+no_of_Ticket+"\nConvience Charge: "+(float)convience_charge1+"\nTotal price:"+(float)((no_of_Ticket*price)+convience_charge1));
                                        break;
                                    case 2:
                                        System.out.println("Enter Number Tickets Needed:");
                                        int no_of_Ticket1= sc.nextInt();
                                        double convience_charge2=convience_charge*no_of_Ticket1;
                                        System.out.println("Ticket Succesfully Booked:-\n"+"Movie Name: Jana Nayagan\n"+"Movie Timing: 10:30 am\n"+"No of Tickets Booked: "+no_of_Ticket1+"\nConvience Charge: "+(float)convience_charge2+"\nTotal price:"+(float)((no_of_Ticket1*price)+convience_charge2));
                                        break;
                                    case 3:
                                        System.out.println("Enter Number Tickets Needed:");
                                        int no_of_Ticket2= sc.nextInt();
                                        double convience_charge3=convience_charge*no_of_Ticket2;
                                        System.out.println("Ticket Succesfully Booked:-\n"+"Movie Name: Jana Nayagan\n"+"Movie Timing: 1:30 pm\n"+"No of Tickets Booked: "+no_of_Ticket2+"\nConvience Charge: "+(float)convience_charge3+"\nTotal price:"+(float)((no_of_Ticket2*price)+convience_charge3));
                                        break;
                                    case 4:
                                        System.out.println("Enter Number Tickets Needed:");
                                        int no_of_Ticket3= sc.nextInt();
                                        double convience_charge4=convience_charge*no_of_Ticket3;
                                        System.out.println("Ticket Succesfully Booked:-\n"+"Movie Name: Jana Nayagan\n"+"Movie Timing: 4:45 pm\n"+"No of Tickets Booked: "+no_of_Ticket3+"\nConvience Charge: "+(float)convience_charge4+"\nTotal price:"+(float)((no_of_Ticket3*price)+convience_charge4));
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("Show Timings");
                                System.out.println("1)9:30 am\n2)10:30 am\n3)1:30 pm\n4)4:45 pm");
                                System.out.println("Choose a Timing:");
                                int opt2=sc.nextInt();
                                switch (opt2){
                                    case 1:
                                        System.out.println("Enter Number Tickets Needed:");
                                        int no_of_Ticket= sc.nextInt();
                                        double convience_charge1=convience_charge*no_of_Ticket;
                                        System.out.println("Ticket Succesfully Booked:-\n"+"Movie Name: Coolie\n"+"Movie Timing: 9:30 am\n"+"No of Tickets Booked: "+no_of_Ticket+"\nConvience Charge: "+(float)convience_charge1+"\nTotal price:"+(float)((no_of_Ticket*price)+convience_charge1));
                                        break;
                                    case 2:
                                        System.out.println("Enter Number Tickets Needed:");
                                        int no_of_Ticket1= sc.nextInt();
                                        double convience_charge2=convience_charge*no_of_Ticket1;
                                        System.out.println("Ticket Succesfully Booked:-\n"+"Movie Name: Coolie\n"+"Movie Timing: 10:30 am\n"+"No of Tickets Booked: "+no_of_Ticket1+"\nConvience Charge: "+(float)convience_charge2+"\nTotal price:"+(float)((no_of_Ticket1*price)+convience_charge2));
                                        break;
                                    case 3:
                                        System.out.println("Enter Number Tickets Needed:");
                                        int no_of_Ticket2= sc.nextInt();
                                        double convience_charge3=convience_charge*no_of_Ticket2;
                                        System.out.println("Ticket Succesfully Booked:-\n"+"Movie Name: Coolie\n"+"Movie Timing: 1:30 pm\n"+"No of Tickets Booked: "+no_of_Ticket2+"\nConvience Charge: "+(float)convience_charge3+"\nTotal price:"+(float)((no_of_Ticket2*price)+convience_charge3));
                                        break;
                                    case 4:
                                        System.out.println("Enter Number Tickets Needed:");
                                        int no_of_Ticket3= sc.nextInt();
                                        double convience_charge4=convience_charge*no_of_Ticket3;
                                        System.out.println("Ticket Succesfully Booked:-\n"+"Movie Name: Coolie\n"+"Movie Timing: 4:45 pm\n"+"No of Tickets Booked: "+no_of_Ticket3+"\nConvience Charge: "+(float)convience_charge4+"\nTotal price:"+(float)((no_of_Ticket3*price)+convience_charge4));
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("Show Timings");
                                System.out.println("1)9:30 am\n2)10:30 am\n3)1:30 pm\n4)4:45 pm");
                                System.out.println("Choose a Timing:");
                                int opt3=sc.nextInt();
                                switch (opt3){
                                    case 1:
                                        System.out.println("Enter Number Tickets Needed:");
                                        int no_of_Ticket= sc.nextInt();
                                        double convience_charge1=convience_charge*no_of_Ticket;
                                        System.out.println("Ticket Succesfully Booked:-\n"+"Movie Name: Parasakthi\n"+"Movie Timing: 9:30 am\n"+"No of Tickets Booked: "+no_of_Ticket+"\nConvience Charge: "+(float)convience_charge1+"\nTotal price:"+(float)((no_of_Ticket*price)+convience_charge1));
                                        break;
                                    case 2:
                                        System.out.println("Enter Number Tickets Needed:");
                                        int no_of_Ticket1= sc.nextInt();
                                        double convience_charge2=convience_charge*no_of_Ticket1;
                                        System.out.println("Ticket Succesfully Booked:-\n"+"Movie Name: Parasakthi\n"+"Movie Timing: 10:30 am\n"+"No of Tickets Booked: "+no_of_Ticket1+"\nConvience Charge: "+(float)convience_charge2+"\nTotal price:"+(float)((no_of_Ticket1*price)+convience_charge2));
                                        break;
                                    case 3:
                                        System.out.println("Enter Number Tickets Needed:");
                                        int no_of_Ticket2= sc.nextInt();
                                        double convience_charge3=convience_charge*no_of_Ticket2;
                                        System.out.println("Ticket Succesfully Booked:-\n"+"Movie Name: Parasakthi\n"+"Movie Timing: 1:30 pm\n"+"No of Tickets Booked: "+no_of_Ticket2+"\nConvience Charge: "+(float)convience_charge3+"\nTotal price:"+(float)((no_of_Ticket2*price)+convience_charge3));
                                        break;
                                    case 4:
                                        System.out.println("Enter Number Tickets Needed:");
                                        int no_of_Ticket3= sc.nextInt();
                                        double convience_charge4=convience_charge*no_of_Ticket3;
                                        System.out.println("Ticket Succesfully Booked:-\n"+"Movie Name: Parasakthi\n"+"Movie Timing: 4:45 pm\n"+"No of Tickets Booked: "+no_of_Ticket3+"\nConvience Charge: "+(float)convience_charge4+"\nTotal price:"+(float)((no_of_Ticket3*price)+convience_charge4));
                                        break;
                                }
                                break;
                            case 4:
                                System.out.println("Show Timings");
                                System.out.println("1)9:30 am\n2)10:30 am\n3)1:30 pm\n4)4:45 pm");
                                System.out.println("Choose a Timing:");
                                int opt4=sc.nextInt();
                                switch (opt4){
                                    case 1:
                                        System.out.println("Enter Number Tickets Needed:");
                                        int no_of_Ticket= sc.nextInt();
                                        double convience_charge1=convience_charge*no_of_Ticket;
                                        System.out.println("Ticket Succesfully Booked:-\n"+"Movie Name: Sirai\n"+"Movie Timing: 9:30 am\n"+"No of Tickets Booked: "+no_of_Ticket+"\nConvience Charge: "+(float)convience_charge1+"\nTotal price:"+(float)((no_of_Ticket*price)+convience_charge1));
                                        break;
                                    case 2:
                                        System.out.println("Enter Number Tickets Needed:");
                                        int no_of_Ticket1= sc.nextInt();
                                        double convience_charge2=convience_charge*no_of_Ticket1;
                                        System.out.println("Ticket Succesfully Booked:-\n"+"Movie Name: Sirai\n"+"Movie Timing: 10:30 am\n"+"No of Tickets Booked: "+no_of_Ticket1+"\nConvience Charge: "+(float)convience_charge2+"\nTotal price:"+(float)((no_of_Ticket1*price)+convience_charge2));
                                        break;
                                    case 3:
                                        System.out.println("Enter Number Tickets Needed:");
                                        int no_of_Ticket2= sc.nextInt();
                                        double convience_charge3=convience_charge*no_of_Ticket2;
                                        System.out.println("Ticket Succesfully Booked:-\n"+"Movie Name: Sirai\n"+"Movie Timing: 1:30 pm\n"+"No of Tickets Booked: "+no_of_Ticket2+"\nConvience Charge: "+(float)convience_charge3+"\nTotal price:"+(float)((no_of_Ticket2*price)+convience_charge3));
                                        break;
                                    case 4:
                                        System.out.println("Enter Number Tickets Needed:");
                                        int no_of_Ticket3= sc.nextInt();
                                        double convience_charge4=convience_charge*no_of_Ticket3;
                                        System.out.println("Ticket Succesfully Booked:-\n"+"Movie Name: Sirai\n"+"Movie Timing: 4:45 pm\n"+"No of Tickets Booked: "+no_of_Ticket3+"\nConvience Charge: "+(float)convience_charge4+"\nTotal price:"+(float)((no_of_Ticket3*price)+convience_charge4));
                                        break;
                                }
                                break;
                            case 5:
                                System.out.println("No Tickets were Booked");
                                break;
                        }
                        System.out.println("Thanks for using console based Movie Booking Application");
                    }
                    else{
                        System.out.println("Invalid Password");
                    }
                    pass_attempt+=1;
                }
                System.out.println("Try again later,Thank You :)");
                break;
            }
            else{
                System.out.println("Invalid Username");
            }
            attempt+=1;
        }
        System.out.println("Your total attempt has been exceeded,Try again later :)");
    }
}
