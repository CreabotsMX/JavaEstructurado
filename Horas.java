import java.util.Scanner;

public class Horas 
{
    public static void main(String[] args) 
    {
        int aniosAcumulado, mesesAcumulado, semanasAcumulado, diasAcumulado, horasRestantes;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para convertir horas a su correspondiente en años, meses, semanas, días y horas");
        System.out.print("\nIngresa una camtidad de horas: ");
        int horas = entrada.nextInt();
        
        //Equivalenncia de horas de cada periodo de tiempo
        int anio = 8064;
        int mes = 672;
        int semana = 168;
        int dia = 24;
        
        aniosAcumulado = horas / anio;
        horasRestantes = horas % anio;
        
        mesesAcumulado = horasRestantes / mes;
        horasRestantes = horasRestantes % mes;
        
        semanasAcumulado = horasRestantes / semana;
        horasRestantes = horasRestantes % semana;
        
        diasAcumulado = horasRestantes / dia;
        horasRestantes = horasRestantes % dia;
        
        System.out.println("\nResultado: " + horas + " horas equivalen a: "
                + aniosAcumulado + " años con " + mesesAcumulado + " meses con " 
                + semanasAcumulado + " semanas con " + diasAcumulado + " días y con "
                + horasRestantes + " horas");   
    }
}
