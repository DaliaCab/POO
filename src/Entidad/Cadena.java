/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Entidad;

public class Cadena {
    
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }
    
    
    public int mostrarVocales(){
        int contador = 0;
        
        for(int i=0; i<this.longitud; i++){ 
            if(
                    String.valueOf(this.frase.charAt(i)).equalsIgnoreCase("a") || // Usamos valueOf para transformar Char a String para poder usar el equalsIg...
                    this.frase.charAt(i)== 'e' ||         //Aquí al no usa el Equals(porque es Char y no String) solo comparamos con minúsculas
                    this.frase.charAt(i)== 'i' ||
                    this.frase.charAt(i)== 'o' ||
                    this.frase.charAt(i)== 'u'
                    ){
                contador++;
            }                
        }
        
        return contador;
    }
    
    public String invertirFrase(){
        StringBuilder respuesta = new StringBuilder();   //StringBuilder sirve para crear un String a partir de Char caracteres
        for(int i = frase.length()-1 ; i >= 0; i-- ){
            respuesta.append(frase.charAt(i));           //Aquí agregamos los carácteres uno por uno
        }
        this.frase = respuesta.toString();              //Con .toString convertimos el Objeto en String
        return this.frase;
    }
    
    public int vecesRepetido(String letra){
        int contador = 0;
        for(int i=0; i<this.longitud; i++){ 
            if(letra.equalsIgnoreCase(String.valueOf(this.frase.charAt(i)))){
                contador++;
            }
        }
        return contador;
    }
    
    public boolean compararLongitud(String frase){
        return frase.length() == this.longitud;      //Esto es lo mismo a lo que está comentado abajo pero en una línea

        /*
        if (frase.length() == this.longitud){
            return true;  
        } else{
            return false;
        } */
    }
    
    public String unirFrases(String frase){
        this.frase = this.frase + frase;
        this.longitud = this.frase.length();      //Como cambiamos la frase hay que volver a medir la longitud
        return this.frase;
    }
    
    public String reemplazar(String letra){
        StringBuilder nuevaFrase = new StringBuilder();
        for(int i=0; i<this.longitud; i++){
            if(frase.substring(i,i+1).equals("a")){
                nuevaFrase.append(letra); //replace('i', 'a')
            } else{
                nuevaFrase.append(frase.charAt(i));
            }
        }
        this.frase = nuevaFrase.toString(); 
        return this.frase;
    }
    
    
    public boolean contiene(String letra){
        for (int i=0; i<this.longitud; i++) {
            if(frase.substring(i,i+1).equals("a")){
                return true;
            }
        }
        return false;
    }
}
