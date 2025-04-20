public class PrimitivosEnteros {
    public static void main(String[] args) {
        //datos primitivos
        //numeros

        byte nByte = 7; //valor maximo 127
        //clase byte
        System.out.println("byte corresponde a "+Byte.BYTES+ " byte");
        System.out.println("byte corresponde a "+Byte.SIZE + " bits");
        System.out.println("valor maximo de un byte "+Byte.MAX_VALUE);

        short nShort = 3000;
        System.out.println("short corresponde a "+Short.BYTES+ " byte");

        int nInt = 450001;
        System.out.println("int corresponde a "+Integer.BYTES+ " byte");

        long nLong = 442013211L; //pongo L al final para convertir a long
        System.out.println("long corresponde a "+Long.BYTES+ " byte");

        //se puede definir una variable dinamica, q se asigna auto su tipo de dato
        var nVar = 10;



    }
}
