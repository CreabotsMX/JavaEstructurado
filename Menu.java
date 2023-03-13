import java.util.Scanner;

public class Menu
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do
        {
            System.out.println("\nMenú:");
            System.out.println("1.- Opción 1\n2.- Opción 2\n3.- Opción 3\n4.- Salir");
            System.out.print("Selecciona la opción deseada: ");
            opcion = entrada.nextInt();
           
            switch(opcion)
            {
                case 1:
                {
                    System.out.println("Seleccionaste la opción 1");
                    break;
                }
                case 2:
                {
                    System.out.println("Seleccionaste la opción 2");
                    break;
                }
                case 3:
                {
                    System.out.println("Seleccionaste la opción 3");
                    break;
                }
                case 4:
                {
                    System.out.println("¡Hasta luego!");
                    break;
                }
                default:
                {
                    System.out.println("No existe opción para ese valor");
                }
            }
        }while(opcion != 4);
    }
}

