package com.test.refactoring.Business;

public class Vehiculo {

	protected String matricula;
	protected String color;
	protected String combustible;

	public Vehiculo() {
		super();
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	/**
	 * Método para acelar el vehículo 
	 * @param velocidad  Velocidad a la que se producirá la acelación
	 */
	public void Acelerar(Integer velocidad) {
		if (velocidad > 0 && velocidad < 120) {
			System.out.println("El coche está acelerando y llegará la velocidad de " + velocidad.intValue() + " km/h");
		} else {
			System.out.println("La velocidad indicada no está permitida en un coche según la DGT");
		}
	}

	public void Detener() {
		System.out.println("El coche se detendrá en breve, asegúrese de buscar un lugar adecuado para estacionar");
	}

	
}