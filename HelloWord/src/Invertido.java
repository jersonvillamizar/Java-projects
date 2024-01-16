import java.util.Scanner;

public class Invertido {

    public static void main(String[] args) {
        //Programa para ingresar un numero y mostrarlo invertido
        Scanner leer = new Scanner(System.in);
        String numero = "";
        System.out.println("Ingrese un numero");
        numero = leer.nextLine();

        for (int i = numero.length() - 1; i >= 0; i--) {
            System.out.print(numero.charAt(i));
        }
        leer.close();
    }
}