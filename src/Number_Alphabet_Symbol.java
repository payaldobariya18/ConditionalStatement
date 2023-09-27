import java.util.Scanner;

public class Number_Alphabet_Symbol {
    // java programme to find out if it is number(0-9) or an alphabet or symbol
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter any value");
        char chr = scanner.next().charAt(0);
        //check weather value added is alphabet or number or symbol
      if (Character.isAlphabetic(chr))
      {
          System.out.println(chr +  " is an alphabet.");
      }
      else if (chr>= '0' && chr<= '9')
      {
          System.out.println(chr + " is a number.");

      }
      else
      {
          System.out.println(chr + " is a symbol.");
      }


    }
}