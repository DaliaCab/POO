package pooej01;
import Entidad.Cadena;
import java.util.Scanner;

public class CadenaMain {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Cadena primeraCadena = new Cadena();
        
        System.out.println("ingrese una frase que puede ser una palabra o varias palabras separadas por un espacio en blanco");
        String frase = leer.next();
        primeraCadena.setFrase(frase);
        
        System.out.println("La cantidad de vocales tiene su frase es: " + primeraCadena.mostrarVocales());
        
        System.out.println("La frase invertida es: " + primeraCadena.invertirFrase() );
        System.out.println(primeraCadena.getFrase());
        
        System.out.println("Ingrese una letra: ");
        String letra = leer.next();
        System.out.println("La letra sale " + primeraCadena.vecesRepetido(letra) + " veces");
        
        System.out.println("Ingrese una nueva frase: ");
        frase = leer.next();
        System.out.println("La longitud de las frases es: " + primeraCadena.compararLongitud(frase) );
        
        
        System.out.println("Las frases unidas son: " + primeraCadena.unirFrases(frase));
        
        System.out.println("Ingrese un crácter por el que quiera reem´plazar las A: ");
        letra = leer.next();
        System.out.println("Al reemplazar las a nos queda: " + primeraCadena.reemplazar(letra));
        
        System.out.println("Escoja un carácter para saber si está en la frase: ");
        letra = leer.next();
        if(primeraCadena.contiene(letra)){
            System.out.println("El carácter sí está");
        } else {
            System.out.println("El carácter no está");
        }
        
    }
    
}
