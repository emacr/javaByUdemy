package seccion5;

public class SentenciaWhile {
    public static void main(String[] args) {
        int i = 0;
        while(i<5){
            System.out.println("i = " + i);
            i++; //incrementarlo xq sino es un bucle infinito
        }

        //iteracion
        i=0;
        boolean prueba = true;
        while(prueba){
            if (i==7){
                prueba=false;
            }
            System.out.println(i);
            i++;
        }

        //ejemplo con do while

        System.out.println("ejemplo con do while");
        prueba = true;
        i=0;
        do {
            if(i==10){
                prueba=false;
            }
            System.out.println("i = " + i);
            i++;
        }while(prueba);












    }


}

