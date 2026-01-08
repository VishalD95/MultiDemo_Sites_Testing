package Assignment;

public class ForLoopBreak {

    public static void main(String[] args){
        for(int m=1; m<=10; m++){
            for(int n=1; n<=6; n++)
            {

            if (m==5 && n==5){
                System.out.println(m);  //if loop statement
                break;

                //continue;
            }
            //System.out.println(m); //for loop statement
            }


        }
    }
}
