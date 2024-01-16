import java.util.Scanner;

public class TiempoViaje {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tiempo = 0;
        int tiempoTotal = 0;
        
        do {
            System.out.println("Ingrese el tiempo del tramo: ");
            tiempo = leer.nextInt();
            if (tiempo != 0) {
                tiempoTotal += tiempo;
            }
        } while (tiempo != 0);
        
        System.out.println("El tiempo total del viaje es: " + tiempoTotal / 60 + ":" + tiempoTotal % 60);

        leer.close();
    }
}
