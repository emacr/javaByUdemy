package org.mcarranza.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    private int folio;
    private String descripcion;
    private Date fechaFactura;
    private int indiceItems; //guardo el indice para el arreglo de itemfactura
    public static final int MAX_ITEMS =10;

    //autoincrementar el folio, paso al constructor y quito el get solo dejo el set
    private static int ultimoFolio;


    //atributos de la relacion
    //factura cliente
    private Cliente cliente;
    private ItemFactura[] items;


    //constructor

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS]; //inicializar el arreglo para usarlo en el metodo addItemFactura
        this.folio = ++ultimoFolio; //++ (inicia en 1 no en 0)
        this.fechaFactura = new Date(); //cuandp se crea la factura se le pasa la fecha actual
    }


    //get y set

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    //no lleva set
//    public void setItems(ItemFactura[] items) {
//        this.items = items;
//    }

    //metodos

    public void addItemFactura(ItemFactura item){
        if(indiceItems <= MAX_ITEMS) { //valido para evitar errores (opcional)
            this.items[indiceItems++] = item; //debo inicializar este arreglo primero
        }
    }

    public float calcularTotal(){
        float total=0.0f;
        for (ItemFactura item : this.items){
            //validar sea o no null
            if(item == null){
                continue;
            }
            total+=item.calcularImporte();
        }
        return total;
    }

    public String generarDetalle(){
        //usamos stringbuilder para concatenar xq es mas optimizado q usar el +
        StringBuilder sb = new StringBuilder("Factura N: ");

        //fecha de emision de factura
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM 'del' yyyy");
        sb.append("\nFecha emision: ").append(df.format(this.fechaFactura)).append("\n");

        //invocar el metodo append de forma encadenada
        sb.append(folio).
                append("\nCliente: ").
                append(this.cliente.getNombre()).
                append("\n: N Hacienda: ").
                append(cliente.getnHacienda()).
                append("\nDescripcion: ").
                append(this.descripcion).
                append("\n").
                append("\n#\tNombre\t$\tCant.\tTotal\n"); //se detalla en el foreach

        for(ItemFactura item: items){
            //excluir datos nulos, ya q la factura acepta hasta 10
            //si solo se anotan 5, los otros son null
            if(item == null){
                continue;
            }
//            sb.append(item.getProducto().getCodigo()).
//                        append("\t").
//                        append(item.getProducto().getNombre()).
//                        append("\t").
//                        append(item.getProducto().getPrecio()).
//                        append("\t").
//                        append(item.getCantidad()).
//                        append("\t").
//                        append(item.calcularImporte()). //total
//                        append("\n");

            //a item y producto le agregue to string para optimizar y no tener q poner todo lo de arriba
            sb.append(item.toString()).append("\n");

        }
        sb.append("Gran total: ").
                append(calcularTotal());


        return sb.toString();
    }

}
