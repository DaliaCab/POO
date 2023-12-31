/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main

g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package Entidad;

public class Operacion {
    
    private double numero1;     //Atributo privado 
    private double numero2;      //Atributo privado

    public Operacion(double numero1, double numero2) {  //a) lo ponemos con alt+insert y seleccionamos todos los atributos
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {                              //b) Constructor sin atributos
    }
    
    public double getNumero1(){                      //c) métodos get
        return numero1;
    }
    
    public double getNumero2(){
        return numero2;
    }
    
    public void setNumero1(double numero1){         //c) Método- void porque no devuelve nada pero si recibe
        this.numero1 = numero1;
    }
    
    public void setNumero2(double numero2){         //El this lo usamos para llamar atributos de ESTA clase THIS clase
        this.numero2 = numero2;
    }
   
    public void crearOperacion(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public double suma(){
        return this.numero1 + this.numero2;
    }

    public double resta(){
        return this.numero1 - this.numero2;
    }
    
    public double multiplicacion(){
        if (this.numero2 == 0 || this.numero2 == 0){
            System.out.println("ERROR, escriba un número diferente a 0, éste programa no ultiplica por 0");
            return 0;
        }
        else{
            return this.numero1 * this.numero2;
        }
    }
    
    public double division(){
        if (this.numero1 == 0 || this.numero2 == 0){
            System.out.println("ERROR, escriba un número diferente a 0, éste programa no divide por 0");
            return 0;
        }
        else{
            return this.numero1 / this.numero2;
        }
    }
}
