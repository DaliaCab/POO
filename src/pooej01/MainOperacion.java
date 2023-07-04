package pooej01;
import Entidad.Operacion;
import java.util.Scanner;

public class MainOperacion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el número 1: " );
        double numero1 = leer.nextDouble();
        System.out.println("Ingrese el número 2: " );
        double numero2 = leer.nextDouble();
        
        
        Operacion primerosNums = new Operacion(numero1, numero2);
        
        System.out.println("El n1 es: " + primerosNums.getNumero1());
        System.out.println("El n2 es: " + primerosNums.getNumero2());
        
        
        System.out.println("La suma de los números es: " + primerosNums.suma());
        System.out.println("La resta de los números es: " + primerosNums.resta());
        System.out.println("La multiplicación de los números es: " + primerosNums.multiplicacion());
        System.out.println("La división de los números es: " + primerosNums.division());
    }
    
}
