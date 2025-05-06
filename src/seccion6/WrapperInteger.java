package seccion6;

public class WrapperInteger {
    public static void main(String[] args) {
        // Integer intObject = new Integer(): de esta forma no porq ya no se usa para instanciar

        //1 forma metod estatic
        Integer intObject = Integer.valueOf(5242);

        //2 forma auto = autoboxing
        Integer intOb = 4524;

        //convertir a entero primitivo
        //1forma auto implicita
        int num = intObject;

        //2 forma explicita
        int n2 = intObject.intValue();

        String valor = "5421";

        //convertir a entero
        Integer val = Integer.valueOf(valor);

        //cuiadado al asignar objetos a otros q no soporten la cantidad de caracteres o asi
        //xq se dara perdida de info

        Integer primitivo = 52768;
        short n1 = primitivo.shortValue(); //se da perdida de infomarcion

        Byte bo = primitivo.byteValue(); //perdida de info













    }
}
