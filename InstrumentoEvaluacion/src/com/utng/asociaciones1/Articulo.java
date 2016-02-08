package com.utng.asociaciones1;

import java.util.LinkedList;

/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Articulo {
	private String art_ID;
	private String art_Descripcion;
	private int art_estado;
	private int art_tipo;
	private int art_cantidad;
	private double art_cantidadcritica;
	private double art_cantidadminima;
	private LinkedList<Rubro> lstRubro = new LinkedList<Rubro>();
	
	/**
	 * Constructor de la clase articulo
	 */
	public Articulo() {
		Precios precios = new Precios(); 
	}
	
	/**
	 * @param rubros
	 * Metodo para agregar rubros
	 */
	public void agregarRublos(Rubro rubro){
		if(!lstRubro.contains(rubro)){
			lstRubro.add(rubro);
		}
	}

}
