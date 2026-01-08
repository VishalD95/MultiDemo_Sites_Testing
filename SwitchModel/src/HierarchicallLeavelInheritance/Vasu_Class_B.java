package HierarchicallLeavelInheritance;

public class Vasu_Class_B extends HariClassA {

    void VFather()
    {

        System.out.println(" I am Father Of Tippu(Class B1), Money (Class B2) and Mahith (Class 3)");
    }

    void B1(){
        System.out.println(" i am Vasu Tipuu is my Elder Son");
    }

    void B2(){
        System.out.println(" i am Vasu Money is my Middle Son");
    }

    void B3(){
        System.out.println("i am Vasu Mhaith is my Younger Son");
    }

    public static void main(String[] args){

        Vasu_Class_B B = new Vasu_Class_B();
        B.Pa();
        B.HSons();
    }


}

