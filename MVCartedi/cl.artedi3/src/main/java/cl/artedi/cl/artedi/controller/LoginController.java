package cl.artedi.cl.artedi.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.artedi.cl.artedi.interfaces.CRUD;
import cl.artedi.cl.artedi.model.Usuario;


//La anotación @Controller indica que esta clase es un controlador de Spring MVC.
@Controller
//Clase llamada LoginControler, que actúa como un controlador en una aplicación web basada en Spring MVC. 
public class LoginController {
	//Este método maneja las solicitudes HTTP GET a la ruta "/loginpage" y devuelve la vista "login" al usuario.
	@RequestMapping(value="/login", method= RequestMethod.GET)
	public ModelAndView test(HttpServletResponse response) throws IOException{
		System.out.println("Pasando por metodo GET");
		return new ModelAndView("login");
	}
	//@Autowired es una característica de Spring Framework que permite la inyección automática de dependencias.
	@Autowired
	private CRUD<Usuario> usuarioDao;
	
	/*Este metodo maneja las solicitudes POST a la ruta "/login", valida las credenciales del usuario y, si son correctas, almacena la información del usuario 
	en la sesión y redirige a la vista "inicio". Si las credenciales no son válidas, muestra un mensaje de error en la vista "inicio".*/
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView loginIn(HttpServletRequest request, HttpServletResponse response) throws IOException{
		System.out.println("Entrando por metodo POST");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			System.out.println("Entrando a TryCatchPost");
			Usuario user = usuarioDao.getUserPass(username, password);
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			System.out.println("Se ha conectado: "+user.getUsername());
			return new ModelAndView("inicio");// donde se redirige la pagina si el ingreso es exitoso.
		} catch (Exception e) {
			System.out.println("Saliendo de TryCatchPost");
			e.printStackTrace();
	        ModelAndView mav = new ModelAndView("login");// colocar nombre de la pagina a la que se redirige en caso de fallo
	        mav.addObject("message", "Nombre de usuario o password incorrecto");
	        return mav;
		}
		
	}
	/*este método maneja las solicitudes POST a la ruta "/logout", cierra la sesión del usuario eliminando la información del 
	usuario de la sesión y redirige al usuario a la vista "inicio".*/
	@RequestMapping(value="/logout", method = RequestMethod.POST)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) throws IOException{
	    HttpSession session = request.getSession();
	    System.out.println("Se ha Deslogueado: "+ session.getAttribute("username"));
	    session.removeAttribute("username");
	    session.removeAttribute("perfil");
	    System.out.println("perfil actual:"+ session.getAttribute("perfil"));
	    return new ModelAndView("inicio");
	}

	
}

