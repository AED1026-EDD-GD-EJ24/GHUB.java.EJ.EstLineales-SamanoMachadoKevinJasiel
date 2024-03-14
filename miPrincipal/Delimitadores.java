package miPrincipal;

public class Delimitadores
{
    public boolean evaluacion (String cadena)
    {
        Pila<String> pila = new Pila<String>();

        int i = 0;
        boolean masElementosPorLeer = true;
        char car = ' ';
        String s = "";

        while (i < cadena.length() && masElementosPorLeer)
        {
            car = cadena.charAt(i);
            s = charToString(car);
            i++;

            switch (car) 
            {
                case '(': pila.apilar(charToString(')')); break;

                case '[': pila.apilar(charToString(']')); break;

                case '{': pila.apilar(charToString('}')); break;

                case '/':
                {
                    //Verificar si el siguiente caracter es un asterisco *
                    if (siguienteEsAsterisco(cadena, i))
                    {
                        pila.apilar(charToString('*'));
                        i++;
                    }
                    break;
                }

                case ')': 
                case ']': 
                case '}':
                {
                   String aux = pila.cima();
                   if (aux != null)
                   {
                        if (s.compareTo(aux) == 0)
                        {
                            //Hay correspondencia y por lo tanto lo elimino
                            pila.retirar();
                        }
                        else
                        {
                            //No hay correspondencia
                            masElementosPorLeer = false;
                        }
                   }
                
                }

                case '*': 
                {
                    if (siguienteEsDiagonal(cadena, i))
                    {
                        pila.retirar();
                        i++;
                    }
                }
                default:
                    break;
            }
        }

        if (pila.esVacia() && masElementosPorLeer)
            return true;
        else
            return false;
    }

    private static String charToString(char ch)
    {
        return String.valueOf(ch);
    }

    private static boolean siguienteEsAsterisco(String cadena, int posicion)
    {
        char car = cadena.charAt(posicion);

        if (car == '*')
            return true;
        else
            return false;
    }

    private static boolean siguienteEsDiagonal(String cadena, int posicion)
    {
        char car = cadena.charAt(posicion);

        if (car == '/')
            return true;
        else
            return false;
    }
}
