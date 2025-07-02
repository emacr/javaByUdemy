package Annotations;


import java.lang.annotation.*;

//indicar el usos q se le va a dar
@Target(ElementType.FIELD) //donde se va aplicar esta anotacion (field sobre atributos)

//en que contexto se va a ejecutar
@Retention(RetentionPolicy.RUNTIME) //en tiempo de ejecucion

//documentacion
@Documented
public @interface JsonAtributo {
    //atributos de configuracion
    String nombre() default "";

}
