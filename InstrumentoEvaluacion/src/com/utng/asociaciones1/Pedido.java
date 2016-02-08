package com.utng.asociaciones1;

import java.util.Date;
import java.util.LinkedList;

/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Pedido {
 private double pe_id;
 private Date pe_fechapedido;
 private Date pe_fechanecesidad;
 private Date pr_fechaprogramada;
 private Date pe_fechaentraga;
 private int  pe_estado;
 private LinkedList<Articulo> lstArticulos = new LinkedList<Articulo>();
	
 /**
  * @param articulo
  * Metodo para agregar articulos al pedido
  */
 public void agregarArticulos(Articulo articulo){
	 if(!lstArticulos.contains(articulo)){
		 lstArticulos.add(articulo);
	 }
 }
	
}
