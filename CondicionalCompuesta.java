import java.util.Scanner;

public class CondicionalCompuesta
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa tu edad: ");
        byte edad = sc.nextByte();
        
        if(edad >= 18)
        {
            System.out.println("Eres mayor de edad");
        }
        
        else
        {
            System.out.println("Eres menor de edad");
        }
    }
   
}