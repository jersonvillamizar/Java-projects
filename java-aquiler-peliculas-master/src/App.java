import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class App {

    private static Scanner leer = new Scanner(System.in);
    private static List<Pelicula> peliculas = new ArrayList<>();
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<AlquilerPelicula> aquileres = new ArrayList<>();

    public static void main(String[] args) {

        loadData();
        int op = 0;

        do {

            op = menu();

            switch (op) {
                case 1:
                    System.out.println("Registrar pelicula: ");
                    peliculas.add(crearPelicula());
                    break;
                case 2:
                    System.out.println("Registrar cliente: ");
                    clientes.add(crearCliente());
                    break;
                case 3:
                    System.out.println("Alquiler pelicula: ");
                    alquilarPelicula();
                    break;
                case 4:
                    System.out.println("Modificar precio pelicula: ");
                    modificarPrecioPeliculas();
                    System.out.println("Termino de modificar precios ");
                    break;
                case 5:
                    System.out.println("Modificar precio pelicula: ");
                    break;
                case 6:
                    System.out.println("Listado de peliculas: ");
                    listarPeliculas();
                    System.out.print("\n");
                    break;
                case 7:
                    System.out.println("Listado de clientes: ");
                    listarClientes();
                    System.out.print("\n");
                    break;
                default:
                    System.out.println("Listado de alquileres: ");
                    listarAlquileres();
                    System.out.print("\n");
                    break;

            }

        } while (op >= 1 && op <= 8);

    }

    private static int menu() {

        int op = 0;

        try {
            System.out.println("_______MENU________");
            System.out.println("1. Registrar pelicula");
            System.out.println("2. Registrar cliente");
            System.out.println("3. Alquilar pelicula");
            System.out.println("4. Modificar precio pelicula");
            System.out.println("5. Eliminar pelicula");
            System.out.println("6. Listar peliculas");
            System.out.println("7. Listar clientes");
            System.out.println("8. Listar alquileres");
            System.out.println("9. Salir");
            System.out.println("Ingrese opción: ");
            op = leer.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Dato que ingreso no es un número valido");

        }
        return op;

    }

    private static Pelicula crearPelicula() {
        System.out.println("Ingrese los datos de la pelicula ");
        int id = Pelicula.getNextId();
        leer.nextLine();
        System.out.print("Titulo: ");
        String titulo = leer.nextLine();
        System.out.print("Genero: ");
        String genero = leer.nextLine();
        System.out.print("Precio: ");
        double precio = leer.nextDouble();
        leer.nextLine();
        System.out.print("Director: ");
        String director = leer.nextLine();
        System.out.print("Descuento: ");
        double descuento = leer.nextDouble();
        return new Pelicula(id, titulo, genero, precio, director, descuento);
    }

    private static void listarPeliculas() {

        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }

    }

    private static void modificarPrecioPeliculas() {

        for (Pelicula pelicula : peliculas) {
             pelicula.setPrecio(pelicula.getPrecio()+1000);
        }

    }

    private static Cliente crearCliente() {
        System.out.println("Ingrese los datos del cliente ");
        leer.nextLine();
        System.out.print("Nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Email: ");
        String email = leer.nextLine();
        System.out.print("Celular: ");
        String celular = leer.nextLine();
        return new Cliente(nombre, email, celular);
    }

    private static void listarClientes() {
        for (Cliente cliente : clientes)
            System.out.println(cliente.toString());
    }

    private static int buscarPeliculaPorTitulo(String titulo) {
        int index = -1;
        for (int i = 0; i < peliculas.size(); i++) {
            if (peliculas.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                index = i;
                break;
            }
        }
        return index;
    }

    private static Pelicula getPelicula(int index) {
        return peliculas.get(index);
    }

    private static int buscarClientePorEmail(String email) {
        int index = -1;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getEmail().equalsIgnoreCase(email)) {
                index = i;
                break;
            }
        }
        return index;
    }

    private static Cliente getCliente(int index) {
        return clientes.get(index);
    }

    private static void alquilarPelicula() {

        String tituloPelicula = "";
        int indexPelicula=0;
        Pelicula peliculaAquilar = null;
        String emailCliente = "";
        int indexCliente = 0;
        Cliente clienteAlquiler = null;
        leer.nextLine();
        do {

            System.out.print("Ingrese titulo de la pelicula:");
            tituloPelicula = leer.nextLine();
            indexPelicula = buscarPeliculaPorTitulo(tituloPelicula);
            if (indexPelicula != -1)
                peliculaAquilar = getPelicula(indexPelicula);

        } while (indexPelicula == -1);

        do {

            System.out.print("Ingrese email cliente:");
            emailCliente = leer.nextLine();
            indexCliente = buscarClientePorEmail(emailCliente);

            if (indexCliente != -1)
                clienteAlquiler = getCliente(indexCliente);

        } while (indexCliente == -1);

        System.out.println("Datos cliente y pelicula que se van alquilar!");
        System.out.println(peliculaAquilar.toString());
        System.out.print("\n");
        System.out.println(clienteAlquiler.toString());
        

        LocalDateTime fechaHoraInicio = LocalDateTime.now();
        LocalDateTime fechaHoraEntrega = fechaHoraInicio.plusDays(7);

        AlquilerPelicula alquilerPelicula = new AlquilerPelicula(AlquilerPelicula.getNextId(),
                fechaHoraInicio, fechaHoraEntrega, 
                new Pelicula(peliculaAquilar.getId(), peliculaAquilar.getTitulo(), peliculaAquilar.getGenero(),peliculaAquilar.getPrecio(),peliculaAquilar.getDirector(),peliculaAquilar.getDescuento())
                ,clienteAlquiler);
            
            

        aquileres.add(alquilerPelicula);

    }

    private static void listarAlquileres() {
        for (AlquilerPelicula aquiler : aquileres)
            System.out.println(aquiler.toString());
    }

    private static void loadData() {

        Pelicula pelicula1 = new Pelicula(Pelicula.getNextId(), "Rocky I", "Drama", 4500, "Slly", 0);
        Pelicula pelicula2 = new Pelicula(Pelicula.getNextId(), "Rocky II", "Drama", 4500, "Slly", 0);
        Pelicula pelicula3 = new Pelicula(Pelicula.getNextId(), "Rocky III", "Drama", 4500, "Slly", 0);
        Pelicula pelicula4 = new Pelicula(Pelicula.getNextId(), "Rocky IV", "Drama", 4500, "Slly", 0);
        peliculas.add(pelicula1);
        peliculas.add(pelicula2);
        peliculas.add(pelicula3);
        peliculas.add(pelicula4);

        Cliente cliente1 = new Cliente("Camilo", "crodrigr@gmail.com", "31548789852");
        Cliente cliente2 = new Cliente("Juan", "juan@gmail.com", "31548789852");
        Cliente cliente3 = new Cliente("Pedro", "pedro@gmail.com", "31548789852");
        Cliente cliente4 = new Cliente("Maria", "maria@gmail.com", "31548789852");

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);

    }
}
