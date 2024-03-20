package miPrincipal;

public class DemoCola
{
    public static void Menu()
    {
        System.out.println("*****************");
        System.out.println("    DEMO COLA");
        System.out.println("*****************\n");
        Cola<Integer> Cola = new Cola<Integer>();

        Cola.encolar(12);
        Cola.encolar(13);
        Cola.encolar(14);
        Cola.encolar(15);

        System.out.println("El primer elemento de la cola es: " + Cola.frente());
        Cola.desencolar();
        System.out.println("El primer elemento de la cola es: " + Cola.frente());
        Cola.desencolar();
        System.out.println("El primer elemento de la cola es: " + Cola.frente());
        Cola.desencolar();
        System.out.println("El primer elemento de la cola es: " + Cola.frente());
        
    }
}