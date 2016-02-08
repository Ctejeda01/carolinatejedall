package com.utng.asociaciones2;
import java.util.Date;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Credito extends Pago{

	private int numerodeTDC;
	private String tipo;
	private Date fechaExp;
	private String nombre;
	
	
	public boolean hacerCargo(double total){
		return true;
	}
	
}
