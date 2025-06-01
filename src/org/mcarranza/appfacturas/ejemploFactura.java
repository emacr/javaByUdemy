package org.mcarranza.appfacturas;

import org.mcarranza.appfacturas.modelo.*;

import java.util.Scanner;

public class ejemploFactura {
    public static void main(String[] args) {
        Cliente cl = new Cliente();
        cl.setnHacienda("341-421");
        cl.setNombre("Ana");

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la descripcion de la factura: ");
        String desc = sc.nextLine();

        Factura f = new Factura(desc,cl);

        Producto producto; //inicializo clase Producto
//        String nombre;
//        float precio;
           int cantidad;

        //vamoa a registrar 5 productos
        System.out.println();
        for(int i=0; i<5;i++){
            producto = new Producto(); //instancio producto

            //asigno los datos de producto:
            System.out.print("Ingrese producto n: "+producto.getCodigo()+": ");
             //next solo permite una palabra, es decir sin espacios en blanco
            producto.setNombre(sc.next());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(sc.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            cantidad = sc.nextInt(); //cantida es del item no del producto

            ItemFactura item = new ItemFactura(cantidad,producto);
            //relacion: asignar itema  a la factura
            f.addItemFactura(item);

            //otra forma mas optimizada
            //f.addItemFactura(new ItemFactura(cantidad,producto));

            System.out.println();
        }
        //muestro detalle despues de registrar todos los productos
        System.out.println(f.generarDetalle());
    }

}
