import java.util.Scanner;

public class InterchangedValue

{
    public static void main(String[] args) {
       int a , b, t; // a and b are to interchange
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Before interchanging numbers : "+a+" "+b);
        //interchanging
        t = a;
        a = b;
        b = t;
        System.out.println("After interchanging : "+a+" "+b);
        System.out.println();











    }









}
