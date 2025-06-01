package net.mcarranza.poosobrecarga;

public class Calculadora {
    //polimorfismo = diferentes formas de hacer algo


    //constructor privado, este no permitira que se haga una instancia de esta clase

//    private Calculadora() {
//    }
    //        Calculadora cl = new Calculadora(); no lo podria hacer

    public int sumar(int a , int b){
        return a + b;
    }

    public float sumar(float x , int y){
        return x + y;
    }

    public float sumar(float i , float j){
        return i + j;
    }
    public double sumar(double i , double j){
        return i + j;
    }

    public int sumar (String a, String b){
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            resultado=0;
        }
        return resultado;
    }

    public int sumar(int a,int b, int c){
        return a+b+c;
    }


    //varargs = n variable de arguementos (lista)
    public int sumar(int... argumentos){
        int total=0;
        for (int i: argumentos){ //for xq argumentos es una lista
            total+=i;
        }
        return total;
    }



}
