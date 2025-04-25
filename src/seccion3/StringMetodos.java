package seccion3;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class StringMetodos {
    public static void main(String[] args) {

        //string arreglo de caracteres, parte de la posisicon 0
        String nombre = "emma";

        System.out.println(nombre.length()); //largo de la cadena .length(-1) =llamo el ultimo caracter

        nombre.toUpperCase();//mayuscula
        nombre.toUpperCase();//minuscula
        nombre.equalsIgnoreCase("ana"); //comparar
        nombre.equalsIgnoreCase("EMMa"); //true
        nombre.compareTo("emma");//compara en orden alfabetico en tabla unicode (orden lexico grafico), si el valor 0 va a ser igual
        nombre.charAt(2); //obtener un valor del caracter por posicion
        nombre.substring(1,3); //obtener una parte del string, el q se le indique

        String trabalenguas= "trabalenguas";
        trabalenguas.replace("a","x");//cambiar caracter por otro
        trabalenguas.indexOf('a'); //retorna la posicion de la palabra o char
        trabalenguas.lastIndexOf("a");//busca la ultima posicion de esa ocurrencia
        //sino existe lo q se busca retorna un -1

        trabalenguas.contains("t"); //retorna true o false
        trabalenguas.startsWith("lenguas"); //retorna true o false

        trabalenguas.endsWith("tr");
        trabalenguas.trim();//quitar espacios en blacno desde derecha y desde izquierda
        //por ejemplo q la info este mas limpia por ejemplo al momento de llenar un forms

        //obtener etension de un archivo
        String archivo = "alguna.imagen.pdf";
        //forma estatica
        archivo.charAt(2);

        //forma dinamica
        int a = archivo.lastIndexOf(".");
        System.out.println(archivo.substring(a+1));//i+1 para q no agarre el punto


        //convertir string a un arreglo de caracteres
        trabalenguas.toCharArray();

        //para imprimir esto habria q usar un for o while
        //arreglo de elementos tipo char
        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;

        for (int i=0; i<largo;i++){
            System.out.println(arreglo[i]);
        }

        //metodo separar
        String [] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for (int i=0; i<l;i++){
            System.out.println(arreglo[i]); //imprime la palabra sin las a
        }

        String archivo2 = "alguna.imagen.pdf";

        String [] archArr = archivo2.split("\\."); //arego \\ xq solo el . no me lo acepta
        int larg = archArr.length;
        for (int i=0; i<larg;i++){
            System.out.println(arreglo[i]); //imprime pdf
        }






    }
}
