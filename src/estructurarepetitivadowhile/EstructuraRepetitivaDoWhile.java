/*
2. Ejemplo de uso de do-while. Programa Java que muestre los números del 1 al 100 
utilizando la instrucción do..while.

 */
package estructurarepetitivadowhile;

/**
 *
 * @author carlosjoseanguiano
 */
public class EstructuraRepetitivaDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0;
        int a;
        do {
            num++;
            System.out.println("Valor : " + num);
        } while (num < 100);
    }

}
