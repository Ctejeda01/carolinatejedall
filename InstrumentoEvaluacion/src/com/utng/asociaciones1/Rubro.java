package com.utng.asociaciones1;

import java.util.LinkedList;

public class Rubro {
	private String rb_descripcion;
	private int rb_ID;
	
	 private LinkedList<Proveedor>   lstProvedor = new LinkedList<Proveedor>();
	    
	    public void agregarRubro(Proveedor provedor){
	    	if(!lstProvedor.contains(provedor)){
	    		lstProvedor.add(provedor);
	    	}
	    }
	
	
	


}
