import java.util.Scanner;

public class AgeForVote
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter age");
        int age;
        age = scanner.nextInt();
        if (age>=18)
        {
            System.out.println("The person  is eligible for vote");
        }
        else
        {
            System.out.println("The person  is not eligible for vote");
        }






    }




}
