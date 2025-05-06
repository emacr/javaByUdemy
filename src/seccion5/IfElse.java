package seccion5;

public class IfElse {
    public static void main(String[] args) {
//        if (expresion) {
//            contexto o alcanse cuando es true
//        }else if () {
//
//        }
//        else{
//            camino alternativo
//        }

        float promedio= 7.8f;
        if (promedio >= 6.5){
            System.out.println("buen promedio");
        }else if(promedio >=6){
            System.out.println("mejora");
        }else{
            System.out.println("quedado");
        }

        //calcular la cantidad de dias del mes
        int mes = 2;
        int numeroDias = 0;
        int anio = 1600;
        //ver si tiene 30 o 31 dias
        //abril junio setiembre noviembre tienen 30 dias
        //febrero pueden ser 28 o 29

        if (mes ==1 || mes ==3 || mes ==5 || mes ==7 || mes ==8 || mes ==10 || mes ==12){
            numeroDias = 31;
        }else if (mes ==4 || mes ==6 || mes ==9 || mes ==11){
            numeroDias = 30;
        }else if (mes ==2){
            //ver si es anio bisiesto
            if(anio % 400 ==0 || (anio % 4 == 0 && !(anio % 100 == 0))){
                numeroDias = 29;
            }else{
                numeroDias= 28;
            }
        }
        System.out.println("numeroDias = " + numeroDias);;





    }
}
