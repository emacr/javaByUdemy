package seccion9;

import java.util.Map;

public class VariablesEntorno {
    public static void main(String[] args) {
        //mapa de java con las variables de entorno
        //arreglo asociativo con un nombre (diccionario)
        Map<String, String> varEnv = System.getenv();

        //para recorrer uno por uno puedo listar con for
        for (String key: varEnv.keySet()){
            System.out.println(key + " => " +varEnv.get(key) );
        }

        //imprime en una sola linea todo
        System.out.println("varEnv = " + varEnv);

        //octener variable en particular
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        //obtener javahome
        String javahome = System.getenv("JAVA_HOME");
        System.out.println("javahome = " + javahome);







        
        
    }
}
