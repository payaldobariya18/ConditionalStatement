import java.util.Scanner;

public class LeapYear {
    // java programme to find out any year if it is leap year
    public static void main(String[] args) {
        //creat object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            System.out.println("The enter year " + year + " is a leap year.");

        } else
        {
            System.out.println("The enter year " + year + " is not a leap year.");

        }


    }
}