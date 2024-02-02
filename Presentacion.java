import java.util.Scanner;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc  = new Scanner(System.in);   //Se crea un objeto de mi clase Scanner llamada sc
        
        String nombre;
        byte edad;
        float estatura;
        char inicial;
        boolean esAlumno;
        
        System.out.print("Introduce tu nombre: ");
        nombre = sc.next();
        inicial = nombre.charAt(0);
        
        System.out.print("Introduce tu edad: ");
        edad = sc.nextByte();
        
        System.out.print("Introduce tu estatura: ");
        estatura = sc.nextFloat();
               
        System.out.print("¿Eres alumno? ");
        esAlumno = sc.nextBoolean();
        
        System.out.println("\n\n\nBienvenido " + nombre);
        System.out.println("Tienes " + edad + " años");
        System.out.println("Mides " + estatura + " metros");
        System.out.println("Tu letra inicial es: " + inicial);
        System.out.println("¿Eres alumno? " + esAlumno);
                      
    } 
}
