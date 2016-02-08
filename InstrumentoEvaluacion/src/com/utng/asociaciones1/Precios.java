package com.utng.asociaciones1;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Precios {
  private double pre_id;
  private double art_ID;
  private double pr_ID;
  private float  pr_pesos;
  private int   pr_dolar;
  private float pr_cotizador;
  private Proveedor proveedor;
  
  
  public Precios() {
	// TODO Auto-generated constructor stub
}
  
public Precios(double pre_id, double art_ID, double pr_ID, float pr_pesos, int pr_dolar, float pr_cotizador,
		Proveedor proveedor) {
	super();
	this.pre_id = pre_id;
	this.art_ID = art_ID;
	this.pr_ID = proveedor.getPr_ID();
	this.pr_pesos = pr_pesos;
	this.pr_dolar = pr_dolar;
	this.pr_cotizador = pr_cotizador;
}
  
  
  
  
  
}
