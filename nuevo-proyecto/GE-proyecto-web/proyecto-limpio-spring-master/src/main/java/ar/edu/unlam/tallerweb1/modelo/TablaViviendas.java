package ar.edu.unlam.tallerweb1.modelo;

import java.util.LinkedList;
import java.util.List;

public class TablaViviendas {
	
	private static TablaViviendas tablaViviendas = new TablaViviendas();
	private List<Vivienda>viviendas = new LinkedList<Vivienda>();
	
	private TablaViviendas() {
		
	}
	
	public static TablaViviendas getInstancia() {
		return tablaViviendas;
	}
	
	public List<Vivienda> obtenerLista(){
		return viviendas;		
	}
	
	public void agregar(Vivienda vivienda) {
		viviendas.add(vivienda);
	}
	
	
}
