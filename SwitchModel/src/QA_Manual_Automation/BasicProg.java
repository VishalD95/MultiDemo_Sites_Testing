package QA_Manual_Automation;

import java.util.Scanner;

public class BasicProg {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Name :");
        String name = sc.nextLine();
        String Surname = sc.next();
        System.out.println("Entered Name Is :" + name + " " + Surname);

    }


    static class Arithmetic  {

        public static void main(String[] args) {
            // Calculation arithmetic Program

            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter Your First Number :" );
            Double a = sc2.nextDouble();
            System.out.println("Enter Your Second Number :" );
            Double b = sc2.nextDouble();


            System.out.println("Your Addition is : " + ( a + b));
            System.out.println("Your Subtraction is : " + (a-b));
            System.out.println("Your Multiplication is : " + (a*b));
            System.out.println("Your Division is : " + (a/b));
            System.out.println("Your Remainder is : " + (a%b));

            if(b!=0){
                System.out.println("Your Division is : " + (a/b));
                System.out.println("Your Remainder is : " + (a%b));
            }else {
                System.out.println("Your Division & Reminder Number is not Possible to divide by Zero");
            }
        }
    }


    static class Interest {
        public static void main(String[] args) {

            Scanner sc3 = new Scanner(System.in);

            System.out.println("Enter Loan Amount : ");
            double Amount = sc3.nextDouble();

            System.out.println("Enter The Rate Interest  : ");
            double InterestRate = sc3.nextDouble();

            System.out.println("Enter The Time  : ");
            double Time = sc3.nextDouble();


            double interest = (Amount * InterestRate * Time)/100;
            System.out.println("The Calculated Simple Interest is : " + (interest));

        }
    }


    static class AverageMarks {
        public static void main(String[] args) {
            Scanner sc4 = new Scanner(System.in);

            System.out.println("Enter Your sub1 Marks : ");
            double sub1 = sc4.nextDouble();

            System.out.println("Enter Your sub2 Marks : ");
            double sub2 = sc4.nextDouble();

            System.out.println("Enter Your sub3 Marks : ");
            double sub3 = sc4.nextDouble();

            System.out.println("Enter Your sub4 Marks : ");
            double sub4 = sc4.nextDouble();

            System.out.println("Enter Your sub5 Marks : ");
            double sub5 = sc4.nextDouble();

            double Sum = (sub1 + sub2 + sub3 + sub4 + sub5);
            System.out.println("The Total Marks is : " + (Sum));

            double avg =  Sum / 5;
            System.out.println("The Average Marks is : " + (avg));

            double percent = (Sum / 500)*100;
            System.out.println("The Percent Marks is : " + (percent));
        }
    }
}
