package org.mcarranza.appfacturas.modelo;

public class ItemFactura {
    private int cantidad;

    //relacion con el producto
    private Producto producto;

    //constructor
    public ItemFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    //get y set

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    //metodos
    public float calcularImporte(){ //llamo en factura calcularTOtal()
        return this.cantidad * this.producto.getPrecio();
    }

    @Override
    public String toString() {
        return producto.toString() + //imprime lo q tiene el to string de producto
        "\t"+cantidad+
                "\t"+calcularImporte();

    }
}
