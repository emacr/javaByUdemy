package cr2.mcarranza.pooclasesabstractas.form;

import cr2.mcarranza.pooclasesabstractas.form.elementos.ElementoForm;
import cr2.mcarranza.pooclasesabstractas.form.elementos.InputForm;
import cr2.mcarranza.pooclasesabstractas.form.elementos.SelectForm;
import cr2.mcarranza.pooclasesabstractas.form.elementos.TextAreaForm;
import cr2.mcarranza.pooclasesabstractas.form.elementos.select.Opcion;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave","password");
        InputForm email = new InputForm("email","email");
        InputForm edad = new InputForm("edad","number");

        TextAreaForm experiencia = new TextAreaForm("exp",4,6);

        SelectForm lenguaje = new SelectForm("Lenguaje");
        Opcion java = new Opcion("1","java");
        lenguaje.addOpcion(java);
        lenguaje.addOpcion(new Opcion("2","python"));
        lenguaje.addOpcion(new Opcion("3","sql"));
        lenguaje.addOpcion(new Opcion("4","react"));
        lenguaje.addOpcion(new Opcion("5","php"));

        username.setValor("jong.doe");
        password.setValor("1234");
        email.setValor("jon@gmail.cpm");
        edad.setValor("44");
        java.setSelected(true);

        //List<ElementoForm> elementos = new












    }
}
