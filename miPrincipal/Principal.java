package miPrincipal;
import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner consola = new Scanner(System.in);
        int opc =0;
        do
        {
            System.out.println("****************************");
            System.out.println("    ESTRUCTURAS LINEALES    ");
            System.out.println("****************************");
            System.out.println("1) Pila");
            System.out.println("2) Stack");
            System.out.println("3) Delimitador");
            System.out.println("4) Expresion infija-postfija");
            System.out.println("5) Cola");
            System.out.println("6) Queue");
            System.out.println("7) Tablas de dispersion");
            System.out.println("8) Estructuras combinadas");
            System.out.println("            ");
            System.out.println("0) SALIR");
            System.out.print("Selecciona opción:");
            opc=consola.nextInt();
            System.out.println();

            switch (opc)
            {
                case 1: DemoPila.Menu(); System.out.println(); break;
                case 2: DemoStack.Menu(); System.out.println(); break;
                case 3: DemoDelimitadores.Menu(); System.out.println(); break;
                case 4: break;
                case 5: DemoCola.Menu(); System.out.println(); break;
                case 6: DemoQueue.Menu(); System.out.println(); break;
                case 7: DemoTablaDispersion.Menu(); System.out.println(); break;
            
                case 0: System.out.println("ADIOS!"); consola.close(); break;
             default:
               System.out.println("Valor incorrecto, intente de nuevo!");
            }
       
        }while (opc != 0);
		
    }
}