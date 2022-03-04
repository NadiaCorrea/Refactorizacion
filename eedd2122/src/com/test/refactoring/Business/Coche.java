package com.test.refactoring.Business;
/**
 * Clase Coche que hereda de la clase Vehículo
 * @author Nadia Correa
 * @version 1.1
 */
public class Coche extends Vehiculo {
	public Coche() {
		super();
	}
	Integer numPlazas;
	String nombre_conductor;
	String dniConductor;
	Persona persona = new Persona();
	/**
	 * Constructor con todos los parametros 
	 *  @param matricula - Datos la de matricula del coche en formato cadena
	 * @param color - Color del vehículo 
	 * @param combustible - Tipo de compustible 
	 * @param numPlazas - Número de plazas de las que dispone el coche
	 * @param nombre_conductor -  Nombre de constructor
	 * @param dniConductor - DNI del constructor
	 */
	public Coche(String matricula, String color, String combustrible, Integer numPlazas, String nombre_conductor, String dniConductor) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.combustible = combustrible;
		this.numPlazas =  numPlazas;
		this.nombre_conductor = persona.getNombre_conductor();
		this.dniConductor = persona.getDniConductor();
	}
	/**
	 * Método para obtener el número de plazas 
	 * @return Devuelve el número de plazas
	 */
	public Integer getNumPlazas() {
		return numPlazas;
	}
/**
 * Método para asignar el número de plazas 
 * @param numPlazas Número de plazas que se desa asignar
 */
	public void setNumPlazas(Integer numPlazas) {
		this.numPlazas = numPlazas;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible + ", numPlazas="
				+ numPlazas + ", nombre_conductor=" + nombre_conductor + ", dniConductor=" + dniConductor + "]";
	}

}
