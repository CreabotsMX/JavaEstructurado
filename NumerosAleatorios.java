import java.util.Scanner;

public class NumerosAleatorios 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de alumnos: ");
        byte alumnos = sc.nextByte();

        System.out.print("Ingresa la cantidad de preguntas: ");
        byte preguntas = sc.nextByte();
        
        for(byte alumno = 1; alumno < alumnos + 1; alumno++)
        {
            System.out.print(alumno + ".\t");
            
            for(byte pregunta = 1; pregunta < preguntas+1; pregunta++)
            {
                System.out.print((int)(Math.random()*45+19) + "\t");
            }
            System.out.println("");
        }
    }
}
