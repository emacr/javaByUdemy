package seccion6;

public class WrapperBool {
    public static void main(String[] args) {
        Integer n1,n2;
        n1=5;
        n2=3;

        boolean primBool = n1 > n2;

        Boolean refeBool = false; //autoboxing
        // o lo puedo hacer como
        Boolean refeBool2 = Boolean.valueOf(primBool);

        Boolean objBool = Boolean.valueOf("false");

        //forma explicita
        boolean primBool2 = objBool.booleanValue();

        //== compara por el valor bool no x el objeto


    }
}
