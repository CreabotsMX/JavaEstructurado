import java.util.Scanner;

public class CondicionalAnidada
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce tu edad: ");
        byte edad = sc.nextByte();
        
        if(edad >= 21)
        {
            System.out.println("Eres mayor de edad en MEX y USA");
        }
        
        else
        {
            if(edad >= 18)
            {
                System.out.println("Eres mayor de edad en MEX pero no en USA");
            }
            
            else
            {
                System.out.println("Eres menor de edad en MEX y USA");
            }            
        }
    }
    
}
