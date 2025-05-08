package seccion7;

public class PasarXValor {
    public static void main(String[] args) {
        //toda variable primitiva siempre se pasa x valor y no por referencia xq no es un objeto
        int i = 10;

        System.out.println("inicio en main con i q vale = " + i);

        //invoco el metodo test
        test(i);

    }
    //creo metodo
    public static void test(int i){
        System.out.println("iniamos en metodo test i = " + i);
        //cambio valor de i
        i=35;
        System.out.println("nuevo valor de i = " + i);
    }


}
