package com.test.refactoring.Business;
/**
 * Clase Camión que hereda de la clase Vehículo
 * @author Nadia Correa
 * @version 1.1
 */
public class Camion extends Vehiculo {
		private String tipoCarnet;

	public Camion() {
		super();
	}
	private String nombre_conductor;
	private String dniConductor;
	Persona persona = new Persona();

	/**
	 * Constructor con todos los parametros 
	 * @param matricula - Datos la de matricula del camión en formato cadena
	 * @param color - Color del vehículo 
	 * @param combustible - Tipo de compustible 
	 * @param tipoCarnet - Tipo de carnet 
	 * @param nombre_conductor -  Nombre de constructor
	 * @param dniConductor - DNI del constructor
	 */
	public Camion(String matricula, String color, String combustible, String tipoCarnet, String nombre_conductor,
			String dniConductor) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.combustible = combustible;
		this.tipoCarnet = tipoCarnet;
		this.nombre_conductor = persona.getNombre_conductor();
		this.dniConductor = persona.getDniConductor();
	}
/**
 * Método para obtener en tipo de carnet del conductor
 * @return - Devuelve el tipo del carnet
 */
	public String getTipoCarnet() {
		return tipoCarnet;
	}
/**
 * Método para asignar en tipo de carnet del conductor
 * @param tipoCarnet que se desea asignar
 */
	public void setTipoCarnet(String tipoCarnet) {
		this.tipoCarnet = tipoCarnet;
	}
/**
 * Método para acelar el camión 
 * @param velocidad  Velocidad a la que se producirá la acelación
 */
	public void Acelerar(int velocidad) {
		System.out.println("La aceleración del camión se realizará progresivamente para conservar sus neumáticos");

		// TO DO
		// Incluir l�gica de movimiento
	}
/**
 * Método para detener el camión
 */
	public void Detener() {
		System.out
				.println("CUIDADO!! La detención de un vehículo de gran tamaño puede ocasionar accidentes de tráfico");
	}
/**
 * Método que muestra todos los datos de la clase Camión en formato cadena
 */
	@Override
	public String toString() {
		return "Camion [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible + ", tipoCarnet="
				+ tipoCarnet + ", nombre_conductor=" + nombre_conductor + ", dniConductor=" + dniConductor + "]";
	}

}
