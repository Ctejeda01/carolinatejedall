package carolina.giti7083.Proyecto;

import java.util.List;

/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Maquina {
	private String nombre;
	private double importe;
	
	/**
	 * relacion 1 a * con Proyecto
	 */
	private List<Proyecto> tieneAsignadas;

        
        /**
         * 
         * @return String Retorna el valor del campo Nombre
         * 
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
         * @return double
         * Retorna el valor asignado al importe
         */
	public double getImporte() {
		return importe;
	}
        
        /**
         * 
         * @param importe 
         * Asigna el valor al compo importe
         */
	public void setImporte(double importe) {
		this.importe = importe;
	}

	
	
}
