package seccion13;

public class MatrizString {
    public static void main(String[] args) {
        String [][] nombres = new String[3][2];

        //inicializar
        nombres[0][0] = "pepe";
        nombres[0][1] = "ana";
        nombres[1][0] = "sandra";
        nombres[1][1] = "carlos";
        nombres[2][0] = "felipe";
        nombres[2][1] = "jovenal";

        //iterar con for
        for (int i=0; i<nombres.length;i++){ //recorre filas
            for (int j=0; j<nombres[i].length; j++){ //recorrer columnas
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("iterando con for eacj");

        //iterar con for each
        for (String [] fila: nombres){
            for(String nombre: fila){
                System.out.print(nombre +"\t");
            }
            System.out.println();
        }

        //crear matriz de forma mas simpe
        /*
            fila 1 columna1    fila
        {      {n,n}             {},

        */
        System.out.println("\n\t\tstrings");

        //asi solo para trabajar de forma estatica no dinamica

        String [][] paises = { {"cr,panana,mexico"}, {"usa,canada"}, {"chile"} ,{"Argentina,peru,marruecos,rusia,montrial"}} ;

        String[][] paises2 = {
                {"cr", "panana", "mexico"},
                {"usa", "canada"},
                {"chile"},
                {"Argentina", "peru", "marruecos", "rusia", "montrial"}
        };




        System.out.println("n cfilas: "+paises2.length);
        System.out.println("n columnas: "+paises2[0].length);

        for(String[] p : paises){
            for (String nombre : p){
                System.out.println(nombre +"\t");
            }
            System.out.println();
        }




    }
}
