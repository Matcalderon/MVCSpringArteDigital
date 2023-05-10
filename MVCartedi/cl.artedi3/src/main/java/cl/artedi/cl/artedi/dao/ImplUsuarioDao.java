package cl.artedi.cl.artedi.dao;

import java.util.List;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import cl.artedi.cl.artedi.interfaces.CRUD;
import cl.artedi.cl.artedi.model.Usuario;
import cl.artedi.cl.artedi.dao.rowmappers.*;


//clase llamada ImplUsuarioDao que implementa la interfaz CRUD<Usuario> 
public class ImplUsuarioDao implements CRUD<Usuario>{


	
	// Instancia de JdbcTemplate
	private JdbcTemplate jdbcTemp;
	
	
	// Constructor que recibe un DataSource e inicializa el JdbcTemplate
	public ImplUsuarioDao(DataSource ds) {
		this.jdbcTemp = new JdbcTemplate(ds);
	}

	// Consultas de el SQL 
	final String GETFORPASS = "SELECT * FROM usuario WHERE username = ? AND clave = ?;";
	final String GETADMINS = "SELECT u.idusuario, u.username, u.nombre, u.apellido, u.fechanacimiento, u.clave, u.run, a.idadministrativo, a.area "
			+ "FROM usuario u "
			+ "INNER JOIN administrativo a "
			+ "ON u.run = a.rutadmin;";
	final String GETCLIENTS = "SELECT u.idusuario, u.username, u.nombre, u.apellido, u.fechanacimiento, u.clave, u.run, c.idcliente, c.telefono, c.email "
			+ "FROM usuario u "
			+ "INNER JOIN cliente c "
			+ "ON u.run = c.rutcliente;";
	final String INSERT_USUARIO = "INSERT INTO usuario VALUES (?,?,?,?,?,?);";
	final String UPDATE = "UPDATE usuario SET username = ?, nombre = ?, apellido = ?, fechanacimiento = ?, clave = ? WHERE run = ?;";
	final String DELETEBYRUN = "DELETE FROM usuario WHERE run = ?;";
	
	
	
	  // Método que obtiene un usuario a partir de su nombre de usuario y contraseña
    @Override
    public Usuario getUserPass(String username, String pass) {
        String sql = "SELECT * FROM usuario WHERE username = ? AND clave = ?;";
        Object[] keys = {username, pass};
        Usuario user = jdbcTemp.queryForObject(sql, keys, new UsuarioRowMapper());
        return user;
    }

    // Método que devuelve una lista de todos los usuarios (administrativos y clientes)
    @Override
    public List<Usuario> mostrarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.addAll(jdbcTemp.query(GETADMINS, new AdminRowMapper()));
        usuarios.addAll(jdbcTemp.query(GETCLIENTS, new ClienteRowMapper()));
        System.out.println(String.valueOf(usuarios));
        return usuarios;
    }

    // Método para crear un usuario
    @Override
    public void crearUsuario(Usuario d) {
        // TODO Auto-generated method stub
    }

    // Método para editar un usuario
    @Override
    public void editarUsuario(Usuario d) {
        // TODO Auto-generated method stub
    }

    // Método para eliminar un usuario
    @Override
    public void eliminarUsuario(Usuario d) {
        // TODO Auto-generated method stub
    }
}
