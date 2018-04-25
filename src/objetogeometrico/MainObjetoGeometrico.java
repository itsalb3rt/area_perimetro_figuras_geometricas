/**
*El área de un trapecio se calcula a partir de su altura y los dos lados 
* paralelos (a y b) o bases del trapecio. Es el resultado de multiplicar
* su altura (h) y la mediana del trapecio, que se obtiene como la media 
* de las dos bases a y b: M=(a+b)/2.
 */
package objetogeometrico;
import ventanas.menu_principal;

/**
 *
 * @author Usuario
 */
public class MainObjetoGeometrico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Esta es la clase main si no se llama al objeto ventana al compilar el programa no se podra ejecutar
       menu_principal nuevo_menu = new menu_principal();
        
        //Estableciendo una ventana nueva para cuando se ejecute el ejecutable .jar aparesca la ventana
      nuevo_menu.setVisible(true);
       
       Cuadrado nuevo_cuadrado = new Cuadrado(2, 2);
       
      System.out.println(nuevo_cuadrado.calcularArea());
       
       
        
    }
    
}
