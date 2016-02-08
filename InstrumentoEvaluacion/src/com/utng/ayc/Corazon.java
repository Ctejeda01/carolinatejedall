package com.utng.ayc;

public class Corazon {
	public int ritmo;

	public int leerRitmo() {
		return ritmo;
	}

	public void setRitmo(int ritmo) {
		this.ritmo = this.ritmo + ritmo;
	}
	
	public void cambiarRitmo (int valor){
		System.out.println("El ritmo es de "+valor);
	}

	
	
}
