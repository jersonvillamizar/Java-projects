import java.util.Scanner;

public class Hexagono {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int lado = 0;
        System.out.print("Ingrese el lado Superior del Hexagono: ");
        lado = leer.nextInt();
        int maximo = 0;
        maximo = lado + ((lado-1)*2);
        int aux = (maximo - lado) / 2;
        int aux2 = aux;
        for (int i = 0; i <= aux2*2; i++) {
            for (int j = 0; j < maximo; j++) {
                if (j >= aux && j < maximo-aux) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            if (i < aux2) {
                aux--;
            } else {
                aux++;
                
            }
            System.out.println();
        }
        leer.close();
    }
}
