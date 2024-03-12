package miPrincipal;

public class ClienteMain
{
    public static void main (String [] args)
    {
        Pila<Integer> Pila = new Pila<Integer>();

        Pila.apilar(2);
        Pila.apilar(5);
        Pila.apilar(7);
        System.out.println("El tope de la pila es " + Pila.cima());
        Pila.retirar();
        System.out.println("El tope de la pila es " + Pila.cima());
        Pila.retirar();
        System.out.println("El tope de la pila es " + Pila.cima());
    }
}