package cl.artedi.cl.artedi.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


//controlador "ContactoController" que procesa la solicitud "/contacto" y devuelve la vista "galeria.jsp".
@Controller
public class GaleriaController {
	
//"@RequestMapping" permite mapear las solicitudes HTTP a métodos de controlador Java específicos y controlar cómo se manejan esas solicitudes.
 @RequestMapping("/galeria")
 
//devuelve un objeto de la clase ModelAndView que tiene la vista "galeria.jsp".
 public ModelAndView mostrarFormularioContacto() {
     ModelAndView modelAndView = new ModelAndView("galeria");
     return modelAndView;
 }
 
}



//@Controller
//public class GaleriaController {
//
//    @RequestMapping("/galeria")
//    public String mostrarGaleria(Model model) {
//        List<Imagen> imagenes = obtenerImagenes();
//        model.addAttribute("imagenes", imagenes);
//        return "galeria";
//    }
//
//    private List<Imagen> obtenerImagenes() {
//        // Aquí iría la lógica para obtener las imágenes de la base de datos o de otro lugar
//        List<Imagen> imagenes = new ArrayList<Imagen>();
//        imagenes.add(new Imagen("imagen1.jpg", "Imagen 1"));
//        imagenes.add(new Imagen("imagen2.jpg", "Imagen 2"));
//        imagenes.add(new Imagen("imagen3.jpg", "Imagen 3"));
//        return imagenes;
//    }
//
//}