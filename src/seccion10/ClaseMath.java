package seccion10;

public class ClaseMath {
    public static void main(String[] args) {
        //valor absoluto de un entero
        int enteroAbosuluto = Math.abs(-3);
        System.out.println("enteroAbosuluto = " + enteroAbosuluto);
        
        //maximo entre 2 n
        double max = Math.max(3.5,1.2);
        System.out.println("max = " + max);

        //minimo
        //igual q el max

        //redondear hacia arriba
        double techo = Math.ceil(3.6);

        //redondear hacia abajo
        double piso = Math.floor(3.5);

        //redondear de acuerdo al valor
        long entero = Math.round(3.5); //devuelve 4, 3.4 devuelve 3

        //exponencial
        double exp = Math.exp(1); //eleva a la 2
        System.out.println("exp = " + exp);

        //logaritmo natural
        double log = Math.log(10);

        //potencia
        double  potencia = Math.pow(10,3); //10 elevado a 3


        //raiz cuadrada
        double raiz = Math.sqrt(5);

        //convertir angulo en grados
        double grados = Math.toDegrees(1.57);
        //redondear los grados
        grados = Math.round(grados);

        //seno
        Math.sin(grados);
        //conseno
        Math.cos(grados);







        
    
    
    
    
    
    
    }
}
