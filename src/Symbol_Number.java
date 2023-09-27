import java.util.Scanner;
// java programme for entering symbol(+,_,*,/) using switch
public class Symbol_Number {

    public static void main(String[] args) {
        //creat object for class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers :");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char symbol = scanner.next().charAt(0); //creating char value
        switch (symbol) {
            case '+':
                System.out.println("Addition of number " + a + " and " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println("Substraction of number " + a + " and " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication of number " + a + " and " + b + " = " + (a * b));
                break;
            case '/':
                System.out.println("Division  of number " + a + " and " + b + " = " + (a / b));

        }

        }









}
