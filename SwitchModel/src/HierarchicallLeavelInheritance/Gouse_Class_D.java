package HierarchicallLeavelInheritance;

public class Gouse_Class_D extends HariClassA{

    void gouse(){
        System.out.println("Hai i am Gouse Son of Hari");
    }

    public static void main(String[] args){

        Gouse_Class_D G = new Gouse_Class_D();

        G.gouse();
        G.Pa();
    }

    static class Ahmed extends Gouse_Class_D{

        void ahmed(){
            System.out.println("Hai i am Ahmed Son of Gouse and GrandSon Of Hari");
        }

        public static void main(String[] args){
            Ahmed A = new Ahmed();

            A.ahmed();
            A.GrandPa();
        }
    }
}
