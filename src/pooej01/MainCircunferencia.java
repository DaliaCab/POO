package pooej01;
import Entidad.Circunferencia;
import java.util.Scanner;

public class MainCircunferencia {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Circunferencia r1 = new Circunferencia(5.777);         //Objeto tipo Circunferencia, radio inicial
        //Circunferencia C1 = new Circunferencia("");          //Usamos el constructor
        System.out.println(r1.getRadio());
        r1.setRadio(6.1);                                     //Cambiamos el radio
        
        System.out.println(r1.getRadio());
        System.out.println("El área es: " + r1.area());
        System.out.println("El perímetro es: " + r1.perimetro());
        
    }
       
        
 }
    

