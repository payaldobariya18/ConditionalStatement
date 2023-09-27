import java.util.Scanner;

public class Average {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any five numbers");
         int n1,n2,n3,n4,n5;
         n1 = scanner.nextInt();
         n2 = scanner.nextInt();
         n3 = scanner.nextInt();
         n4 = scanner.nextInt();
         n5 = scanner.nextInt();
         double sum = n1+n2+n3+n4+n5;
        System.out.println("Total of five numbers: "+ sum);
        double average = sum/5;
        System.out.println("Average of five numbers: " + average);




    }




}
