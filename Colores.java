import java.util.Scanner;

public class Colores 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Programa para mostrar un cuadro de colores");
        System.out.print("Ingresa el tamaño del cuadro: ");
        int tamanio = entrada.nextInt();
        for(int i=0; i<tamanio ;i++)
        {
            for(int j=0; j<tamanio ;j++)
            {
                int rnd = (int) (Math.random()*8+41);
                System.out.print("\u001B[" + rnd + "m " + rnd);
            }
            System.out.println("");
        }
    }
}

