package carolina.giti7083.Proyecto;

import java.util.Date;
import java.util.List;

/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Gasto {
	private String lugar;
	private Date fecha;
	private String tipo;
	private String justificante;
	private double precio;
	private List<Viaje>pertenece;
	
	/**
	 * Relacion * a viaje
	 */
	private List<Viaje> Pertenece;

	
	
	
	/**
         * 
         * @param lugar
         * @param fecha
         * @param tipo
         * @param justificante
         * @param precio
         * @param pertenece 
         * Constructor con parametros
         */
	public Gasto(String lugar, Date fecha, String tipo, String justificante, double precio, List<Viaje> pertenece) {
		super();
		this.lugar = lugar;
		this.fecha = fecha;
		this.tipo = tipo;
		this.justificante = justificante;
		this.precio = precio;
		this.pertenece = pertenece;
	}
        
        /**
         * 
         * @return String
         * retorna el valor asignado al lugar
         */
	public String getLugar() {
		return lugar;
	}
        
        /**
         * 
         * @param lugar 
         * Asigna el valor al lugar
         */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
        
        /**
         * @return Date
         * Retorna el valor al campo fecha
         */
	public Date getFecha() {
		return fecha;
	}
        
        /**
         * 
         * @param fecha 
         * Asigna el valor al campo fecha
         */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
        
        /**
         * 
         * @return  String
         * Retorna el valor asignado al Tipo
         */
	public String getTipo() {
		return tipo;
	}
        
        /**
         * 
         * @param tipo 
         * Asigna el valor al campo tipo
         */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
        
        /**
         * 
         * @return String
         * Retorna el valor asignado al justificante
         */
	public String getJustificante() {
		return justificante;
	}
        
        /**
         * 
         * @param justificante 
         * Asigna el valor al campo justificante
         */
	public void setJustificante(String justificante) {
		this.justificante = justificante;
	}
        
        /**
         * 
         * @return double
         * Retorna el valor asignado al precio
         */
	public double getPrecio() {
		return precio;
	}
        
        /**
         * 
         * @param precio 
         * Asigna el valor al campo precio
         */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	

}
