package carolina.giti7083.Proyecto;

import java.util.Date;
import java.util.List;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Viaje {
	private int limite;
	private boolean trasporte;
	private String motivo;
	private Date fechaIda;
	private Date fechaVuelta;
	private String estado;
	
	/**
	 * Relacion * a 1 con Comercial
	 */
	private List<Comercial>realiza;
	
	/**
	 * Relacion * a 1 con Presupuesto
	 */
	private Presupuesto seRealizaEen;
	
	/**
	 * Relacion * a 1 con Gasto
	 */
	private Gasto gasto;
	

	/**
         * Metodo constructor
         */
	public Viaje() {
		// TODO Auto-generated constructor stub
	}

        /**
         * 
         * @return 
         * Retorna el valor asignado al campo limite
         */
	public int getLimite() {
		return limite;
	}


	/**
         * 
         * @param limite 
         * Asigna el valor al campo limite
         */
        public void setLimite(int limite) {
		this.limite = limite;
	}


        /**
         * 
         * @return 
         * Retorna el valor asignado al campo transporte
         */
	public boolean isTrasporte() {
		return trasporte;
	}


	/**
         * 
         * @param trasporte 
         * Asigna el valor al campo transporte
         */
        public void setTrasporte(boolean trasporte) {
		this.trasporte = trasporte;
	}

        /**
         * 
         * @return String
         * Retorna el valor asignado al campo motivo
         */
	public String getMotivo() {
		return motivo;
	}


        /**
         * 
         * @param motivo 
         * Asigna el valor campo motivo
         */
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

         /**
         * 
         * @return Date
         * Retorna el valor asignado al campo fecha ida
         */
	public Date getFechaIda() {
		return fechaIda;
	}


        
        /**
         * 
         * @param fechaIda 
         * Asigna el valor al campo fechaIda
         */
	public void setFechaIda(Date fechaIda) {
		this.fechaIda = fechaIda;
	}

        /**
         * 
         * @return Date
         * Retorna el valor asignado al campo fecha vuelta
         */
	public Date getFechaVuelta() { 
		return fechaVuelta;
	}

        /**
         * 
         * @param fechaVuelta 
         * Asigna el valor al campo fechaVuelta
         */
	public void setFechaVuelta(Date fechaVuelta) {
		this.fechaVuelta = fechaVuelta;
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
         * Asigna el valor al campo estado
         */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
