import java.util.Scanner;

public class Employee
{ // java programme to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary

    public static void main(String[] args) {
        //creating object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter employee id: ");
        int id = scanner.nextInt();
        System.out.println("Please enter employee's name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter employee's basic salary: ");
        double basicSalary = scanner.nextDouble();
        double HRA = 0.10 * basicSalary; // 10% of basic salary
        double DA = 0.08 * basicSalary;  // 8% of basic salary
        double TA = 0.09 * basicSalary; // 9% of basic salary
        double PF = 0.20 * basicSalary; // 20% of basic salary
        double grossSalary = basicSalary + HRA + DA +TA + PF; // Ggross salary calculate
       // printing calaculated values of subject with total gross salary
        System.out.println("HRA: " + HRA);
        System.out.println("DA: " + DA);
        System.out.println("TA: " + TA);
        System.out.println("PF: " + PF);


    }



}
