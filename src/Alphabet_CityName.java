import java.util.Scanner;

public class Alphabet_CityName {
  // java programme Input any alphabet from a to f and print their city name accordingly using switch any other
  //alphabet should be invalid entry
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any alphabet from a to f");
        String name= scanner.nextLine();
        switch (name)
        {
            case "a":
                System.out.println("Ahmedabad");
                break;
            case "b":
                System.out.println("Baroda");
                break;
            case "c":
                System.out.println("Culcatta");
                break;
            case "d":
                System.out.println("Dwarka");
                break;
            case "e":
                System.out.println("Imegica");
                break;
            case "f":
                System.out.println("Fiza");
                break;

            default:
                System.out.println("Invalid entry");








        }







    }




}
