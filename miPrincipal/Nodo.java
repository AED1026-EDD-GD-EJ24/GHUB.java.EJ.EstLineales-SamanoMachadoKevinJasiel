package miPrincipal;
public class Nodo<T>
{
    //Atributo valor de tipo T. Almacena la referencia al objeto que se guarda en el nodo

    //Guarda el nodo
    private T valor;

    //Referencia al siguiente Nodo Enlazado
    private Nodo<T> siguiente;

    public Nodo()
    {
        valor = null;
        siguiente = null;
    }

    public T getValor()
    {
        return valor;
    }

    public void setValor(T valor)
    {
        this.valor = valor;
    }

    public Nodo<T> getSiguiente()
    {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente)
    {
        this.siguiente = siguiente;
    }


}
