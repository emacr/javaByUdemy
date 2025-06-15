package cr3.mcarranza.poointerfaces.imprenta;

import cr3.mcarranza.poointerfaces.imprenta.modelo.*;
import static cr3.mcarranza.poointerfaces.imprenta.modelo.Genero.*;


public class EjemploImprenta {
    public static void main(String[] args) {
        CV curr = new CV("ResumenLaboral", "emma", "salud");
        curr.addExperiencia("java")
        .addExperiencia("mongo")
        .addExperiencia("python")
        .addExperiencia("angular");

        Infomre inf = new Infomre("Estudio de microservicios", "martin", "ana");

        Libro lb = new Libro("ana","diseno", ACCION);
        lb.addPagina(new Pagina("patron"))
                        .addPagina(new Pagina("factory"))
                                .addPagina( new Pagina("cpmposite"))
                                        .addPagina(new Pagina("facade"));

        imprimir(curr);
        imprimir(inf);
        imprimir(lb); //cuando implemento la intefaz ya no marca error

    }
//    public static  void   imprimir(Hoja imprimible){
//        System.out.println(imprimible.imprimir());
//    }


    public static  void   imprimir(Imprimible imprimible){ //paso la intefaz
         System.out.println(imprimible.imprimir());
}



}
