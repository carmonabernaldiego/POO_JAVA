package misClases; //Se le declara un paquete

public class Animal
{
    private String raza;
    private String nombre;
    private int edad;

    public Animal(String nuevoNombre)
    {
        nombre = nuevoNombre; //Se le da un nombre al animal
    }

    //M�todo para obtener la edad del animal
    public int getEdad()
    {
        return edad;
    }

    //M�todo para establecer la edad del animal
    public void setEdad(int nuevaEdad)
    {
        edad = nuevaEdad;
    }

    //M�todo para obtener el nombre del animal
    public String getNombre()
    {
        return nombre;
    }
}