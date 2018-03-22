package ar.edu.unlam.tallerweb1.modelo;

public class Vivienda {
	
	private String calle;
	private int numero;
	private String barrio;
	private Persona duenia;
	
	public Vivienda(String calle, int numero, String barrio, Persona duenia) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.barrio = barrio;
		this.duenia = duenia;
	}

	public Vivienda() {
		
	}
	
	public Persona getDuenia() {
		return duenia;
	}

	public void setDuenia(Persona duenia) {
		this.duenia = duenia;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	

}
