import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Ingresa cuantas veces quieres repetir un mensaje: ");
	    int n = sc.nextInt();
	    
	    System.out.println("Programa que muestra 100 veces un mensaje");
	    for(int i=1; i<=3; i++)
	    {
		    System.out.println(i + ".Hello World");
	    }
	    
	    
	    System.out.println("\nPrograma que muestra los primeros 100 numeros pares");
	    
	    int conteo = 0;
	    for(int np = 2; conteo < 3; np=np+2)
	    {
	        conteo++;
	        System.out.println(conteo + ". " + np);
	    }
	    
	    //1. 2
	    //2. 4
	    //3. 6
	    
	    System.out.println("programa que muestra las tablas de multiplicar");
	    
	    for(int tabla = 1; tabla <= 2; tabla++)
	    {
	        System.out.println("\nTabla del " + tabla);
	        for(int contador = 0; contador <= 2; contador ++)
	        {
	            int mul = tabla * contador;
	            System.out.println(tabla + " * " + contador + " = " + mul);
	        }
	    }

	    
	    
	    
	}
}
