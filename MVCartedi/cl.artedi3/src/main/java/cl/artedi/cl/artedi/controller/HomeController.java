package cl.artedi.cl.artedi.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// Controlador de Spring MVC. 
//"@Controller" indica que es un controlador de Spring MVC que maneja las solicitudes HTTP de la aplicación.
@Controller  
public class HomeController {
	
//"@RequestMapping" permite mapear las solicitudes HTTP a métodos de controlador Java específicos y controlar cómo se manejan esas solicitudes.
	@RequestMapping(value="/") 
	
	
	//devuelve un objeto de la clase ModelAndView que tiene la vista "inicio.jsp".
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("inicio"); //
	}
}
