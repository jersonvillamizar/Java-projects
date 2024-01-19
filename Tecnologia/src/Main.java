import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println();
            System.out.println("Presione Enter para continuar...");
            scanner.nextLine();  // Lee la línea en blanco (Enter) para pausar
            scanner.nextLine();

            System.out.println("\nMenú:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Disminuir cantidad de producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Agregar categoría");
            System.out.println("5. Eliminar categoría");
            System.out.println("6. Mostrar inventario por categoría");
            System.out.println("7. Mostrar categorías");
            System.out.println("8. Salir");
            System.out.println();
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            System.out.println();
            switch (opcion) {
                case 1:
                    // Solicitar información al usuario
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombreProducto = scanner.next();

                    System.out.print("Ingrese el precio del producto: ");
                    double precioProducto = scanner.nextDouble();

                    System.out.print("Ingrese el número de referencia del producto: ");
                    int referenciaProducto = scanner.nextInt();

                    System.out.print("Ingrese la cantidad disponible del producto: ");
                    int cantidadProducto = scanner.nextInt();

                    System.out.println("Categorías disponibles:");
                    almacen.mostrarCategorias();
                    System.out.print("Seleccione la categoría del producto (ingrese el número): ");
                    int categoriaProducto = scanner.nextInt();

                    // Llamar a almacen.agregarProducto() con la información proporcionada
                    Producto nuevoProducto = new Producto(nombreProducto, precioProducto, referenciaProducto, cantidadProducto, categoriaProducto);
                    almacen.agregarProducto(nuevoProducto);
                    break;
                case 2:
                    // Disminuir cantidad de producto
                    // Solicitar referencia y cantidad al usuario y llamar a almacen.disminuirCantidad()
                    System.out.print("Ingrese la referencia del producto: ");
                    int referenciaDisminuir = scanner.nextInt();

                    // Solicitar cantidad al usuario
                    System.out.print("Ingrese la cantidad a disminuir: ");
                    int cantidadDisminuir = scanner.nextInt();

                    // Llamar a almacen.disminuirCantidad() con la información proporcionada
                    almacen.disminuirCantidad(referenciaDisminuir, cantidadDisminuir);
                    break;
                case 3:
                    // Eliminar producto
                    // Solicitar referencia al usuario y llamar a almacen.eliminarProducto()
                    System.out.print("Ingrese la referencia del producto a eliminar: ");
                    int referenciaEliminar = scanner.nextInt();

                    // Llamar a almacen.eliminarProducto() con la referencia proporcionada
                    almacen.eliminarProducto(referenciaEliminar);
                    break;
                case 4:
                    // Agregar categoría
                    // Solicitar código y nombre al usuario y llamar a almacen.agregarCategoria()
                    System.out.print("Ingrese el código de la nueva categoría: ");
                    int codigoCategoria = scanner.nextInt();

                    System.out.print("Ingrese el nombre de la nueva categoría: ");
                    String nombreCategoria = scanner.next();

                    // Llamar a almacen.agregarCategoria() con la información proporcionada
                    almacen.agregarCategoria(codigoCategoria, nombreCategoria);
                    break;
                case 5:
                    // Eliminar categoría
                    // Solicitar código al usuario y llamar a almacen.eliminarCategoria()
                    System.out.print("Ingrese el código de la categoría a eliminar: ");
                    int codigoEliminar = scanner.nextInt();

                    // Llamar a almacen.eliminarCategoria() con el código proporcionado
                    almacen.eliminarCategoria(codigoEliminar);
                    break;
                case 6:
                    // Mostrar inventario por categoría
                    // Solicitar categoría al usuario y llamar a almacen.mostrarInventarioPorCategoria()
                    almacen.mostrarCategorias();

                    // Solicitar categoría al usuario
                    System.out.print("Seleccione la categoría para mostrar el inventario (ingrese el número): ");
                    int categoriaMostrar = scanner.nextInt();

                    // Llamar a almacen.mostrarInventarioPorCategoria() con la categoría proporcionada
                    almacen.mostrarInventarioPorCategoria(categoriaMostrar);
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

