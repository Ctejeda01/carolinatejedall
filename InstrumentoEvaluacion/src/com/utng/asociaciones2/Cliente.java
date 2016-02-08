package com.utng.asociaciones2;
import java.util.LinkedList;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Cliente {
  private int mesa;
  private int comensales;
  private LinkedList<Orden> lstOrden = new LinkedList<Orden>();
  
  /**
   * 
   * @param orden
   * Metodo para agregar una nueva orden del cliente
   */
  public void agregarOrden(Orden orden){
	  if(!lstOrden.contains(orden)){
		  lstOrden.add(orden);
	  }
  }
  
}
