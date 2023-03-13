import java.util.Scanner;

public class Ordenar 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        float n1,n2,n3;
        System.out.println("Programa para ordenar de menor a mayor 3 números");
        System.out.println("Ingresa 3 números entre -10 y 10...");
        System.out.print("Ingresa el primer número: ");
        n1 = entrada.nextFloat();
        System.out.print("Ingresa el segundo número: ");
        n2 = entrada.nextFloat();
        System.out.print("Ingresa el tercer número: ");
        n3 = entrada.nextFloat();
        
        if((n1 >= -10 && n1 <= 10)  &&  (n2 >= -10 && n2 <= 10)  &&  (n3 >= -10 && n3 <= 10))
        {
            System.out.println("Los números ordenados de menor a mayor son:");
            if(n1 < n2)
            {
                if(n2 < n3)
                {
                    System.out.println(n1 + ", " + n2 + ", " + n3);
                }
                else
                {
                    if(n1 < n3)
                    {
                        System.out.println(n1 + ", " + n3 + ", " + n2);
                    }
                    else
                    {
                        System.out.println(n3 + ", " + n1 + ", " + n2);
                    }
                }
            }
            else
            {
                if(n1 < n3)
                {
                    System.out.println(n2 + ", " + n1 + ", " + n3);
                }
                else
                {
                    if(n2 < n3)
                    {
                        System.out.println(n2 + ", " + n3 + ", " + n1);
                    }
                    else
                    {
                        System.out.println(n3 + ", " + n2 + ", " + n1);
                    }
                }
            }
        }
        else
        {
            System.out.println("Datos no válidos");
        }
    }
}

