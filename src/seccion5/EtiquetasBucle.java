package seccion5;

public class EtiquetasBucle {
    public static void main(String[] args) {
        //se aplica tanto al for como al while
        //continue y break
        //interrumpir o continuar un bucle

        bucle:      //el for esta etiquetado como bucle, entonces en el continue o brake puedo hacer referencia a esa etiqueta
        for (int i=0; i<5; i++){
            if(i==2){
                continue;  //se salta el 2 e imprime lo demas
                //continue bucle1; //tambien lo puedo poner asi ya q lo etiqute arriba
            }
            System.out.println("i = " + i);
        }

        //ver cuantas veces se repite un caracter
        String frase = "tres tristes tigres tragan trigo en un trigal";
        int max = frase.length();
        int cantidad = 0;
        for (int i=0; i < max; i++){
            if (frase.charAt(i) != 't'){ //si no es t vuelve a iterar
                continue;
            }
            cantidad++; //si es t sale del if y suma las t
        }
        System.out.println("cantidad de t encontradas = " + cantidad);
        System.out.println();
        //buscar una palabra
        //necesito 2 for una para recorrer y otro para la palabra
        String frase2 = "tres tristes trigo tigres tragan trigo en un trigal";
        String palabra = "trigo";
        int cantidad2 =0;
        int maxFrase = frase2.length();
        int maxP= palabra.length();

        buscar:
        for(int i=0; i < maxFrase; i++){ //frase
            int k = i; //k es para q recorra de forma independiente la palbra una vez q encuentre similutes sin afectar el for i
            for (int j=0; j < maxP; j++){ //palabra
//
                if(palabra.charAt(j) != frase2.charAt(k++)){
                    continue buscar; //vuelve al for principal

                }
            }
            cantidad++;
        }
        System.out.println("la palabra "+palabra+" sale unas "+cantidad+" veces.");



    }
}
