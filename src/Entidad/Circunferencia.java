/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package Entidad;

public class Circunferencia {

 
    private double radio;      //Atributo privado radio
    
    
    public Circunferencia(double radio){   //a Constructor
        this.radio = radio;
    }
    
    public double getRadio(){              //b Método
        return radio;
    }
    
    public void setRadio (double radio){   //b Método- void porque no devuelve nada pero si recibe, aquí recibe el radio
        this.radio = radio;
    }
    
    public double area(){                 //Método
        return this.radio*this.radio*3.141592;
    }
    
    public double perimetro(){
        return 2*3.141592*this.radio;     //Usamos this porque es el radio de esa clase
    }
    
}
