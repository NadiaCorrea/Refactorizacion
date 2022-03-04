package com.test.refactoring.Business;
/**
 * Clase Motocicleta que hereda de la clase Vehículo
 * @author Nadia Correa
 * @version 1.1
 */
public class Motocicleta extends Vehiculo{
	public Motocicleta() {
		super();
	}
	
	private Integer cilindrada;
	private String nombre_conductor;
	private String dniConductor;
	Persona persona = new Persona();
/**
 * 
 * Constructor con todos los parametros 
 *  @param matricula - Datos la de matricula del vehículo en formato cadena
 * @param color - Color del vehículo 
 * @param combustible - Tipo de compustible 
 * @param cilindrada - Tamaña de la cilindrada
 * @param nombre_conductor -  Nombre de constructor
 * @param dniConductor - DNI del constructor
 */
	public Motocicleta(String matricula, String color, String combustible, Integer cilindrada, String nombre_conductor,
			String dniConductor) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.combustible = combustible;
		this.cilindrada = cilindrada;
		this.nombre_conductor = persona.getNombre_conductor();
		this.dniConductor = persona.getDniConductor();
	}

	public Integer getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getNombre_conductor() {
		return nombre_conductor;
	}

	public void setNombre_conductor(String nombre_conductor) {
		this.nombre_conductor = nombre_conductor;
	}

	public String getDniConductor() {
		return dniConductor;
	}

	public void setDniConductor(String dniConductor) {
		this.dniConductor = dniConductor;
	}
	
	public void Acelerar(Integer velocidad) {
		//TO DO
	}
	
	public void Detener() {
		//TO DO
	}

	@Override
	public String toString() {
		return "motocicleta [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible
				+ ", cilindrada=" + cilindrada + ", nombre_conductor=" + nombre_conductor + ", dniConductor="
				+ dniConductor + "]";
	}	

}
