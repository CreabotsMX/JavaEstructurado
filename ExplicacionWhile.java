
import java.util.Scanner;


public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("CICLO WHILE");
        System.out.println("\nPermite repetir una serie de instrucciones si se cumple una condicion.");
        System.out.println("Primero evalua y despues ejecuta");
        System.out.println("Existen 2 tipos de uso");
        System.out.println("1. Cuando conocemos cuantas veces se repetira algo");
        System.out.println("2. Desconocemos la cabntidad de veces que se repetira, pero conocemos la coindición de paro");
        
        System.out.println("Ejemplo caso 1");
        System.out.println("Programa que repite 100 veces mi nombre");
        
        int contador = 1;
        
        while(contador <= 100)
        {
            //Instruccion(es);
            System.out.println(contador + ". Jesus Castañeda Espinosa");
            
            //Modificar valor de la variable
            contador = contador + 1;
        }
        
        System.out.println("Ejemplo caso 2");
        System.out.println("Programa que genera un numero secreto y debera adivinar el usuario");
        
        int secreto = (int) (Math.random() * 10);
        contador = 1;
        
        System.out.print("Ingresa un numero entre 0 y 10: ");
        int n = sc.nextInt();
        
        while(n != secreto) // != diferente de
        {
            //Instruccion(es);
            if(n > secreto)
            {
                System.out.println("El numero secreto es mas chico");                
            }
            
            else
            {
                System.out.println("El numero secreto es mas grande");
            }
            
            contador++; //contador = contador + 1;
            
            //Modificar valor de la variable
            System.out.print("Ingresa un numero entre 0 y 10: ");
            n = sc.nextInt();
        }
        
        System.out.println("Felicidades, encontraste el numero secreto en " + contador + " intentos");
        
    }   
}
