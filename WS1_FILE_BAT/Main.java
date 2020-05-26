
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author hoang lam
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    //Main Screen
    static void mainScreen() {
        System.out.println("Welcome to my workshop 1");
        System.out.println("Choose 1 to 4:");
        System.out.println("1) Convert the starting time in hours and minutes ");
        System.out.println("2) Ending time calculator");
        System.out.println("3) Concate full name");
        System.out.println("4) Exit program");
    }

    /*program to convert the starting time in hours and minutes 
    to the equivalent total minutes */
    static void convert() {
        Scanner input = new Scanner(System.in);
        int i;
        do {
            i = 1;
            int hour, minute, totalTime;
            System.out.println("Enter the time you want to converting:");
            System.out.println("Hours: ");
            hour = Integer.parseInt(input.nextLine());
            System.out.println("Minutes: ");
            minute = Integer.parseInt(input.nextLine());
            totalTime = hour * 60 + minute;
            System.out.println("Total minutes: " + totalTime);
            System.out.println("Do you want to continue convert? Y/N");
            if (input.nextLine().equals("N")) {
                i = 2;
            }
        } while (i == 1);
    }

    /*program that can serve as a ending time calculator. 
    The user enters the starting time in hours and minutes, a duration in total minutes, 
    and your program will calculate and display the ending time (as hours:minutes).
     */
    static void timeCalculator() {
        int i;
        do {
            i = 1;
            Scanner input = new Scanner(System.in);
            String pattern = "00";
            DecimalFormat decimalFormat = new DecimalFormat(pattern);
            int hour, minute, after;
            System.out.println("Enter starting time: ");
            System.out.println("Hour: ");
            hour = Integer.parseInt(input.nextLine());
            System.out.println("Minute: ");
            minute = Integer.parseInt(input.nextLine());
            System.out.println("After (Munite): ");
            after = Integer.parseInt(input.nextLine());
            minute += after % 60;
            hour += minute / 60 + after / 60;
            hour %= 24;
            minute %= 60;

            String formattedHour = decimalFormat.format(hour);
            String formattedMinute = decimalFormat.format(minute);
            System.out.println(formattedHour + ":" + formattedMinute);
            System.out.println("Do you want to continue convert? Y/N");
            if (input.nextLine().equals("N")) {
                i = 2;
            }
        } while (i == 1);
    }
//Use String variables and string concatenation
    static void concateName() {
        int i;
        do {
            i = 1;
            Scanner input = new Scanner(System.in);
            String firstName, middleName, lastName;
            System.out.println("Enter your first name: ");
            firstName = input.nextLine();
            System.out.println("Enter your middle name: ");
            middleName = input.nextLine();
            System.out.println("Enter your last name: ");
            lastName = input.nextLine();
            System.out.println("Hello " + firstName + " " + middleName + " " + lastName);
            System.out.println("Do you want to continue convert? Y/N");
            if (input.nextLine().equals("N")) {
                i = 2;
            }
        } while (i == 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        do {
            i = 1;
            mainScreen();
            switch (Integer.parseInt(input.nextLine())) {
                case 1:
                    convert();
                    break;
                case 2:
                    timeCalculator();
                    break;
                case 3:
                    concateName();
                    break;
                case 4:
                    i = 2;
                    System.out.println("Have a good day! Good bye");
                    break;
                default:
                    System.out.println("Choose again!!");
            }
        } while (i == 1);

    }

}
