package seccion9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AsignarPropiedadesSistema {
    public static void main(String[] args) {
        //creo un archivo en src
        //create new file nombre=  config.properties

        try {
            FileInputStream archvio = new FileInputStream("src/seccion9/config.properties");

            //agregar archivo a objeto properties
            Properties p = new Properties(System.getProperties());
            //agregar las nuevas configuraciones
            p.load(archvio); //load da error dejo solo Exception en el catch para q no me de error

            //agregar nuevas config mediante el objeto properties
            p.setProperty("mi.propiedad.personalizada","mi valor");

            //actualizar los datos nuevos q agrege
            System.setProperties(p);

            //listar las config del sistema
            System.getProperties().list(System.out);


        } catch (Exception e) {
           // throw new RuntimeException(e);
            System.err.println("no existe el archivo = " + e);
        }



    }

}
