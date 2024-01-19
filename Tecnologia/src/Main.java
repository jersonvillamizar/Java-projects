import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Disminuir cantidad de producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Agregar categoría");
            System.out.println("5. Eliminar categoría");
            System.out.println("6. Mostrar inventario por categoría");
            System.out.println("7. Mostrar categorías");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Agregar producto
                    // Solicitar información al usuario y llamar a almacen.agregarProducto()
                    break;
                case 2:
                    // Disminuir cantidad de producto
                    // Solicitar referencia y cantidad al usuario y llamar a almacen.disminuirCantidad()
                    break;
                case 3:
                    // Eliminar producto
                    // Solicitar referencia al usuario y llamar a almacen.eliminarProducto()
                    break;
                case 4:
                    // Agregar categoría
                    // Solicitar código y nombre al usuario y llamar a almacen.agregarCategoria()
                    break;
                case 5:
                    // Eliminar categoría
                    // Solicitar código al usuario y llamar a almacen.eliminarCategoria()
                    break;
                case 6:
                    // Mostrar inventario por categoría
                    // Solicitar categoría al usuario y llamar a almacen.mostrarInventarioPorCategoria()
                    break;
                case 7:
                    // Mostrar categorías
                    almacen.mostrarCategorias();
                    break;
                case 8:
                    // Salir
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (opcion != 8);

        scanner.close();
    }
}

