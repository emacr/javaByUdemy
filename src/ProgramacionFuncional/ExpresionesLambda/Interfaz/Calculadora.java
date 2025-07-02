package ProgramacionFuncional.ExpresionesLambda.Interfaz;

public class Calculadora {

    public double proceso (double a, double b, Aritemtica lambda){
        return lambda.operacion(a,b);
    }

}
