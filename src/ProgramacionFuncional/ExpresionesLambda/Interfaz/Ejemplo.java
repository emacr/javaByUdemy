package ProgramacionFuncional.ExpresionesLambda.Interfaz;

public class Ejemplo {
    public static void main(String[] args) {

        Aritemtica suma = (a,b) -> a+b;
        Aritemtica resta = (a,b) -> a+b;

        Calculadora cl = new Calculadora();

        System.out.println(cl.proceso(10,5,suma));
        System.out.println(cl.proceso(10,5,resta));


    }
}
