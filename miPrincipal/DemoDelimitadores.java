package miPrincipal;

public class DemoDelimitadores 
{
    public static void Menu() 
    {
        System.out.println("*********************");
        System.out.println("    DELIMITADORES");
        System.out.println("*********************\n");

        Delimitadores objDel = new Delimitadores();

        String expr = "(a+b)/2";

        if (objDel.evaluacion(expr))
            System.out.println("Expresion correcta");
        else
            System.out.println("Expresion incorrecta");
    }
}
