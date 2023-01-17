public class PrimitivosTipoBoolean {
    public static void main(String[] args) {

        boolean datoLogico=true; //false;
        System.out.println("datoLogico = " + datoLogico);
        boolean constante=Boolean.FALSE;//Boolean.TRUE;
        System.out.println("constante = " + constante);

        //ejemplos
        int a=5;
        System.out.println("a = " + a);
        int b=8;
        System.out.println("b = " + b);

        datoLogico = b>a;
        System.out.println("¿b es mayor que a?: " + datoLogico);

        boolean esIgual=2-1 == 3;
        System.out.println("esIgual = " + esIgual);
    }
}
