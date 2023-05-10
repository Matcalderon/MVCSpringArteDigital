package cl.artedi.cl.artedi.model;


// Clase Cliente que extiende de la clase Usuario
public class Cliente extends Usuario{

    // Atributos de la clase Cliente
    private int idCliente;
    private String telefono;
    private String email;

    // Constructor vacío
    public Cliente() {

    }

    // Constructor con parámetros
    public Cliente(int idUsuario, String username, String nombre, String apellido, String fechaNacimiento, String clave, String run, int idCliente, String telefono, String email) {
        super(idUsuario,username,nombre,apellido,fechaNacimiento,clave,run);
        this.idCliente = idCliente;
        this.telefono = telefono;
        this.email = email;
    }

    // Getters y Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
