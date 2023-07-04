package Entidad;
public class Persona {          //modificador de acceso = public, protected, private
    public String nombre;      //Ésta lína es un atributo de tipo de otro objeto
    public String apellido;    //A la creación de un objeto le llamamos INSTANCIACIÓN
    public int id;
    
    public Persona(String nombre){ //Método Constructor con parámetros
        this.nombre = nombre;
        //Usamos this para diferenciar entre los atributos del obj y
        //los parámetros del método constructor
    }

    public Persona() { //método Constructor por defecto, sin parámetros
    }   

    
    //Ahora creemos un constructor que reciba solo los tres datos(atributos)
    public Persona(String nombre, String apellido, int id) {  
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }
}
