import java.util.Scanner;

public class HoyNoCircula 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        int digito;
        String holograma;
        boolean digitoValido = true;
        
        System.out.println("Programa de \"Hoy no circula\"\n");
        System.out.print("Ingresa el holograma de tu vehículo: ");
        holograma = entrada.next();
        System.out.print("Ingresa el último dígito de su placa: ");
        digito = entrada.nextInt();
        
        if(holograma.equals("00") || holograma.equals("0"))
        {
            if(digito < 0 || digito > 9)
                System.out.println("Dígito no válido");
            else
                System.out.println("El vehículo circula diario!");
        }
        else if(holograma.equals("1") || holograma.equals("2"))
        {
            if(digito == 1 || digito == 2)
                System.out.print("No circula en jueves");
            else if(digito == 3 || digito == 4)
                System.out.print("No circula en miércoles");
            else if(digito == 5 || digito == 6)
                System.out.print("No circula en lunes");
            else if(digito == 7 || digito == 8)
                System.out.print("No circula en martes");
            else if(digito == 9 || digito == 0)
                System.out.print("No circula en viernes");
            else
            {
                System.out.println("Dígito no válido");
                digitoValido = false;
            }
            
            if(digitoValido == true)
            {
                if(holograma.equals("1"))
                {
                    if(digito == 1 || digito == 3 || digito == 5 || digito == 7 || digito == 9)
                        System.out.println(" y el primer y tercer sábado de cada mes");
                    else
                        System.out.println(" y el segundo y cuarto sábado de cada mes");
                }
                else
                {
                    System.out.println(" y todos los sábados");
                }
            }
        }
        else
        {
            System.out.println("Holograma no válido!");
        }
    }
}
