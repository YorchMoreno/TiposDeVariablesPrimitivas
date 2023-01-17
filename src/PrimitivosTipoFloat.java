public class PrimitivosTipoFloat {
    public static void main(String[] args) {

        //float
        float realFloat=0.000000000015f;//1.5e-10f;

        System.out.println("realFloat = " + realFloat);
        System.out.println("valor de float en byte: "+Float.BYTES);
        System.out.println("valor de float en bites: "+Float.SIZE);
        System.out.println("valor maximo de float: "+Float.MAX_VALUE);
        System.out.println("valor minimo de float: "+Float.MIN_VALUE);

        //double
        double realDouble=1;
        System.out.println("realDouble = " + realDouble);
        System.out.println("valor de double en byte: "+Double.BYTES);
        System.out.println("valor de double en bites: "+Double.SIZE);
        System.out.println("valor maximo de double: "+Double.MAX_VALUE);
        System.out.println("valor minimo de double: "+Double.MIN_VALUE);
    }
}
