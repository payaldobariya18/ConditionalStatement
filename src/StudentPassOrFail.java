import java.util.Scanner;

public class StudentPassOrFail {
    //java programme student pass or fail on the basis of ...student needs to pass all the subjects.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter marks: ");
        int num;
        num = scanner.nextInt();
        if (num < 100 && num >= 80)
        {
            System.out.println("pass");
            System.out.println("A+ grade");
        }
        else if (num<80 && num >=60)
       {
            System.out.println("pass");
            System.out.println("A grade");
        }
        else if (num < 60 && num >= 50)
        {
            System.out.println("pass");
            System.out.println("B grade");
        }
        else if (num > 50 && num >= 35)
        {
            System.out.println("pass");
            System.out.println("C grade");
        }
        else
        {
            System.out.println("fail");
        }


    }
}