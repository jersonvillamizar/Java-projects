import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Ingrese el valor de a: ");
        Scanner leer = new Scanner(System.in);
        int a = leer.nextInt();
        System.out.println("Ingrese el valor de b: ");
        int b = leer.nextInt();
        int suma = a + b;
        System.out.println("La suma es: " + suma);
        leer.close();

    }
}


