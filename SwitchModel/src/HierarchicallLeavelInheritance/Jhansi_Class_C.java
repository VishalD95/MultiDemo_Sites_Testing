package HierarchicallLeavelInheritance;

public class Jhansi_Class_C extends HariClassA {

void JKumar(){
    System.out.println("hai i am Jhansi, Kumar is my Elder Son ");
}

void Jsathish(){
    System.out.println("hai i am Jhansi, Sathish is my Younger Son ");
}

void JDa(){
    System.out.println("hai i am Jhansi, Daughter of Hari and Mother of Kumar & Sathish ");
}

public static void main(String[] args){

    Jhansi_Class_C J = new Jhansi_Class_C();

    J.Pa();
    J.JDa();

}

}
