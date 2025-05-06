package seccion6;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer n1 = 1000;
        Integer n2 = n1;

        String igual = n1 == n2 ? "true": "false";
        System.out.println("igual = " + igual);

        igual = n1.intValue() == n2.intValue() ? "true":"false";

        // el == es para comparar primitivos por valor
        //el .equals compara valores en tipos de referencia
        //cuando se usa el == en tipos de referencia compara la isntancia y no el valor

        //en java si un n es menor a 128 esta compara por valor y no or la instancia

        boolean condicion  = n1 > n2;

        //auto boxing =  empaquetar o convertir un primitivo en clase wrapper
        // auto unboxing =  desempaquetar, pasar de referencia a un valor primitivo





    }
}
