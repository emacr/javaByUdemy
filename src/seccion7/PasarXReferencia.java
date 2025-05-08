package seccion7;

public class PasarXReferencia {
    public static void main(String[] args) {
        int [] edad = {10,11,12};

        System.out.println("inicio en main = ");
        for(int age : edad){
            System.out.println("age = " + age);
        }
        System.out.println(" antes de *invocar metod test");

        test(edad); //modifica el arreglo

        System.out.println(" despues de invocar metodo test");
        for(int age : edad){
            System.out.println("age = " + age);
        }
        

    }

    public static void test(int[] edad){
        System.out.println("inicio en metod test = " );
        for(int i =0 ; i < edad.length; i++){
            edad[i] = edad[i] + 20;
        }

    }

}
