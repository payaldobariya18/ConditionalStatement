import java.util.Scanner;

public class StudentInformation {
    //WAP to input student name, roll no, 3 subjects marks and find out total, percentage and result if
    //he is pass or fail on basis of percentage (pass>=35) and also give them grade
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter student name");
        String name = scanner.nextLine();
        System.out.println("please enter rollno");
        int rollno = scanner.nextInt();
        System.out.println("please enter chemistry's marks");
        int chemistry = scanner.nextInt();
        System.out.println("please enter physics's marks");
        int physics = scanner.nextInt();
        System.out.println("please enter maths's marks");
        int maths = scanner.nextInt();
        int totalmarks = (chemistry + physics + maths);
        double perc = totalmarks / 3;

        System.out.println(name);
        System.out.println(rollno);
        System.out.println(chemistry);
        System.out.println(physics);
        System.out.println(maths);
        System.out.println(totalmarks);
        System.out.println(perc);
        // initialised percentage
        int percentage = 30;
        if (percentage >= 80) {
            System.out.println("A+");
        }
        else if (percentage >= 60)
        {
            System.out.println("A");
        }
        else if (percentage >= 50)
        {
            System.out.println("B");
        }
        else if (percentage >= 35)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("Fail");
        }


    }


}