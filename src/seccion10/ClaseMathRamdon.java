package seccion10;

public class ClaseMathRamdon {
    public static void main(String[] args) {
        //generar numeros aleatorios
        double random = Math.random();

        //tener numero de 0 a 7
        random *=7;

        //redondear hacia abajo
        random = Math.floor(random);

        //tener colores aleatorios
        String [] colores = {"azul","verde","rojo","blanco"};
        random *= colores.length;

        System.out.println("colores: "+colores[(int) random]); //casteo con int

        






    }
}
