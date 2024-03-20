package miPrincipal;
import java.util.*;
public class DemoQueue 
{
    /*
     * La API de java esta implementaada la cola mediante interface
     * java.util.Queue, como es una interface se requiere istanciar
     * como un objeto en concreto, esta interface se puede implementar
     * con la API Collections de java
     *     java.util.LinkedList
     *     java.util.PriorityQueue
     * LinkedList es una aplicacion de cola estandar
     * Priority es una cola de prioridades que almacena
     * elementos internos de acuerdo a un orden.
     * Las operaciones basicas de Queue son:
     * add(). Insertar un elemento en la cola
     * remove(). Eliminar un elemento de la cola
     * peek(). Devuelve el primer elemento de la cola y devuelve null si la cola esta vacia
     */
    public static void Menu()
    {
        System.out.println("*****************");
        System.out.println("    DEMO QUEUE");
        System.out.println("*****************\n");

        //Creamos una cola generica
        Queue micola = new LinkedList();

       //Agregamos tres elementos a la cola
       micola.add("Elemento 0");
       micola.add("Elemento 1");
       micola.add("Elemento 2");

       //Muestra tres elementos de la cola en orden

       System.out.println("El primer elemento de la cola es: " + micola.peek());
       System.out.println("El elemento removido de la cola es: " + micola.remove());

       System.out.println("\nEl primer elemento de la cola es: " + micola.peek());
       System.out.println("El elemento removido de la cola es: " + micola.remove());

       System.out.println("\nEl primer elemento de la cola es: " + micola.peek());
       System.out.println("El elemento removido de la cola es: " + micola.remove());

       System.out.println("\nEl primer elemento de la cola es: " + micola.peek());
    }
}

