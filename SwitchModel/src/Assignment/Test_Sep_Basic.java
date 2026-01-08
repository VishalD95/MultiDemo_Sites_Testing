package Assignment;

import java.util.Scanner;

public class Test_Sep_Basic {

    public static void main(String[] args) {

//Write a simple Java program to print 100  to  50  exclude 75, 57 ?
        for (int i = 100; i > 50; i--) {
            if (i == 75 || i == 57) {
                continue;
            }
            System.out.println(i);
        }
//write a program to add first 100 number?
        int sum = 0;

        for (int x = 1; x <= 100; x++) {

            sum += x;
        }
        System.out.println("Sum of first 100 numbers is : " + sum);
//Example to add even || odd numbers
        int n = 100;
        int Sum = n *(n + 1)/3;
        System.out.println("Sum of first 100 numbers is : " + Sum);
// Write a program to add an integer variable having value 100 and a double variable having value 4.2.
        int a = 100; double b = 4.2;
        double results = a + b ;
        System.out.println("Sum is : " + results);

//13. Write a syntax for: function, return type, Object creation, and this variable.

    }

    static  class subclass extends Test_Sep_Basic{

        public static void main(String[] args){

            for(int x = 1; x <= 5; x++){
              for(int y = 1; y <= x; y++){
                  System.out.print(y + " ");
              }
                System.out.println();
            }

            for(int i = 6; i <= 100; i += 6){
                System.out.println(i + " is divisible by 6");
            }

            int count = 1;
            for(int x = 1; x <= 5; x++){
                for(int y = 1; y <=x; y++){
                    System.out.print(count + " ");
                    count++;
                }
                System.out.println();
            }

            for(int x = 1; x <= 5; x++){
                for(int y = 1; y <=x; y++){
                    System.out.print(x + " ");

                }
                System.out.println();
            }

            System.out.println("  ");


            for(int x = 1; x <= 5; x++){
                int num = 5;
                for(int y = 1; y <= x; y++){
                    System.out.print(num + " ");
                    num--;

                }
                System.out.println();
            }

            System.out.println("  ");

            for(int x =1; x<= 5; x++){
                for(int y = 1; y <= x; y++){
               System.out.print(x);
                }
                System.out.println(" ");
            }






        }





    }
}
