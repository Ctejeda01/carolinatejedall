package carolina.giti7083.Proyecto;

import java.util.Date;
import java.util.List;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Proyecto {
	private String nombre;
	private String planificacion;
	private Date fechaInicio;
	private Date fechaFin;
	private String descripcion;
	private String estado;
	
	/**
	 * Relacion * Presupuesto
	 */
	private List<Presupuesto> presupuestos;
	
	/**
	 * Relacion * a 1 con Maquina
	 */
	private Maquina maquinas;

	
        /**
         * 
         * @return String
         * Retorna el valor asignado al campo  nombre
         */
        public String getNombre() {
		return nombre;
	}
        /**
         * 
         * @param nombre 
         * Asigna el valor al campo nombre
         */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
        
        /**
         * 
         * @return String
         * Retorna el valor a la planificacion
         */
	public String getPlanificacion() {
		return planificacion;
	}
        
        /**
         * 
         * @param planificacion 
         * Asigan el valor al campo planificacion
         */
	public void setPlanificacion(String planificacion) {
		this.planificacion = planificacion;
	}
        
        /**
         * 
         * @return Date
         * Retorna el valor Asignaado a la fecha inicio
         */
	public Date getFechaInicio() {
		return fechaInicio;
	}
        
        /**
         * 
         * @param fechaInicio 
         * Asigna el valor a la fecha inicio
         */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
        
        /**
         * 
         * @return Date
         * Retorna el valor asignado a la fecha fin
         */
	public Date getFechaFin() {
		return fechaFin;
	}
        
        
        /***
         * 
         * @param fechaFin 
         * Asigna el valor a la fecha fin
         */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
        
        /**
         * 
         * @return String
         * Retorna el valor asignado a la descripcion
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
         * @return String
         * Retorna el valor asignado campo estado
         */
	public String getEstado() {
		return estado;
	}
        
        
        /**
         * 
         * @param estado 
         * Asigna el valor al campo estado
         */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	
	
}
