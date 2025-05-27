package seccion14;

public class Car {
    //atributos
    String fabricante;
    String modelo;
    String color = "rojo";
    double cilindrada;
    String llantas;
    String aceite;
    String gas;
    int capacidadTanque= 40;

    //metodo de la clase
    //void = vacio no retorna nada solo hace una accion
    public void detalle(){
       // System.out.println("auto.fabricante = " + auto.fabricante); auto es del main no sirve aca
        System.out.println("auto.fabricante = " + this.fabricante); //coloc this q hace referencia a el mismo (car)
        System.out.println("auto.fabricante = " + this.modelo);
        System.out.println("auto.fabricante = " + this.color);
    }

//dentro de una clase nunca se debe imprimir datos u objeto q representa datos
    public String accesorios(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nllantas: "+this.llantas);
        sb.append("\naceite: "+this.aceite);
        sb.append("\ngas: "+this.gas);
        return sb.toString();  //return = retorna valor
    }

/*
otra forma de hacerlo mas sinple
    return "\nllantas: "+this.llantas +
        "\naceite: "+this.aceite +
        "\ngas: "+this.gas;

*/

    public String acelerar(int rpm){
        return "el auto "+this.fabricante+" acelerando a = "+rpm+" rpm";
    }

    public String frenar(){
        return "fabricante "+this.fabricante+" modelo "+this.modelo+" frenando";
    }


    //combinar 2 metodos
    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    //calculos
    public float calcularConsumo(int km, float porcentajeGas){
        return km/(this.capacidadTanque*porcentajeGas);
    }

    //sobrecarga de metods
    public float calcularConsumo(int km, int porcentajeGas){
        return km/(this.capacidadTanque*(porcentajeGas/100f));
    }






}
