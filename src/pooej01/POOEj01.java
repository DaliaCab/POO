package pooej01;

import Entidad.Persona;
public class POOEj01 {

    public static void main(String[] args) {
        Persona primeraPersona = new Persona("Fabricio");         //Objeto tipo Persona
        Persona segundaPersona = new Persona("Mariano");          //Usamos el constructor
        System.out.println(segundaPersona.nombre);
       
        //Aquí creamos-instanciamos otro objeto (terceraPersona) y llenamos los atributos con los datos
        Persona terceraPersona = new Persona("Nicolás","Sastoque",27);
        //Imprimimos los datos que llenamos arriba
        System.out.println(terceraPersona.nombre + " "+ terceraPersona.apellido + " " + terceraPersona.id);
    }
    
    
   
            
    
}
