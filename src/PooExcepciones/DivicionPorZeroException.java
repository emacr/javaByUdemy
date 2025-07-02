package PooExcepciones;

//public class DivicionPorZeroException extends RuntimeException{ //esta es no checkeada (no obligados a manerjar erro
public class DivicionPorZeroException extends Exception{ //esta es checkeada

    //constructor

    public DivicionPorZeroException(String message) {
        super(message);
    }






}
