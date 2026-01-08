package Assignment;

public class sum {

//    public static void main(String[] args) {
//        int sum = 0;
//
//        for (int i = 2; i <= 100; i += 2) {
//            sum += i;
//        }
//
//        System.out.println("Sum of even numbers from 1 to 100 = " + sum);
//    }



        public sum()
        {   System.out.println("hai");
            sub();
        }

        public void sub(){
            System.out.println("i a Sum");}


        public static void main(String[] args){

            sum a = new sum();

            for(int q = 1; q<= 100; q++){
                if(q%2 ==0){
                    System.out.println(q);}
            }

            int w = 1;
            while (w<=100){
                if (w%2 != 0){
                    System.out.println(w);
                }
                w++;
            }


        }


    }
