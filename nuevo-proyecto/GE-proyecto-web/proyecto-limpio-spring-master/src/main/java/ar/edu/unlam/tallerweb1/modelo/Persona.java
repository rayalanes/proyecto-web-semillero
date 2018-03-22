package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//APLICAMOS LA ANOTACION DE PERSISTENCIA - VISTO EN CLASE 2 DE PERSISTENCIA 14/03
@Entity
public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	private int dni;
	private int id;

	public Persona(String nombre, String apellido, int edad, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
	}
	
	
	public Persona() {
		
	}

	public Persona(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public int getDni() {
		return dni;
	}

	public int getId() {
		return id;
	}
	
//	APLICAMOS LO APRENDIDO EN LA CLASE 2 DE PERSISTENCIA
	@Id
	@GeneratedValue 
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object otroObjeto) {

		boolean iguales = (otroObjeto == this);

		if (!iguales && otroObjeto instanceof Persona) {

			Persona otraPersona = (Persona) otroObjeto;

			iguales = this.id == otraPersona.id;
		}

		return iguales;
	}

	@Override
	public int hashCode() {

		Integer id = this.id;

		return id.hashCode();
	}
}
