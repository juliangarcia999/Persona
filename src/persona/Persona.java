package persona;

import java.util.Scanner;

public class Persona {

    private String DNI;
    private String nombre = "";
    private float peso = 0;
    private float altura = 0;
    private String sexo = "";
    private int edad = 0;

    Scanner sc = new Scanner(System.in);

    public Persona() {
    }

    public Persona(String DNI, String nombre, float peso, float altura, String sexo, int edad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        switch (sexo) {
            case 'h':
            case 'H':
                this.sexo = "Hombre";
                break;
            case 'm':
            case 'M':
                this.sexo = "Mujer";
                break;
            default:
                this.sexo = "null";
                break;
        }
        this.sexo = Character.toString(sexo);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public String PonerDNI(){
        System.out.println("Introduzca su DNI: ");
        this.DNI = sc.nextLine();        
        return ("Tu DNI es: " +this.DNI);
    
    }
    
    @Override
    public String toString() {
        String resultado;
        System.out.println("Introduzca su nombre: ");
        this.nombre = sc.nextLine();
        System.out.println("Introduzca su peso: ");
        this.peso = sc.nextFloat();
        System.out.println("Introduzca su sexo ('H' para hombre y 'M' para mujer): ");
        this.sexo = sc.nextLine();
        System.out.println("Introduzca su altura: ");
        this.altura = sc.nextFloat();
        System.out.println("Introduzca su edad: ");
        this.edad = sc.nextInt();
        resultado = "Nombre: " + this.nombre + " \n Peso: " + this.peso + "\n Sexo: " + this.sexo + "\n Altura: " + this.altura + "\n Edad " + this.edad;
        return resultado;
    }
    
    public float calculoIMC(){
    float calculoIMC;
    calculoIMC = peso /(altura*altura);
    if (calculoIMC < 20){
        System.out.println("-1 (Por debajo del peso ideal)");
    }
    else if(calculoIMC > 20 && calculoIMC < 25){
        System.out.println("0 (Peso ideal)");
    }
     else if(calculoIMC > 25){
        System.out.println("1 (Sobrepeso)");
    }
     else{
        System.out.println("Valorres introducidos son incorrectos");
     }
        return calculoIMC;
    }
    
    public boolean esMayorDeEdad(){
       if(edad >= 18){
        return true;
       }
       else if(edad > 0 && edad < 18){
        return false;
       }
       while (edad < 0){
           System.out.println("Vuelva a intentarlo con otra edad. ");
           this.edad = sc.nextInt();
       }
        return false;
       
    
    }
}
