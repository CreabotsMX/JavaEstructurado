import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Programa que calcula P y A de diferentes figuras geometricas");
        
        float P, A;
        
        System.out.println("\n\tMENU");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo");
        System.out.println("4. Circulo");
        System.out.println("5. Salir");
        
        System.out.print("\nIntroduce una opcion:");
        byte opcion = sc.nextByte();
        
        switch(opcion)
        {
            case 1:
                
                float l;
                
                System.out.print("Introduce el lado del cuadrado: ");
                l = sc.nextFloat();
                
                P = 4 * l;
                A = l * l;
                
                System.out.println("P = " + P);
                System.out.println("A = " + A);
                
                break;
            
            case 2:
                
                float b, h;
                
                System.out.print("Introduce la base del rectangulo: ");
                b = sc.nextFloat();
                System.out.print("Introduce la altura del rectangulo: ");
                h = sc.nextFloat();
                
                P = (2*b) + (2*h);
                A = b * h;
                
                System.out.println("P = " + P);
                System.out.println("A = " + A);
                
                break;
                
            case 3:
                
                float c;
                
                System.out.print("Introduce la base del triangulo rectangulo: ");
                b = sc.nextFloat();
                System.out.print("Introduce la altura del triangulo rectangulo: ");
                h = sc.nextFloat();
                
                c = (float) (Math.sqrt(Math.pow(b,2) + Math.pow(h,2)));
                P = b + h + c;
                A = b * h / 2;
                
                System.out.println("Hipotenusa = " + c);
                System.out.println("P = " + P);
                System.out.println("A = " + A);
                
                break;
                
            case 4:
                
                float r;

                System.out.println("Introduce el radio del circulo: ");
                r = sc.nextFloat();
                
                P = (float) (Math.PI * (2*r));
                A = (float) (Math.PI * (r*r));
                
                System.out.println("Diametro = " + 2*r);
                System.out.println("P = " + P);
                System.out.println("A = " + A);
                
                break;
            
            case 5:
                System.out.println("Hasta luego");
                break;
                
                
            default:
                System.out.println("Ingresa una opcion valida");
                
        }
  
    }
    
}
