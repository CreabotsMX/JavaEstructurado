package ejerciciose2;

public class EjerciciosE2 
{

    public static void main(String[] args) 
    {
        for(byte alumno = 1; alumno <31; alumno++)
        {
            System.out.print(alumno + ".\t");
            
            for(byte preguntas = 1; preguntas <6; preguntas++)
            {
                System.out.print((int)(Math.random()*45+19) + "\t");
            }
            System.out.println("");
        }
    }
    
}
