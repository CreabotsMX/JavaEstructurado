import java.util.Scanner;

public class SeleccionMultiple
{
   public static void main(String [] args)
   {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("MENU");
       System.out.println("\n1. Suma");
       System.out.println("2. Resta");
       System.out.println("3. Multiplicación");
       System.out.println("4. División");
       
       System.out.print("\nIntroduce una opción: ");
       byte op = sc.nextByte();
       
       float n1, n2, r;
       
       switch(op)
       {
           
           case 1: System.out.println("Suma");
                   System.out.print("Introduce el primer numero: ");
                   n1 = sc.nextFloat(); 
                   System.out.print("Introduce el segundo numero: ");
                   n2 = sc.nextFloat();
                   r = n1 + n2;
                   System.out.print(n1 + " + " + n2 + " = " + r);
                   break;
           
           case 2: System.out.println("Resta");
                   System.out.print("Introduce el primer numero: ");
                   n1 = sc.nextFloat(); 
                   System.out.print("Introduce el segundo numero: ");
                   n2 = sc.nextFloat();
                   r = n1 - n2;
                   System.out.print(n1 + " - " + n2 + " = " + r);
                   break;
           
           case 3: System.out.println("Multiplicación");
                   System.out.print("Introduce el primer numero: ");
                   n1 = sc.nextFloat(); 
                   System.out.print("Introduce el segundo numero: ");
                   n2 = sc.nextFloat();
                   r = n1 * n2;
                   System.out.print(n1 + " * " + n2 + " = " + r);
                   break;
           
           case 4: System.out.println("División");
                   System.out.print("Introduce el primer numero: ");
                   n1 = sc.nextFloat(); 
                   System.out.print("Introduce el segundo numero: ");
                   n2 = sc.nextFloat();
                   r = Math.floorDiv((int)n1, (int)n2);
                   float res = n1 % n2; 
                   System.out.print(n1 + " / " + n2 + " = " + r + " con residuo " + res);
                   break;
           
           default: System.out.println("Opcion no valida");
       }
   }
}
