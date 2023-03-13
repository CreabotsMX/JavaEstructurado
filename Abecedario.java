import java.util.Scanner;

public class Abecedario 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        char letraFinal;
        int letraInicio = 65; // es la letra A en código ASCII  
        int letraActual; //letra que se va mostrando
        
        System.out.println("Programa para imprimir letras del abecedario");
        System.out.print("Ingresa la letra hasta la cuál se mostrará el abecedario: ");
        letraFinal = entrada.next().toUpperCase().charAt(0);
        
        letraActual = letraInicio;
        while(letraActual <= letraFinal)
        {
            System.out.print((char)letraActual + " - ");
            letraActual = letraActual + 1;
        }
    }
}

