
public class Learning  {

    public static void main(String[] args) {


        System.out.println("Hello and welcome!");
        int a= 2, b = 6, reminder =0;
       char C = 'M';

        switch (C){

            case 'M' : System.out.println(" M value is  :" + a*b);
             break;

            case 'D' : System.out.println("D value is :" + a/b);
             break;

            case 'S' : System.out.println("S value is :" + (a-b));
             break;

            case 'A' : System.out.println("A value is : " + (a+b));
             break;

            default: System.out.println("Given char is not M/D/S/A. Reminder value: " + reminder);
             break;
        }









    }
}
