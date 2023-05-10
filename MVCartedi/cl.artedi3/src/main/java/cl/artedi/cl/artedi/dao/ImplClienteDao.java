package cl.artedi.cl.artedi.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cl.artedi.cl.artedi.interfaces.CRUD;
import cl.artedi.cl.artedi.model.Cliente;
import cl.artedi.cl.artedi.model.Usuario;
import cl.artedi.cl.artedi.dao.rowmappers.*;


@Repository
public class ImplClienteDao implements CRUD<Cliente> {

	private JdbcTemplate jdbcTemp;

	// Constructor que recibe DataSource e inicializa JdbcTemplate
	public ImplClienteDao(DataSource ds) {
		this.jdbcTemp = new JdbcTemplate(ds);
	}

	// Definición de consultas SQL
	 /* Sentencias para los Usuarios de tipo cliente*/
	final String GETFORPASS 	= "SELECT * FROM usuario WHERE username = ? AND clave = ?;";
	final String GETALL 		= "SELECT u.idusuario, u.username, u.nombre, u.apellido, u.fechaNacimiento, u.clave, u.run, c.idcliente, c.telefono, c.email "
								+ "FROM usuario u "
								+ "INNER JOIN cliente c "
								+ "ON u.run = c.rutcliente";
	final String INSERT_USUARIO = "INSERT INTO usuario(username, nombre, apellido, fechanacimiento, clave, run) VALUES (?,?,?,?,?,?);";
	final String INSERT_CLIENTE = "INSERT INTO cliente(telefono, email, rutcliente) VALUES (?,?,?);";
	final String UPDATE_USUARIO = "UPDATE usuario SET username = ?, nombre = ?, apellido = ?, fechanacimiento = ?, clave = ? WHERE run = ?;";
	final String UPDATE_CLIENTE = "UPDATE cliente SET telefono = ?, email = ? WHERE rutcliente = ?";
	final String DELETE_CLIENTE = "DELETE usuario, cliente " 
								+ "FROM usuario " 
								+ "INNER JOIN cliente "
								+ "ON usuario.run = cliente.rutcliente " 
								+ "WHERE usuario.run = ? AND usuario.clave = ?;";
	// final String DELETE_USUARIO = "DELETE FROM usuario WHERE run = ?";

	// Método para obtener un usuario según su nombre de usuario y contraseña
	@Override
	public Usuario getUserPass(String username, String pass) {
		String sql = "SELECT * FROM usuario WHERE username = ? AND clave = ?;";
		Object[] keys = { username, pass };
		Usuario user = jdbcTemp.queryForObject(sql, keys, new UsuarioRowMapper());

		return user;
	}

		
	 /* Retorna una lista de Clientes*/
	
	@Override
	public List<Cliente> mostrarUsuarios() {
		List<Cliente> cliList = jdbcTemp.query(GETALL, new ClienteRowMapper());
		return cliList;
	}

	// Método que devuelve una lista de objetos Cliente
	@Override
	public void crearUsuario(Cliente cli) {
		Object[] usuarioParams = { cli.getUsername(), cli.getNombre(), cli.getApellido(), cli.getFechaNacimiento(),
				cli.getClave(), cli.getRun() };
		jdbcTemp.update(INSERT_USUARIO, usuarioParams);

		Object[] cliparams = { cli.getTelefono(), cli.getEmail(), cli.getRun() };
		jdbcTemp.update(INSERT_CLIENTE, cliparams);

	}

	// Método para crear un nuevo usuario de tipo Cliente en la base de datos
	@Override
	public void editarUsuario(Cliente cli) {
		Object[] usuarioParams = { cli.getUsername(), cli.getNombre(), cli.getApellido(), cli.getFechaNacimiento(),
				cli.getClave(), cli.getRun() };
		jdbcTemp.update(UPDATE_USUARIO, usuarioParams);

		Object[] cliparams = { cli.getTelefono(), cli.getEmail(), cli.getRun() };
		jdbcTemp.update(UPDATE_CLIENTE, cliparams);

	}

	// Método para actualizar la información de un usuario de tipo Cliente en la base de datos
	@Override
	public void eliminarUsuario(Cliente cli) {
		Object[] cliparams = {cli.getRun(), cli.getClave() };
		System.out.println(cli.getRun() + cli.getClave());
		jdbcTemp.update(DELETE_CLIENTE, cliparams);



	}

}
