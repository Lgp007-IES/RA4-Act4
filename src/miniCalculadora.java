/**
 * La clase miniCalculadora proporciona métodos para realizar operaciones
 * matemáticas básicas utilizando la librería Math de Java.
 * * @author Luis Guerrero
 * @version 1.0
 */
public class miniCalculadora {
    /**
     * Calcula el valor absoluto de un número decimal.
     * * @param num El número del cual se desea obtener el valor absoluto.
     * @return El valor absoluto del número introducido.
     */
    public double valorAbsoluto(double num){
        return Math.abs(num);
    }
    /**
     * Calcula la raíz cuadrada de un número decimal.
     * * @param num El número del que se desea obtener la raíz cuadrada.
     * @return La raíz cuadrada del número. Si el número es negativo, devolverá NaN.
     */
    public double raizCuadrada (double num){
        return Math.sqrt(num);
    }
}
