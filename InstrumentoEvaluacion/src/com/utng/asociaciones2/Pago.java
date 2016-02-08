package com.utng.asociaciones2;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Pago {
  private double subTotal;
  private double propina;
  private double impuesto;
  
  
  public double calculoTotal(){
	  return subTotal + propina + impuesto;
  }
}
