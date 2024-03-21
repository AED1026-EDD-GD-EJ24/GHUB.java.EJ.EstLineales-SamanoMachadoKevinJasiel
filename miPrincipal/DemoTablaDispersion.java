package miPrincipal;
import java.util.*;

public class DemoTablaDispersion 
{
    public static void Menu()
    {
        System.out.println("********************************");
        System.out.println("    DEMO TABLA DE DISPERSION");
        System.out.println("********************************\n");

        Persona p1 = new Persona("Pablo", 23, "Argentino");
        Persona p2 = new Persona("Juan", 10, "Mexicano");
        Persona p3 = new Persona("Pedro", 18, "Español");

        Hashtable<String, Persona> tabla = new Hashtable<String, Persona>();

        tabla.put(p1.getNombre(), p1);
        tabla.put(p2.getNombre(), p2);
        tabla.put(p3.getNombre(), p3);

        System.out.println(tabla.get("Pablo"));
        System.out.println(tabla.get("Juan"));
        System.out.println(tabla.get("Pedro"));
        System.out.println(tabla.get("Ronaldo"));

        System.out.println();

        String aux ="";
        Enumeration<String> keys = tabla.keys();

        while (keys.hasMoreElements())
        {
            aux = keys.nextElement();
            System.out.println(aux + " = " + tabla.get(aux));
        }
    }
}
