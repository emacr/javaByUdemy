package seccion14;

public class OrdenarObjetosAuto {
    public static void main(String[] args) {

        Automovil toyota = new Automovil(); //no le paso parametrs
        Automovil susuki = new Automovil();

        Automovil bmw = new Automovil();
        Automovil ford = new Automovil();
        Automovil mazda = new Automovil();



        //creo un conductor
        Persona conductorToyota = new Persona("Luci","Martinez");
        //asigno el conductor
        toyota.setDueno(conductorToyota);

        Persona conductorBMW = new Persona("Ana","Mena");


        toyota.setMotor(new Motor(4.1,TipoMotor.DIESEL)); //creo el obejto directamente con el new y lo paso al setMotor

        //pero tambien lo puedo hacer por aparte en lugar de colocar el new adentro como arriba:
        Motor motorSusuki = new Motor(2.1,TipoMotor.GASOLINA);
        susuki.setMotor(motorSusuki);

        toyota.setCapacidadTanque(new Tanque()); //40 lt por default en el constructor

        susuki.setCapacidadTanque(new Tanque (90)); //paso el parametro


        //inicializo Automovil
        Automovil[] autos = new Automovil[5];
        autos[0] = toyota;
        autos[1] = susuki;
        autos[2] = bmw;
        autos[3] = ford;
        autos[0] = mazda;

        for(int i=0; i<autos.length; i++){
            System.out.println(autos[i]);
        }





    }


}
