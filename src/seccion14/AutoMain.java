package seccion14;

public class AutoMain {
    public static void main(String[] args) {
        Automovil toyota = new Automovil(); //no le paso parametrs
        Automovil susuki = new Automovil();

        toyota.setMotor(new Motor(4.1,TipoMotor.DIESEL)); //creo el obejto directamente con el new y lo paso al setMotor

        //pero tambien lo puedo hacer por aparte en lugar de colocar el new adentro como arriba:
        Motor motorSusuki = new Motor(2.1,TipoMotor.GASOLINA);
        susuki.setMotor(motorSusuki);

        toyota.setCapacidadTanque(new Tanque()); //40 lt por default en el constructor

        susuki.setCapacidadTanque(new Tanque (90)); //paso el parametro

        System.out.println("motor: "+motorSusuki.getCilindrada() + " tipo motor: "+motorSusuki.getTipo());

        System.out.println("\n"+susuki.verDetalles());

        System.out.println("capacidad tanque de toyota: "+toyota.getCapacidadTanque().getCapacidad());

        //tambien puedo sobreescribir la clase to string para llamar de la siguiente manera
        System.out.println(toyota.getMotor());





    }


}
