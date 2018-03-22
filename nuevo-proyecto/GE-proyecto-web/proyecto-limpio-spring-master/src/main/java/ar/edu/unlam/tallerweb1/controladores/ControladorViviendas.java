package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unlam.tallerweb1.modelo.TablaPersonas;
import ar.edu.unlam.tallerweb1.modelo.TablaViviendas;
import ar.edu.unlam.tallerweb1.modelo.Vivienda;

@Controller
public class ControladorViviendas {
	
	@RequestMapping(path= "/agregar-vivienda", method = RequestMethod.GET)
		public ModelAndView empezarAgregadoDesVivienda() {
			
		Vivienda vivienda = new Vivienda();
		ModelMap map = new ModelMap();
		map.put("vivienda", vivienda);
		
		return new ModelAndView("formulario-vivienda", map);
		
		}
	@RequestMapping(path= "/agregar-vivienda", method = RequestMethod.POST)
		public ModelAndView agregarVivienda(@ModelAttribute Vivienda vivienda) {
		

		TablaViviendas.getInstancia().agregar(vivienda);
		
		ModelMap map = new ModelMap();
		map.put("tituloMensaje", "Enhorabuena!");
		map.put("detalleMensaje", "La vivienda ha sido agregada");		
		
		return new ModelAndView("mensaje", map);
		
	}
	
	@RequestMapping ("/listar-viviendas")
	public ModelAndView listarVivienda() {
		
		ModelMap map = new ModelMap();
		map.put("viviendas", TablaViviendas.getInstancia().obtenerLista());
		map.put("nombres", TablaPersonas.getInstacia().getNombres());
		
		return new ModelAndView("listado-viviendas", map);
		
	}
		
	
}
