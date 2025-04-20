public class SistemasNumericos {
    public static void main(String[] args) {
        int nDecimal = 500;
        //convertir a n binario
        System.out.println("numero binario: " +nDecimal + " = " +  Integer.toBinaryString(nDecimal));
        //convertir a n octal
        System.out.println("Numero octal: " +nDecimal + " = " + Integer.toOctalString(nDecimal));
        //convertir a hexadecimal
        System.out.println("Numero hexa: " +nDecimal+ "="+Integer.toHexString(nDecimal));





    }
}
