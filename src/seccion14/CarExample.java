package seccion14;

public class CarExample {
    public static void main(String[] args) {
        Car auto = new Car(); //llamo la clase

        auto.fabricante = "honda";
        auto.modelo = "civic";
        auto.cilindrada=1.5;

        System.out.println("auto.cilindrada = " + auto.cilindrada);

        //llamo al metodo
        auto.detalle();


        //crear n cantidad de obetos
        Car toyota = new Car();
        toyota.fabricante="toyota";
        toyota.color="gris";
        toyota.modelo="Yaris";
        System.out.println();
        toyota.detalle(); //para toyota

        toyota.llantas="pirelli";
        toyota.aceite ="diablo";
        toyota.gas = "plus";

        System.out.println();
        System.out.println(toyota.accesorios());

        System.out.println();

        System.out.println(toyota.acelerar(3000));
        System.out.println(toyota.frenar());

        System.out.println(auto.acelerarFrenar(1000));

        System.out.println("km por litro "+toyota.calcularConsumo(300,0.6f));
        System.out.println("km por litro "+toyota.calcularConsumo(300,60));




    }
}
