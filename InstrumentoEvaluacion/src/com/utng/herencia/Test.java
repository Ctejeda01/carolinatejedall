package com.utng.herencia;

public class Test {
	public static void main(String[] args) {
		Camioneta camioneta = new Camioneta();
		Auto auto = new Auto();
		camioneta.cargar(10);
		camioneta.caracteristicas();
		
		auto.caracteristicas();
		auto.subir();
		auto.bajar();
		
		
	}
}
