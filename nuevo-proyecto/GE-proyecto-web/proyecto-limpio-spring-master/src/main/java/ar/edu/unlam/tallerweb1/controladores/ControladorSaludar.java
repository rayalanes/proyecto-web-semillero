package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorSaludar {
		
	@RequestMapping ("/saludar")
	public ModelAndView saludar(@RequestParam("valor") String nombre) {
		ModelMap map = new ModelMap();
		map.put("nombreDelSaludo", nombre);
		return new ModelAndView("saludo", map);
	}

	@RequestMapping ("/saludar/{nombre}")
	public ModelAndView saluda(@PathVariable String nombre) {
		ModelMap map = new ModelMap();
		map.put("nombreDelSaludo", nombre);
		return new ModelAndView("saludo", map);
	}
	
	@RequestMapping ("/saludar/seba")
	public ModelAndView salud() {
		ModelMap map = new ModelMap();
		return new ModelAndView("saludo", map);
	}
	
}