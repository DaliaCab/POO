package pooej01;
import Entidad.Libro;
import java.util.Scanner;

public class MainLibro {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Libro primerLibro = new Libro();
        
    
    
        System.out.println("Ingrese el título del libro: " );
        //primerLibro.titulo =  leer.next();
        String titulo = leer.next();
        System.out.println("Ingrese el autor: " );
        //primerLibro.autor =  leer.next();
        String autor = leer.next();
        System.out.println("Ingrese el ISBN: " );
        //primerLibro.ISBN =  leer.nextInt();
        int ISBN = leer.nextInt();
        System.out.println("Ingrese el # de páginas: " );
        //primerLibro.numDePags =  leer.nextInt();
        int numDePags = leer.nextInt();
        
        Libro primerLibro = new Libro(titulo, autor, ISBN, numDePags);
        
        System.out.println("El libro es: " + primerLibro.titulo);
        System.out.println("El autor es: " + primerLibro.autor);
        System.out.println("El ISBN es: " + primerLibro.ISBN);
        System.out.println("El # de páginas es: " + primerLibro.numDePags);
    }
}
