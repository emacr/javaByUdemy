package seccion9;

import java.util.Properties;

public class PropiedadesDelSistema {
    public static void main(String[] args) {

        //propiedades por defecto q ya vienen integrados en la calse system

        String username = System.getProperty("user.name");
        System.out.println("username = " + username);
        
        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion = " + javaVersion);

        //ver todas las propiedades del sistema
        Properties p = System.getProperties();
        p.list(System.out);//imprime





    }
}
