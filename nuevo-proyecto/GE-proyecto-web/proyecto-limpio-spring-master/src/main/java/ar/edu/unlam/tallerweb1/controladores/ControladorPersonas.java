package ar.edu.unlam.tallerweb1.controladores;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Persona;
import ar.edu.unlam.tallerweb1.modelo.TablaPersonas;

@Controller
public class ControladorPersonas {

	@RequestMapping("/listar-personas")
	public ModelAndView listarPersonas() {
		ModelMap map = new ModelMap();

		map.put("personas", TablaPersonas.getInstacia().obtenerTodas());

		return new ModelAndView("listado-personas", map);
	}

	@RequestMapping("/agregar-personas/{numero}")
	public ModelAndView agregarPersonas(@PathVariable int numero) {

		
		for (int i = 0; i < numero; i++) {

			TablaPersonas.getInstacia().agregar(new Persona("Ray", "Alanes", 22, 12123123));
		}
		
		ModelMap map = new ModelMap();
		
		if (numero > 0) {
			map.put("tituloMensaje", "EN HORA BUENA!");
			map.put("detalleMensaje", "Se agregaron " + numero + " personas correctamente");
		} else {
			map.put("tituloMensaje", "ERROR");
			map.put("detalleMensaje", "El valor ingresado es incorrecto");
		}

		return new ModelAndView("mensaje", map);
	}
	
	
	@RequestMapping("/eliminar-persona/{id}")
	public ModelAndView eliminarPersona(@PathVariable int id) {
		ModelMap map = new ModelMap();
		
		TablaPersonas.getInstacia().eliminarPersona(id);
		map.put("tituloMensaje", "Enhorabuena!");
		map.put("detalleMensaje", "La persona ha sido eliminada");
		
		return new ModelAndView("mensaje", map);
		
	}
	
	@RequestMapping(path = "/agregar-persona", method = RequestMethod.GET)
	public ModelAndView empezarAgregadoDePersona() {

		Persona persona = new Persona();
		
		ModelMap map = new ModelMap("personaEditada", persona);
		map.put("nuevaPersona", true);

		return new ModelAndView ("formulario", map);
	}
	
	@RequestMapping(path = "/agregar-persona", method = RequestMethod.POST)
	public ModelAndView agregarPersona(@ModelAttribute Persona persona) {

		TablaPersonas.getInstacia().agregar(persona);
		
		ModelMap map = new ModelMap();
		map.put("tituloMensaje", "Enhorabuena!");
		map.put("detalleMensaje", "La persona ha sido agregada");		
		
		return new ModelAndView("mensaje", map);

	}
	
	@RequestMapping(path = "/editar-persona/{id}", method = RequestMethod.GET)
	public ModelAndView empezarEditadoDePersona(@PathVariable int id) {
		
		Persona persona = TablaPersonas.getInstacia().buscarPersona(id);

		ModelMap map = new ModelMap();
		map.put("personaEditada", persona);
		map.put("nuevaPersona", false);
		
		return new ModelAndView("formulario", map);
	}
	
	@RequestMapping(path = "/editar-persona", method = RequestMethod.POST)
	public ModelAndView editarPersona(@ModelAttribute Persona personaEditada) {
		
		TablaPersonas.getInstacia().actualizarPersona(personaEditada);
		
		ModelMap map = new ModelMap();
		map.put("tituloMensaje", "Enhorabuena");
		map.put("detalleMensaje", "La persona ha sido modificada");
		
		return new ModelAndView("mensaje", map);
	}
	
}