package HierarchicallLeavelInheritance;

public class Tippu_B1 extends Vasu_Class_B {

    void tippu (){
        System.out.println("This IS Tippu Class B1");
    }

    public  static void main(String[] args){
        Tippu_B1 B1 = new Tippu_B1();
        System.out.println("----------------Tippu---------------");

        B1.tippu();
        B1.B1();
        B1.GrandPa();

        System.out.println("----------------Tippu---------------");

    }

static class Money extends Tippu_B1{

        void money(){
            System.out.println("This is Money Class B2");
        }
        void Ybro(){
            System.out.println("Mahith is My Younger Brother ");
        }
    void Ebro(){
        System.out.println("Tippu is My Elder Brother ");
    }

        public static void main(String[] args){

            Money B2 = new Money();

            System.out.println("----------------Money---------------");

            B2.money();
            B2.B2();

            System.out.println("----------------Money---------------");
        }
}

static  class Mahith extends Money{
        void mahith()
        {
            System.out.println("This is Mahith Class B3");
        }

        public static void main(String[] args){
            Mahith B3 = new Mahith();

            System.out.println("----------------Mahith---------------");

            B3.mahith();
            B3.B3();
            B3.GrandPa();

            System.out.println("----------------Mahith---------------");
        }
}
    
}


