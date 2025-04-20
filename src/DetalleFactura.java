import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        String descripcion = "";
        List<Double> precio = new ArrayList<>();
        System.out.print("Ingrese descripcion: ");
        descripcion = sc.nextLine();
        while (true) {
            System.out.print("Ingrese el precio: ");
            Double precios = sc.nextDouble();
            precio.add(precios);
            System.out.print("Desea ingresar otra factura: 1.Si/0.No");
            opcion = sc.nextInt();
            if (opcion == 0) {
                break;
            }
        }
        double sum = 0.0;
        double iva = 19.0;
        double resultado =0.0;
        for (double moneda : precio) {
            sum += moneda;
            // System.out.println("Lista de precios: " +moneda);
        }
        resultado = sum + (sum*iva/100);
        System.out.println("La factura de: " + descripcion + "tiene un total bruto de " + sum + "con un impuesto de " +iva+ " para un total de: " + resultado);

    }
}
