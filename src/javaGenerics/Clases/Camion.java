package javaGenerics.Clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//public class Camion implements Iterable{ //clase normal
public class Camion <T> implements Iterable<T>{ //clase generica T


  //  private List objetos; //lista normal
  private List<T> objetos; //indico q es una lista generica

    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }


    //metodo add
//    public void addObjeto(Object obj){ //metodo normal
    public void addObjeto(T obj){ //cambio de tipo obkject a generica

        if(this.objetos.size() <=max){
            this.objetos.add(obj);
        }else{
            throw  new RuntimeException("No hay mas espacio"); //manejo de error
        }
    }

    @Override
    //public Iterator iterator() {
    public Iterator<T> iterator() { //cambio el tipo de retorno a tipo generico
        return this.objetos.iterator(); //metodo unico de la intefaz Iterable
    }
}
