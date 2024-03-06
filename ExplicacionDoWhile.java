import java.util.Scanner;


public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("CICLO DO WHILE");
        System.out.println("\nPermite repetir una serie de instrucciones si se cumple una condicion.");
        System.out.println("Primero ejecuta y despues evalua");
        System.out.println("Existen 2 tipos de uso");
        System.out.println("1. Cuando conocemos cuantas veces se repetira algo");
        System.out.println("2. Desconocemos la cantidad de veces que se repetira, pero conocemos la coindición de paro");
        
        byte opcion;
        
        do
        {
            System.out.println("\n¿Que opcion quieres practicar?");
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Ninguna");
            System.out.print("Introduce una opcion: ");
            opcion = sc.nextByte();

            switch(opcion)
            {
                case 1:
                    System.out.println("Ejemplo caso 1");
                    System.out.println("Programa que repite n veces un texto");

                    System.out.print("Ingresa la cantidad de veces que quieres que se repita el texto: ");
                    int veces = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Ingresa el texto que quieres repetir: ");
                    String texto = sc.nextLine();


                    int contador = 1;

                    while(contador <= veces)
                    {
                        //Instruccion(es);
                        System.out.println(contador + ". " + texto);

                        //Modificar valor de la variable
                        contador = contador + 1;
                    }
                break;

                case 2:
                    System.out.println("Ejemplo caso 2");
                    System.out.println("Programa que genera un numero secreto y debera adivinar el usuario");

                    int secreto = (int) (Math.random() * 10);
                    contador = 1;

                    System.out.print("Ingresa un numero entre 0 y 10: ");
                    int n = sc.nextInt();

                    while(n != secreto) // != diferente de
                    {
                        //Instruccion(es);
                        if(n > secreto)
                        {
                            System.out.println("El numero secreto es mas chico");                
                        }

                        else
                        {
                            System.out.println("El numero secreto es mas grande");
                        }

                        contador++; //contador = contador + 1;

                        //Modificar valor de la variable
                        System.out.print("Ingresa un numero entre 0 y 10: ");
                        n = sc.nextInt();
                    }

                    System.out.println("Felicidades, encontraste el numero secreto en " + contador + " intentos");
                break;

                case 3:
                    System.out.println("Espero te funcione la explicación del ciclo Do while");
                    break;
                    
                default:
                    System.out.println("Ingresa una opcion valida");
            }
        }while(opcion != 3);
    }   
}