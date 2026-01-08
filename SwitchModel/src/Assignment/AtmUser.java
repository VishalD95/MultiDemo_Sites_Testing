package Assignment;

public class AtmUser {

    public static void main(String[] args){
            AtmData A= new AtmData();
            A.setPin(1234);
            System.out.println(A.getpin());
            A.setUserName("Ravi");
            System.out.println(A.getName());
        A.setUserName("vishal");
        System.out.println(A.getName());
    }


}
