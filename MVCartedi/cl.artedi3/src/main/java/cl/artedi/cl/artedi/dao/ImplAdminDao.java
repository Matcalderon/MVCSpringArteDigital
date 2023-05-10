package cl.artedi.cl.artedi.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cl.artedi.cl.artedi.interfaces.CRUD;
import cl.artedi.cl.artedi.model.Administrativo;
import cl.artedi.cl.artedi.model.Usuario;
import cl.artedi.cl.artedi.dao.rowmappers.*;

//La anotación @Repository indica que esta clase es un componente de Spring que interactúa con la base de datos

@Repository
public class ImplAdminDao implements CRUD<Administrativo>{

	// JdbcTemplate es una clase de Spring que simplifica las operaciones con bases de datos
	private JdbcTemplate jdbcTemp;
	
	// El constructor recibe un objeto DataSource (fuente de datos) y crea una nueva instancia de JdbcTemplate con dicho objeto
	public ImplAdminDao(DataSource ds) {
		this.jdbcTemp = new JdbcTemplate(ds);
	}
	
	/*Sentencias de SQL como sELECT * from, INNER JOIN, INSERT INTO, UBDATE, Y DELETE.S*/
	
	final String GETFORPASS 	= "SELECT * FROM usuario WHERE username = ? AND clave = ?;";
	final String GETALL 		= "SELECT u.idusuario, u.username, u.nombre, u.apellido, u.fechaNacimiento, u.clave, u.run, a.idadministrativo, a.area "
								+ "FROM usuario u "
								+ "INNER JOIN administrativo a "
								+ "ON u.run = a.rutadmin";
	final String INSERT_USUARIO = "INSERT INTO usuario(username, nombre, apellido, fechanacimiento, clave, run) VALUES (?,?,?,?,?,?);";
	final String INSERT_ADMIN 	= "INSERT INTO administrativo(area, rutadmin) VALUES (?,?);";
	final String UPDATE_USUARIO = "UPDATE usuario SET username = ?, nombre = ?, apellido = ?, fechanacimiento = ?, clave = ? WHERE run = ?;";
	final String UPDATE_ADMIN 	="UPDATE administrativo SET area = ? WHERE rutadmin = ?";
	final String DELETE_ADMIN 	= "DELETE usuario, administrativo "
								+ "FROM usuario "
								+ "INNER JOIN administrativo "
								+ "ON usuario.run = administrativo.rutadmin "
								+ "WHERE usuario.run = ? AND usuario.clave = ?";
//	final String DELETE_USUARIO = "DELETE FROM usuario WHERE run = ?";

	
	@Override
	public Usuario getUserPass(String username, String pass) {
		Object[] keys = {username, pass};
		Usuario user = jdbcTemp.queryForObject(GETFORPASS, keys, new UsuarioRowMapper());
		
		return user;
	}

	
	@Override
	public List<Administrativo> mostrarUsuarios() {
		List<Administrativo> adminList = jdbcTemp.query(GETALL, new AdminRowMapper());
		return adminList;
	}

	
	@Override
	public void crearUsuario(Administrativo admin) {
		Object[] usuarioParams = {admin.getUsername(), admin.getNombre(), admin.getApellido(), admin.getFechaNacimiento(), admin.getClave(), admin.getRun()};
	    jdbcTemp.update(INSERT_USUARIO, usuarioParams);
	    
	    Object[] adminParams = {admin.getArea(), admin.getRun()};
	    jdbcTemp.update(INSERT_ADMIN, adminParams);
		
	}

	
	@Override
	public void editarUsuario(Administrativo admin) {
		Object[] usuarioParams = {admin.getUsername(), admin.getNombre(), admin.getApellido(), admin.getFechaNacimiento(), admin.getClave(), admin.getRun()};
	    jdbcTemp.update(UPDATE_USUARIO, usuarioParams);
	    
	    Object[] adminParams = {admin.getArea(), admin.getRun()};
	    jdbcTemp.update(UPDATE_ADMIN, adminParams);
		
	}

	
	
	@Override
	public void eliminarUsuario(Administrativo admin) {
		Object[] adminParams = {admin.getRun(), admin.getClave()};
		System.out.println(admin.getRun() + admin.getClave());
		jdbcTemp.update(DELETE_ADMIN, adminParams);


	    
		
	}


}
