package PooExcepciones;

public class Calculadora {
    public double dividir(int n1, int n2) throws DivicionPorZeroException{ //separo por coma para lanzar mas de 1
        if(n2 == 0){
            throw new DivicionPorZeroException("throw:::No se puede dividir por zero");
            //necesito pasar esta exepcion sino da error porq es checkeada
        }
        return n1/n2;
    }

    public double dividir(String numerado, String divisor) throws DivicionPorZeroException, formatoNException { //lanz a 2 exepciones

        try{
            int num = Integer.parseInt(numerado);
            int div = Integer.parseInt(divisor);

            return this.dividir(num,div); //aplico metodo existente arriba

        } catch (NumberFormatException  e) {
            throw new formatoNException("solo numeros se aceptan aqui asshole"); //clase personalizada
        }


    }

}
