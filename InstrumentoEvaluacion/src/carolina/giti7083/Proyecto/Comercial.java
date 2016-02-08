package carolina.giti7083.Proyecto;

import java.util.List;

/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */

public class Comercial {
	private String estado;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String domicilio;
	private String rfc;
        
	
	/**
	 * Relacion N con DeptoComercial
	 */
	private List<DeptoComercial>deptocomerciales;
	
	/**
	 * Relacion 1 con viaje
	 */
	private Viaje realiza;
	
	
        /**
         * 
         * @return String
         * Retorna el valor del estado
         */
	public String getEstado() {
		return estado;
	}
        
        /**
         * 
         * @param estado 
         * Asigna el Valor de la variable Estado de tipo String
         */
	public void setEstado(String estado) {
		this.estado = estado;
	}
        
        /**
         * 
         * @return String
         * Retorna el valor del nombre
         */
	public String getNombre() {
		return nombre;
	}
        
        /**
         * 
         * @param nombre 
         * Asigna el valor al nombre de tipo String
         */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
        
        /**
         * 
         * @return String
         * Retorna el valor del apellido
         */
	public String getApellidos() {
		return apellidos;
	}
        
        /**
         * 
         * @param apellidos 
         * Asigna el valor del apellido
         */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
        
        /**
         * 
         * @return String
         * Retorna el valor del telefono
         */
	public String getTelefono() {
		return telefono;
	}
        
        /**
         * 
         * @param telefono 
         * Asigna el valor al telefono
         */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
        
        /**
         * 
         * @return String
         * Retorna el valor asignado al domicilio
         */
	public String getDomicilio() {
		return domicilio;
	}
        
        /**
         * 
         * @param domicilio 
         * Asigna el valor al domicilio
         */
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
        
        /**
         * 
         * @return String
         * Retorna el valor asignado al RFC
         */
	public String getRfc() {
		return rfc;
	}
        
        /**
         * 
         * @param rfc 
         * Asigna el valor al RFC
         */
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	
        

	

}
