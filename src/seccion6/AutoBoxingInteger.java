package seccion6;

public class AutoBoxingInteger {
    public static void main(String[] args) {
        //autocompletar

        Integer [] enteros = {1,2,3,4,5,6,7,32,44,334,56,9};

        int suma = 0;

        //sumar los valores q sean pares
        for(Integer i: enteros){
            //forma explicita
            if(i.intValue() % 2 == 0){
                suma += i.intValue(); //sumo los valores
            }
        }
        System.out.println("suma = " + suma);

        //forma inplicita
        //no es necesario convertir a objeto primitivo
        suma=0;
        for(Integer i: enteros){
            //forma explicita
            if(i % 2 == 0){
                suma += i; //sumo los valores
            }
        }


    }
}
