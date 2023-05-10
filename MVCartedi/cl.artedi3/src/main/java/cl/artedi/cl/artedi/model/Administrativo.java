package cl.artedi.cl.artedi.model;

public class Administrativo extends Usuario{

    // Atributos de la clase Administrativo
    private int idAdmin;
    private String area;

    // Constructor vacío
    public Administrativo() {

    }

    // Constructor con parámetros
    public Administrativo(int idUsuario, String username, String nombre, String apellido, String fechaNacimiento, String clave, String run, int idAdmin, String area) {
        super(idUsuario,username,nombre,apellido,fechaNacimiento,clave,run);
        this.idAdmin = idAdmin;
        this.area = area;
    }

    // Getters y Setters
    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
