import java.util.Scanner;

public class PositiveNegativeZero
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
    int a;
    a = scanner.nextInt();
    if (a>0)
    {
        System.out.println(a + " is positive number.");
    }else if (a<0)
    {
        System.out.println(a + " is negative number.");
    }
    else
    {
        System.out.println(a + " is a Zero.");
    }







    }






}
