import java.util.Scanner;

public class Datos 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
       
        int entero;
        float decimal;
        String cadenaDeCaracteres;
        String cadenasDeCaracteres;
        char caracter;
        
        System.out.print("Ingresa una frase: ");
        cadenasDeCaracteres = entrada.nextLine();
        
        System.out.print("Ingresa un número entero: ");
        entero = entrada.nextInt();
        
        System.out.print("Ingresa un número decimal: ");
        decimal = entrada.nextFloat();
        
        System.out.print("Ingresa una palabra: ");
        cadenaDeCaracteres = entrada.next();
        
        System.out.print("Ingresa un caracter: ");
        caracter = entrada.next().charAt(0);
        
        System.out.println("\nLos datos que ingresaste son: ");
        System.out.println("La frase es: " + cadenasDeCaracteres);
        System.out.println("El valor entero es: " + entero);
        System.out.println("El valor decimal es: " + decimal);
        System.out.println("La palabra es: " + cadenaDeCaracteres);
        System.out.println("El caracter es: " + caracter);  
    }
}
