package com.utng.asociaciones1;

import java.util.LinkedList;

/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Direccion {
private String calle;
private String numero;
private String departamento;
private int piso;
private String CP;
private String localidad;
private String provincia;
private String pais;
private LinkedList<Proveedor>   lstProvedor = new LinkedList<Proveedor>();

/**
 * 
 * @param proveedor
 * Metodo para asociar
 */
public void asociar(Proveedor proveedor){
	if(!lstProvedor.contains(proveedor)){
		lstProvedor.add(proveedor);
	}
	}

	
}
