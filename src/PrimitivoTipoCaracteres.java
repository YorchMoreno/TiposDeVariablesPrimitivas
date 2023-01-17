public class PrimitivoTipoCaracteres {
    public static void main(String[] args) {

        //char
        char caracteres='G';
        char numero='2';
        char unicode='\u0040';
        char decimal=64;
        System.out.println("caracteres = " + caracteres);
        System.out.println("numero = " + numero);
        System.out.println("unicode = " + unicode);
        System.out.println("decimal = " + decimal);
        //operador relacional
        System.out.println("decimal = unicode: " + (decimal == unicode ) );
        
        char simbolo='@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = numero: " + (simbolo == numero));
        System.out.println("*CLASE EQUIVALENTE CHARACTER*");
        System.out.println("valor de char en byte: " + Character.BYTES);
        System.out.println("valor de char en bites; " + Character.SIZE);
        System.out.println("valor maximo de char: " + Character.MAX_VALUE);
        System.out.println("valor minimo de char: " + Character.MIN_VALUE);

        System.out.println("CARACTERES ESPECIALES");

        //espacio
        char espacio=' ';
        char espacioUnicode='\u0020';

        System.out.println("valor de PI:" + espacio + "3.14");
        System.out.println("valor de PI:" + espacioUnicode + "3.14");

        //retroceso
        char retroceso='\b';

        System.out.println("valor de PI:" + retroceso + "3.14");

        //tabulador
        char tab='\t';

        System.out.println("valor de PI:" + tab + "3.14");
        System.out.println("valor de PI\t:" + tab + "3.14");

        //nueva linea o enter
        char enter='\n';
        System.out.println("valor de PI:" + enter + "3.14");
        System.out.println("valor de PI: \n 3.14");

        //retorno carro
        char retornoCarro='\r';
        System.out.println("valor de PI:" + retornoCarro + "3.14");
        System.out.println("valor de PI: \r 3.14");


    }
}
