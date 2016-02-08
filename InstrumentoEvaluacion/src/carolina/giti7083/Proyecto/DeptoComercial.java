package carolina.giti7083.Proyecto;

/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version  1.1
 */
public class DeptoComercial{
	private String responsable;
	
	/**
	 * Relacion a comercial
	 */
	private Comercial pertenece;
	
	/**
	 * Relacion a presupuesto
	 */
	private Presupuesto presupuestos;
	
	
        /**
         * 
         * @param responsable 
         * Asigna el valor del reponsable tipo string
         */
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	
        /**
         * 
         * @return String
         * Retorna el valor asigando al reponsable.
         */
	public String getResponsable() {
		return responsable;
	}
	
        /**
         * Metodo para asignar viaje
         */
	public void asignarViaje(){
		System.out.println("Asignado viaje");
	}
	
        /**
         * Metodo para asignar el limite
         */
	public void asignarLimite(){
		System.out.println("Asignado limite");
	}
	
        /**
         * Metodo para validar el presupuesto
         */
	public void validadPresupuesto(){
		System.out.println("Validando presupuesto");
	}

}
