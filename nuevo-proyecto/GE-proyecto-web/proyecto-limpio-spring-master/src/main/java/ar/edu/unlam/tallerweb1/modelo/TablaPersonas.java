package ar.edu.unlam.tallerweb1.modelo;

import java.util.LinkedList;
import java.util.List;

public class TablaPersonas {

	private static TablaPersonas instancia = new TablaPersonas();
	private List<Persona> personas = new LinkedList<>();
	private int ultimoIdEntregado = 0;
	private List<String> nombres = new LinkedList<>();


	private TablaPersonas() {

	}

	public List<String> getNombres() {
		return nombres;
	}
	public static TablaPersonas getInstacia() {
		return instancia;
	}

	public List<Persona> obtenerTodas() {
		return personas;
	}

	public void agregar(Persona persona) {
		ultimoIdEntregado++;
		persona.setId(ultimoIdEntregado);
		nombres.add(persona.getNombre());
		personas.add(persona);
	}

	public void eliminarPersona(int id) {
		Persona persona = new Persona(id);
		personas.remove(persona);
		nombres.remove(persona.getNombre());
	}

	public Persona buscarPersona(int id) {
		Persona persona = new Persona(id);
		int direccion = personas.indexOf(persona);
		return personas.get(direccion);
	}

	public void actualizarPersona(Persona personaEditada) {

		int direccion = personas.indexOf(personaEditada);
		personas.set(direccion, personaEditada);
	}


}