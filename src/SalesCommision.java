import java.util.Scanner;

public class SalesCommision {
//

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter sales id: ");
        int id = scanner.nextInt();
        System.out.println("Please enter seller's name: ");
        String name = scanner.next();
        System.out.println("Please enter sales amount: ");
        double amount = scanner.nextDouble();
        System.out.println("please enter basic salary: ");
        double salary = scanner.nextDouble();
        if (amount>= 50000)
        {
            System.out.println("Sales commition will be 35%");
        }else if (amount>=30000)
        {
            System.out.println("Sales commition will be 20%");
        }else if (amount>=20000){
            System.out.println("Sales amount will be 10%");
        }else if (amount>=10000){
            System.out.println("Sales amount will be 5%");
        }else {
            System.out.println("Sales amount will be 2%");
        }























    }




}
