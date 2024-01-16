public class Pelicula {

    private int id;
    private String titulo;
    private String genero;
    private double precio;
    private String director;
    private double descuento;
    public  static int nextId=0;

    public Pelicula(int id, String titulo, String genero, double precio, String director, double descuento) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
        this.director = director;
        this.descuento = descuento;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void aplicarDescuento(){
        if (this.descuento>0){
           this.precio-=(this.precio*this.descuento/100);
        }
    }

    public static int getNextId(){
        return ++nextId;
    }

    @Override
    public String toString() {
        return   " \nid=" + id +
                ", \ntitulo='" + titulo + '\'' +
                ", \ngenero='" + genero + '\'' +
                ", \nprecio=" + precio +
                ", \ndirector='" + director + '\'' +
                ", \ndescuento=" + descuento; 
                
    }


    
}
