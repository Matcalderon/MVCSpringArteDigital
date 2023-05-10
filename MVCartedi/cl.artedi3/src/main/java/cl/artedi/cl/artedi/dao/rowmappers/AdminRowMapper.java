package cl.artedi.cl.artedi.dao.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cl.artedi.cl.artedi.model.Administrativo;


public class AdminRowMapper implements RowMapper<Administrativo>{

	@Override
	public Administrativo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Administrativo admin = new Administrativo();
        admin.setIdUsuario(rs.getInt("idusuario"));
        admin.setUsername(rs.getString("username"));
        admin.setNombre(rs.getString("nombre"));
        admin.setApellido(rs.getString("apellido"));
        admin.setFechaNacimiento(rs.getString("fechanacimiento"));
        admin.setClave(rs.getString("clave"));
        admin.setRun(rs.getString("run"));
        admin.setIdAdmin(rs.getInt("idadministrativo"));
        admin.setArea(rs.getString("area"));
        
		return admin;
	}

}
