public class FirstHelloWorld {
    //las clase inician con mayusculas

    public static void main(String[] args) {
        //print hello world
        System.out.println("Hello world");
        String name = "emma";
        System.out.println("mi nombre es: "+name.toUpperCase()); //name es un objeto, tiene metodos ej; .uppercase
        //tipos primitivos siempre en minuscula
        int n =10; //no tiene atributos int
        Integer n2 = 10; //este si tiene metods integer = clase, mas facilidad de trabajar con enteros

        //sout atajo de imprimir
        //soutv imprime la ultima variable colocadad

       String nombre = "";
       int n3=2;
       
       if (n3>1){
           nombre = "ana";
       }
        System.out.println("nombre = " + nombre);

//tipos de datos primitivos
//solo representan valor
/*
tipos dentro de los enteros:
byte = mas pequno 8 bys
short = 16 byts
int = 32 bist
long = 64 bits

tipo decimal:
float y double
float n = 3.1416f;

double n2 = 4.55

tipo boolean:
true or false
 */
    }
}
