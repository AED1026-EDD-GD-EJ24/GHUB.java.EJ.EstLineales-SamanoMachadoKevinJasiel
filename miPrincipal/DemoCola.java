package miPrincipal;

public class DemoCola
{
    public static void Menu()
    {
        System.out.println("*****************");
        System.out.println("    DEMO COLA");
        System.out.println("*****************\n");
        Cola<Integer> Cola = new Cola<Integer>();

        Cola.Encolar(12);
        Cola.Encolar(13);
        Cola.Encolar(14);
        Cola.Encolar(15);

        System.out.println("El primer elemento de la cola es: " + Cola.Frente());
        Cola.Desencolar();
        System.out.println("El primer elemento de la cola es: " + Cola.Frente());
        Cola.Desencolar();
        System.out.println("El primer elemento de la cola es: " + Cola.Frente());
        Cola.Desencolar();
        System.out.println("El primer elemento de la cola es: " + Cola.Frente());
        
    }
}