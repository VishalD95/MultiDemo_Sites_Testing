package Assignment;

public class Forloop {

    public static void main(String[] args){
        //System.out.println(" Print 57th Table in Reverse from 57X67 to 57X19 ");

        //print 57 table in reverse from 57 X 67 to 67 X 19
//        for (int n = 67; n>=19; n--){
//
//            System.out.println("57 X " + n + " = " + (57*n));
//        }


         //10-1
//        for(int r =10; r>=1; r--){
//            // row Father
//
//            for(int c=r; c>=1; c--){
//               // child
//                System.out.print(c + " ");
//            }
//
//
//            System.out.println();
//        }
        //10-10
//        for(int r =1; r<=10; r++){
//            // row Father
//
//            for(int c=10; c>=r; c--){
//               // child
//                System.out.print(c + " ");
//
//            }
//
//
//            System.out.println();
//        }

//        for(int i =1; i<=3; i++ ){
//
//            for(int c =1; c<=4; c++)
//            {
//
//               System.out.print(i*c + " ");
//            }
//
//            System.out.println(" ");
//        }

        for(int i=0; i <=2; i++ )
        {
            for(int c=0; c<=9; c++)
            {
                if((i + c)% 2 ==0)
                {
                    System.out.print("1 ");
                }else
                {
                    System.out.print("0 ");
                }

            }
            System.out.println("");

        }



    }
}
