package seccion14;

public class AutoMainRelacionadoObjetos {
    public static void main(String[] args) {

        Automovil toyota = new Automovil(); //no le paso parametrs
        Automovil susuki = new Automovil();

        //asigno las ruedas
        Rueda[] ruedasBMW = new Rueda[5];
        ruedasBMW[0] = new Rueda("bmw",19,6.2);
        ruedasBMW[1] = new Rueda("bmw",19,6.2);
        ruedasBMW[2] = new Rueda("bmw",19,6.2);
        ruedasBMW[3] = new Rueda("bmw",19,6.2);
        ruedasBMW[4] = new Rueda("bmw",19,6.2);

        //otra forma para crear las llantas
        Rueda[] ruedasToyo = {
                new Rueda("Michelin",18,10.5),
                new Rueda("Michelin",18,10.5),
                new Rueda("Michelin",18,10.5),
                new Rueda("Michelin",18,10.5),
                new Rueda("Michelin",18,10.5),
        };

        //otra forma optimizada de poner ruedas
        Rueda[] ruedasSuzuki = new Rueda[5];
        for(int i=0; i<ruedasSuzuki.length; i++){
            ruedasSuzuki[i] = new Rueda("Yokohama",16,9.1);
        }
        //asigno las ruedas
        susuki.setRuedas(ruedasSuzuki);

        //agrego las llantas a toyota
        toyota.setRuedas(ruedasToyo);

        //creo un conductor
        Persona conductorToyota = new Persona("Luci","Martinez");
        //asigno el conductor
        toyota.setDueno(conductorToyota);

        Persona conductorBMW = new Persona("Ana","Mena");
        Automovil bmw = new Automovil(new Motor(4.8,TipoMotor.ELECTRICO),new Tanque(33), conductorBMW,ruedasBMW); //las ruedas tengo q iterarlas com un for para verlas
        bmw.setRuedas(ruedasBMW); //asigno las ruedas


        System.out.println("BMW: "+bmw.getMotor().getCilindrada()+" "+bmw.getMotor().getTipo()+" "+bmw.getCapacidadTanque().getCapacidad()+" conductor: "+bmw.getDueno().getNombre());


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

        //mostrar las llantas con for each
//        for(Rueda r: toyota.getRuedas()){
//            System.out.println("Ruedas de toyo: "+r.getFabricante()+" ,Aro"+r.getAro());
//        }

        //tambien puedo poner y validar ese for en metodo: detalle en clase Automovil y validar
        //ahora solo paso esto:
        System.out.println(toyota.verDetalleLLantas());
        System.out.println(susuki.verDetalleLLantas());
        System.out.println(bmw.verDetalleLLantas());

    }


}
