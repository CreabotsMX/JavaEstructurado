import java.util.Scanner;

public class Letras
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        //Generador de palabras aleatorias
        int tamanioWhile;
        System.out.print("Escribe la cantidad de letras de la palabra: ");
        tamanioWhile = entrada.nextInt();
        
        //Con while
        int letrasWhile=1;
        System.out.println("\nResultado con While: ");
        while(letrasWhile <= tamanioWhile)
        {
            System.out.print( (char) ( (int)Math.round( (float)(Math.random()*25) + 65 ) ) + " ");
            letrasWhile++;
        }
        
        //Con do-while
        int letrasDoWhile=1;
        System.out.println("\n\nResultado con Do-while: ");
        do
        {
            System.out.print( (char) ( (int)Math.round( (float)(Math.random()*25) + 65 ) ) + " ");
            letrasDoWhile++;
        }while(letrasDoWhile <= tamanioWhile);
        
        //Con for
        System.out.println("\n\nResultado con For: ");
        for(int letrasFor = 1; letrasFor <= tamanioWhile; letrasFor++)
        {
            System.out.print( (char) ( (int)Math.round( (float)(Math.random()*25) + 65 ) ) + " ");
        }
        System.out.println("\n\n");
    }
}

