package cl.artedi.cl.artedi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// controlador "ContactoController" que procesa la solicitud "/contacto" y devuelve la vista "contacto.jsp".
@Controller
public class ContactoController {
	
   //"@RequestMapping" permite mapear las solicitudes HTTP a métodos de controlador Java específicos y controlar cómo se manejan esas solicitudes.
    @RequestMapping("/contacto")
    
  //devuelve un objeto de la clase ModelAndView que tiene la vista "contacto.jsp".
    public ModelAndView mostrarFormularioContacto() {
        ModelAndView modelAndView = new ModelAndView("contacto");
        return modelAndView;
    }
    
}