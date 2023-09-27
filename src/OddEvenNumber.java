import java.util.Scanner;

public class OddEvenNumber {
   // java programme to find out  given number is odd or even use turnery operator (? :)
   public static void main(String[] args) {
      // creating object
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num = scanner.nextInt();
      //condition is the given num is divisible 2
     String result = (num%2==0)? "even" : "odd"; // turnery operator's syntax
      System.out.println(num + " is " + result);




   }







}
