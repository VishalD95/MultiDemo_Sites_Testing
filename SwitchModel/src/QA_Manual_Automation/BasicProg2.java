package QA_Manual_Automation;

import java.util.Scanner;

public class BasicProg2 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int marks = sc.nextInt();

        if(marks<0){
            System.out.println("Entered Number is LessThen Zero :" + marks);
        } else if (marks > 0) {
            System.out.println("Entered Number is GraterThen Zero :" + marks);
        }else {
            System.out.println("Entered Number is Equal to Zero :" + marks);
        }

        sc.close();


    }

    static class table{

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter table:");
            int tableNumber = sc.nextInt();

            for(int i=1;i<=10;i++){
                System.out.println(tableNumber + "*" + i + " = " + tableNumber*i);
            }
        }
    }


    static class arrayInput {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Array Size:");
            String arraySize = sc.nextLine();

            String[] array = arraySize.split(",");
            for (String s : array) {
                System.out.println(" Entered String Values is : " + s);
            }
        }
    }

    static class SumOfArry{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

//            System.out.println("Enter Number of SubMarks :");
//            int Marks = sc.nextInt();

            System.out.println("Enter Subject Marks:");
            String subject = sc.nextLine();

            String[] marks = subject.split(" ");
            int sum = 0;
            for (String mark : marks) {
                sum += Integer.parseInt(mark.trim());
            }
            System.out.println("The Sum Marks is : " + sum);

//            int[] marks = new int[Marks];
//            int sum = 0;
//            System.out.println("Enter " + Marks + " Marks :");
//
//            for (int i = 0; i < Marks; i++) {
//                System.out.println("Marks " + (i + 1) + ":");
//
//                marks[i] = sc.nextInt();
//                sum += marks[i];
//            }
//            System.out.println("Sum of Marks Marks:"  + sum);
        }
    }


    static class Methods{

        public void EmpInfo(String empName, int empID, String empDep){
            System.out.println("Employee Name : " + empName);
            System.out.println("Employee ID : " + empID);
            System.out.println("Employee Dep : " + empDep);
        }

        public static void main(String[] args) {

          Methods  Emp1 = new Methods();
          Emp1.EmpInfo("vishal", 1722, "IT");
        }
    }


}
