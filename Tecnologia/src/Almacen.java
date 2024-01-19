import java.util.HashMap;
import java.util.Map;

class Almacen {
    private Map<Integer, String> categorias;
    private Map<Integer, Producto> inventario;

    public Almacen() {
        categorias = new HashMap<>();
        inventario = new HashMap<>();

        inicializarCategorias();
    }

    private void inicializarCategorias() {
        categorias.put(1, "Computadores");
        categorias.put(2, "Celulares");
        categorias.put(3, "Electrodomésticos");
        categorias.put(4, "TV");
        categorias.put(5, "Accesorios");
        categorias.put(6, "Videojuegos");
        categorias.put(7, "Audio y video");
    }

    public void agregarProducto(Producto producto) {
        if (!inventario.containsKey(producto.getReferencia())) {
            inventario.put(producto.getReferencia(), producto);
            System.out.println("Producto agregado correctamente.");
        } else {
            System.out.println("Error: Ya existe un producto con la misma referencia.");
        }
    }

    public void disminuirCantidad(int referencia, int cantidad) {
        if (inventario.containsKey(referencia)) {
            int existencia = inventario.get(referencia).getCantidad();
            if (existencia >= cantidad) {
                inventario.get(referencia).setCantidad(existencia - cantidad);
                System.out.println("Existencia actualizada correctamente.");
            } else {
                System.out.println("Error: No hay suficiente existencia disponible.");
            }
        } else {
            System.out.println("Error: No existe un producto con la misma referencia.");
        }
    }

    public void eliminarProducto(int referencia) {
        if (inventario.containsKey(referencia)) {
            inventario.remove(referencia);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("Error: No existe un producto con la referencia proporcionada.");
        }
    }

    public void agregarCategoria(int codigo, String nombre) {
        if (!categorias.containsKey(codigo)) {
            categorias.put(codigo, nombre);
            System.out.println("Categoría agregada correctamente.");
        } else {
            System.out.println("Error: Ya existe una categoría con el mismo código.");
        }
    }

    public void eliminarCategoria(int codigo) {
        if (categorias.containsKey(codigo)) {
            categorias.remove(codigo);
            System.out.println("Categoría eliminada correctamente.");
        } else {
            System.out.println("Error: No existe una categoría con el código proporcionado.");
        }
    }

    public void mostrarInventarioPorCategoria(int categoria) {
        System.out.println("Inventario de la categoría " + categorias.get(categoria) + ":");
        for (Producto producto : inventario.values()) {
            if (producto.getCategoria() == categoria) {
                System.out.println(producto.getNombre() + " - " + producto.getPrecio() + " - " + producto.getCantidad());
            }
        }
    }

    public void mostrarCategorias() {
        System.out.println("Categorías disponibles:");
        for (Map.Entry<Integer, String> entry : categorias.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
