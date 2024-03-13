package miPrincipal;

public class DemoPila
{
    public static void Menu()
    {
        System.out.println("*****************");
        System.out.println("    DEMO PILA");
        System.out.println("*****************\n");
        Pila<Integer> Pila = new Pila<Integer>();

        Pila.apilar(2);
        Pila.apilar(5);
        Pila.apilar(7);
        System.out.println("El tope de la pila es " + Pila.cima());
        Pila.retirar();
        System.out.println("El tope de la pila es " + Pila.cima());
        Pila.retirar();
        System.out.println("El tope de la pila es " + Pila.cima());
        Pila.retirar();
        System.out.println("El tope de la pila es " + Pila.cima());
        
    }
}