public class prueba {
    public static void main(String[] args) {
        String frase = "tres tristes trigo tigres tragan trigo en un trigal";
        String palabra = "trigo";
        int cantidad =0;
        int maxFrase = frase.length();
        int maxP= palabra.length();

        buscar:
        for(int i=0; i < maxFrase; i++){ //frase
            int k = i;
            for (int j=0; j < maxP; j++){ //palabra
//
                if(palabra.charAt(j) != frase.charAt(k++)){
                    continue buscar;

                }
            }
                cantidad++;
        }
        System.out.println("la palabra "+palabra+" sale unas "+cantidad+" veces.");

    }
}
