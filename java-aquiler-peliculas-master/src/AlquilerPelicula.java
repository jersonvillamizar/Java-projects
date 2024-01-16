import java.time.LocalDateTime;

public class AlquilerPelicula {

    private int id;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraEntrega;
    private Pelicula pelicula;
    private Cliente  cliente;
    public static int nextId=0;

    public AlquilerPelicula(int id, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraEntrega, Pelicula pelicula,
            Cliente cliente) {
        this.id = id;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraEntrega = fechaHoraEntrega;
        this.pelicula = pelicula;
        this.cliente = cliente;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }
    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }
    public LocalDateTime getFechaHoraEntrega() {
        return fechaHoraEntrega;
    }
    public void setFechaHoraEntrega(LocalDateTime fechaHoraEntrega) {
        this.fechaHoraEntrega = fechaHoraEntrega;
    }
    public Pelicula getPelicula() {
        return pelicula;
    }
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public static int getNextId(){
        return ++nextId;
    }
    @Override
    public String toString() {
        return  "\n-------Alquiler-----"+
                "\nid=" + id +
                ", \nfechaHoraInicio=" + fechaHoraInicio +
                ", \nfechaHoraEntrega=" + fechaHoraEntrega +
                ", \n-----Pelicula----" + pelicula.toString() +
                ", \n-----Cliente-----" + cliente.toString(); 
    }

    

    
}
