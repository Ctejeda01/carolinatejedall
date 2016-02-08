package carolina.giti7083.Proyecto;

import java.util.Date;
import java.util.List;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Presupuesto {
	private Date fecha;
	private String descripcion;
	private double importe;
	private String estado;
        
	
	/**
	 * Relacion 1 a * con DeptoComercial
	 */

	private List<DeptoComercial> valida;
	
	/**
	 * Relacion * a 1  con Cliente
	 */
	
	private Cliente cliente;
	
	/**
	 * Relacion 1 con Comercial
	 */
	
	private Comercial calcula;
	
	/**
	 * Relacion 1 a * con Viaje
	 */
	private List<Viaje> tiene;
	
	/**
	 * Relacion * con Proyecto
	 */
	private List<Proyecto> proyectos;
	
	
	
        /**
         * 
         * @return Date
         * Retorna el valor asignado a la fecha
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
         * @return String
         * Retorna el valor del campo descripción
         */
	public String getDescripcion() {
		return descripcion;
	}
        
        /**
         * 
         * @param descripcion 
         * Asigna el valor al campo descripcion
         */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
        
        /**
         * 
         * @return double
         * Reorna el valor del campo importe
         */
	public double getImporte() {
		return importe;
	}
        
        /**
         * 
         * @param importe 
         * Asigna el valor al campo importe
         */
	public void setImporte(double importe) {
		this.importe = importe;
	}
        
        /**
         * 
         * @return String
         * Retorna el valor asignado al campo estado
         */
	public String getEstado() {
		return estado;
	}
        
        /**
         * 
         * @param estado 
         * ASigna el valor al campo estado
         */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	

}
