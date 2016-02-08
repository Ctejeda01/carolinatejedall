package com.utng.asociaciones2;
import java.util.LinkedList;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Orden {
 private int hora;
 private String mesero;
 private LinkedList<Bebida> lstBebida = new LinkedList<Bebida>();
 private LinkedList<Platillo> lstPlatillo = new LinkedList<Platillo>();
 
 /**
  * 
  * @param platillo
  * Metodo para agregar un platillo a la orden
  */
 public void addPlatillo(Platillo platillo){
	 if(!lstPlatillo.contains(platillo)){
		 lstPlatillo.add(platillo);
		 
	 }
 }
 /**
  * 
  * @param bebida
  * Metodo para agregar una bebida a la orden
  */
 public void addBebida(Bebida bebida){
	 if(! lstBebida.contains(bebida)){
		 lstBebida.add(bebida);
	 }
 }
 
}
