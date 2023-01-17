public class PrimitivosTipoEntero {
    public static void main(String[] args) {

        //byte
        byte numeroByte=127;

        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte correspondiente en byte a: " + Byte.BYTES);
        System.out.println("tipo byte correspondiente en bit a: " + Byte.SIZE);
        System.out.println("Valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE);

        //short
        short numeroShort=32767;

        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short correspondiente en byte a: " + Short.BYTES);
        System.out.println("tipo short correspondiente en bit a: " + Short.SIZE);
        System.out.println("Valor maximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short: " + Short.MIN_VALUE);

        //int
        int numeroInt=2147483647;

        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int correspondiente en byte a: " + Integer.BYTES);
        System.out.println("tipo int correspondiente en bit a: " + Integer.SIZE);
        System.out.println("Valor maximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int: " + Integer.MIN_VALUE);

        //long
        long numeroLong=9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long correspondiente en byte a: " + Long.BYTES);
        System.out.println("tipo long correspondiente en bit a: " + Long.SIZE);
        System.out.println("Valor maximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un long: " + Long.MIN_VALUE);
    }
}
