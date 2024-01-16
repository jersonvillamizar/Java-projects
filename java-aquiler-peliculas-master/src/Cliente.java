public class Cliente {

    private String nombre;
    private String email;
    private String celular;

    public Cliente(String nombre, String email, String celular) {
        this.nombre = nombre;
        this.email = email;
        this.celular = celular;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }

    
    @Override
    public String toString() {
        return   " \nNombre=" + nombre +
                ", \nEmail='" + email + '\'' +
                ", \nCelular='" + celular;
                
    }

    
}
