package miPrincipal;

public class Persona 
{
    private String Nombre, Nacionalidad;
    private int Edad;

    public Persona(String nombre, int edad, String nacionalidad) 
    {
        this.Nombre = nombre;
        this.Nacionalidad = nacionalidad;
        this.Edad = edad;
    }

    public String getNombre() 
    {
        return Nombre;
    }

    public void setNombre(String nombre) 
    {
        this.Nombre = nombre;
    }

    public String getNacionalidad() 
    {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) 
    {
        this.Nacionalidad = nacionalidad;
    }

    public int getEdad() 
    {
        return Edad;
    }

    public void setEdad(int edad) 
    {
        this.Edad = edad;
    }

    public String toString() 
    {
        return "Nombre: " + Nombre + ", Edad: " + Edad + ", Nacionalidad: " + Nacionalidad;
    }
}
