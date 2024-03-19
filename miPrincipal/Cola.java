package miPrincipal;

public class Cola
{
    private Nodo<T> Cabeza;
    private Nodo<T>Cola;
    private int Tamanio;

    public Cola()
    {
        Cabeza = null;
        Cola = null;
        Tamanio = 0;    
    }

    public boolean esVacia()
    {
        return Cabeza == null;
    }

    public void Encolar(T valor)
    {
        Nodo<T> nuevo = new Nodo<T>(valor);
        nuevo.setSiguiente(valor);

        if (esVacia())
        {
            Cabeza = nuevo;
            Cola = nuevo;   
        }
        else
        {
            Cola.setSiguiente(nuevo);
            Cola = nuevo;
        }
        Tamanio++;
    }

    public void Desencolar()
    {
        if (!esVacia())
        {
            if (Cabeza == Cola)
            {
                Cabeza = null;
                Cola = null;
            }
            else
            {
                Cabeza = Cabeza.getSiguiente();
            }
            Tamanio--;   
        }
    }

    public T Frente()
    {
        if (!esVacia())
        {
            return Cabeza.getValor();
        }
        else
        {
            return null;
        }
    }

    public int getTamanio()
    {
        return Tamanio;
    }
}