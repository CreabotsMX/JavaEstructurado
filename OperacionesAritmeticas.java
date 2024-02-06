import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Entradas
        float n1, n2;
        
        System.out.print("Ingresa el primer numero: ");
        n1 = sc.nextFloat();
        
        System.out.print("Ingresa el segundo numero: ");
        n2 = sc.nextFloat();
        
        //Salidas
        float r; 
        int residuo;
        
        //Proceso y salida
        r = n1 + n2;
        System.out.println("\n\n");
        System.out.println(n1 + " + " + n2 + " = " + r);
        
        r = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + r);
        
        r = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + r);
        
        r = (n1 / n2);
        residuo = (int)(n1 % n2);
        System.out.println(n1 + " / " + n2 + " = " + (int)r + " residuo " + residuo);
        
    }
}
