import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de alumnos: ");
        byte alumnos = sc.nextByte();

        System.out.print("Ingresa la cantidad de preguntas: ");
        byte preguntas = sc.nextByte();
        
        System.out.print("Ingresa el limite inferior para generar numeros aleatorios: ");
        int limiteInferior = sc.nextInt();
        
        System.out.print("Ingresa el limite superior para generar numeros aleatorios: ");
        int limiteSuperior = sc.nextInt();
        
        int diferencia = limiteSuperior - limiteInferior + 1;
        
        for(byte alumno = 1; alumno < alumnos + 1; alumno++)
        {
            System.out.print(alumno + ".\t");
            
            Set<Integer> preguntasGeneradas = new HashSet<>();
            
            for(byte pregunta = 1; pregunta < preguntas+1; pregunta++)
            {
                int preguntaAleatoria;
                do {
                    preguntaAleatoria = (int)(Math.random() * diferencia + limiteInferior);
                } while (preguntasGeneradas.contains(preguntaAleatoria));
                
                preguntasGeneradas.add(preguntaAleatoria);
                
                System.out.print(preguntaAleatoria + "\t");
            }
            System.out.println("");
        }
    }
}
