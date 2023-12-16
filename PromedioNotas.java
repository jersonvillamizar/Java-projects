import java.util.Scanner;

public class PromedioNotas {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int nota1, nota2, nota3, nota4;
        double promedio;
        System.out.println("Ingrese la nota 1: ");
        nota1 = leer.nextInt();
        System.out.println("Ingrese la nota 2: ");
        nota2 = leer.nextInt();
        System.out.println("Ingrese la nota 3: ");
        nota3 = leer.nextInt();
        System.out.println("Ingrese la nota 4: ");
        nota4 = leer.nextInt();
        promedio = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("El promedio es: " + promedio);
        leer.close();

    }
}
