public class PrimitivosBool {
    public static void main(String[] args) {
        boolean datLogic = false;
        //Boolean = con B es de referencia ya no es primitivo

        double d = 42451.43e-3D;
        float f = 1.2343e2F;

        datLogic = d>f; //false
        System.out.println("datLogic = " + datLogic);

    }
}
