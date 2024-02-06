
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
        float sum, res, mul; 
        int div, mod;
        
        //Proceso
        sum = n1 + n2;
        res = n1 - n2;
        mul = n1 * n2;
        div = (int)(n1 / n2);
        mod = (int)(n1 % n2);
        
        //Mostrar resultados
        System.out.println(n1 + " + " + n2 + " = " + sum);
        System.out.println(n1 + " - " + n2 + " = " + res);
        System.out.println(n1 + " * " + n2 + " = " + mul);
        System.out.println(n1 + " / " + n2 + " = " + div);
        System.out.println(n1 + " mod " + n2 + " = " + mod);
        
    }
    
}
