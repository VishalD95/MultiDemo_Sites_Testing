package Assignment;

public class RbiRoi {

    void Roi(){
        System.out.println("hi i am RBI Bank my Minium Roi is :  5.25%");

    }

    static class Sbi extends RbiRoi{

        void Roi(){
            System.out.println("hi i am SBI Bank my Minium Roi is :  5.75%");
            super.Roi();
        }
    }

    static class HDFC extends Sbi{

        void Roi(){
            System.out.println("hi i am HDFC Bank my Minium Roi is :  6.20%");
            super.Roi();
        }
    }

    static class ICICI extends HDFC{

        void Roi(){
            System.out.println("hi i am ICICI Bank my Minium Roi is :  6.00%");
            super.Roi();
        }
    }

    static class Axis extends ICICI{

        void Roi(){
            System.out.println("hi i am Axis Bank my Minium Roi is :  5.25%");
            super.Roi();
        }
    }

    static class Kotak extends Axis{

        void Roi(){
            System.out.println("hi i am Kotak Bank my Minium Roi is :  5.50%");
            super.Roi();
        }

        public static void main(String[] args){

            Kotak All = new Kotak();
            All.Roi();

        }
    }


}
