package HierarchicallLeavelInheritance;

public class Kumar_Class_C1 extends Jhansi_Class_C {
    void kumar(){
        System.out.println("i am Kumar Son OF Jhansi");
        System.out.println("i am Kumar Brother Of Sathish");
    }

    public static void main(String[] args){
        Kumar_Class_C1 C1 = new Kumar_Class_C1();

        C1.kumar();
        C1.JKumar();
    }

    static class Sathish extends Kumar_Class_C1{

        void sathish(){
            System.out.println(" i am Sathish Son of Jhanshi");
        }

        public static void main(String[] args){

            Sathish S = new Sathish();

            S.sathish();
            S.Jsathish();
            S.kumar();

        }
    }
}
