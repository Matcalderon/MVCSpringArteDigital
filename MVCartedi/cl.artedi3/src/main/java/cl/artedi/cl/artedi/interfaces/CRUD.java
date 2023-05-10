package cl.artedi.cl.artedi.interfaces;

import java.util.List;
import cl.artedi.cl.artedi.model.*;

public interface CRUD<D> {

    /**
     * Método para obtener un usuario a partir de su nombre de usuario y contraseña.
     * @param username Nombre de usuario.
     * @param pass Contraseña del usuario.
     * @return Usuario correspondiente a las credenciales proporcionadas.
     */
    public Usuario getUserPass(String username, String pass);

    /**
     * Método para mostrar la lista de usuarios.
     * @return Lista de objetos D (usuarios).
     */
    public List<D> mostrarUsuarios();

    /**
     * Método para crear un nuevo usuario.
     * @param d Objeto D (usuario) a crear.
     */
    public void crearUsuario(D d);

    /**
     * Método para editar un usuario existente.
     * @param d Objeto D (usuario) con los datos actualizados.
     */
    public void editarUsuario(D d);

    /**
     * Método para eliminar un usuario.
     * @param d Objeto D (usuario) a eliminar.
     */
    public void eliminarUsuario(D d);
}
