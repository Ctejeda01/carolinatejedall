package com.utng.asociaciones1;

import java.util.Date;
import java.util.LinkedList;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class ProvedorCalificado {
  private Date fechaCalificacion;
  private int cal_ID;
  private int pr_ID;
  private LinkedList<Calificacion> lstCalificados = new LinkedList<Calificacion>();
  
  
  /**
   * 
   * @param calificacion
   * Metodo para asociar
   */
  public void asociar(Calificacion calificacion){
	  if(! lstCalificados.contains(calificacion)){
		  lstCalificados.add(calificacion);
	  }
  }
}
