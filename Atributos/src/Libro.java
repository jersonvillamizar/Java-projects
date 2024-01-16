public class Libro {
    public String Autor, Titulo, Editorial;
    public int Paginas, fecha;

    public Libro() {
        
    }

    public Libro(String Autor, String Titulo, String Editorial, int Paginas, int fecha) {
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.Editorial = Editorial;
        this.Paginas = Paginas;
        this.fecha = fecha;
    }

    public void Imprimir() {
        System.out.println("Autor: " + Autor);
        System.out.println("Titulo: " + Titulo);
        System.out.println("Editorial: " + Editorial);
        System.out.println("Paginas: " + Paginas);
        System.out.println("Fecha: " + fecha);
        System.out.println();
    }

}