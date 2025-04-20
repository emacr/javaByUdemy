public class ConversionTIpos {
    public static void main(String[] args) {
        //convertir string a enteros
        String nStr = "50";
        int nInt = Integer.parseInt(nStr);

        //convertir a decimal
        String realStr = "324,112";
        double realDouble = Double.parseDouble(realStr);

        //convertir a bool
        String logic = "True";
        boolean bool = Boolean.parseBoolean(logic);

        //conversion tipos primitivos a cadenas
        int n=100;
        String nStr2 = Integer.toString(n);

        //otra forma de convertir
        nStr2 = String.valueOf(n); //sobrecarga de metodo

        //conversion entre tipos primitivos
        int i = 1000;
        //casteo (forzar la conversion)
        short s = (short)i; //puede haber perdida de informacion ya q short acepta menor rango q int
        long l = i; //no da error xq long acepta mas rango q int
        //para castear solo a char y numericos
        char b = (char)i;
        float f = (float)i;




    }
}
