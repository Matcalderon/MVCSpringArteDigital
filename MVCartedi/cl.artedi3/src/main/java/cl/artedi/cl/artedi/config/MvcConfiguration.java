package cl.artedi.cl.artedi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import cl.artedi.cl.artedi.dao.ImplClienteDao;
import cl.artedi.cl.artedi.dao.ImplAdminDao;
import cl.artedi.cl.artedi.dao.ImplUsuarioDao;
import cl.artedi.cl.artedi.interfaces.CRUD;
import cl.artedi.cl.artedi.model.Administrativo;
import cl.artedi.cl.artedi.model.Cliente;
import cl.artedi.cl.artedi.model.Usuario;

// Clase de configuración de Spring MVC
@Configuration
@ComponentScan(basePackages = "cl.artedi.cl.artedi")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{

	// Configuración del ViewResolver para resolver las vistas
	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	// Configuración del manejo de recursos estáticos
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	// Configuración de la fuente de datos
	@Bean
	public DriverManagerDataSource getDataSource() {

		DriverManagerDataSource bds = new DriverManagerDataSource();
		bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/artedi");
		bds.setUsername("root");
		bds.setPassword("12345");

		return bds;
	}
	
	// Configuración del DAO para Administrativos
	@Bean 
	public CRUD<Administrativo> getAdminDao(){
		return new ImplAdminDao(getDataSource());
	}
	
	// Configuración del DAO para Clientes
	@Bean
	public CRUD<Cliente> getClienteDao(){
		return new ImplClienteDao(getDataSource());
	}
	
	// Configuración del DAO para Usuarios
	@Bean
	public CRUD<Usuario> getUsuarioDao(){
		return new ImplUsuarioDao(getDataSource());
	}

}
