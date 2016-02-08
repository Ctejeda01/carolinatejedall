package com.utng.ayc;

public class Coche  extends Aplicacion{
	
	public Coche(Motor motor) {
		
	}
	
	public void enciende() {
		System.out.println("Encendido");
	}
	
	public void apaga() {
		System.out.println("Apagando");
	}
	
	public void acelera() {
		System.out.println("Acelerando");
	}
	
	public void frena() {
		System.out.println("Frenando");
	}
	
	public boolean estaEncendido() {
		return false;
	}

}
