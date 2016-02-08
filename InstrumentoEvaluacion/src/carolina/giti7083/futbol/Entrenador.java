package carolina.giti7083.futbol;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Entrenador extends SeleccionFutbol{
	private int idFederacion;
	
	/**
	 * Metodo para accion de planificar el entranimiento
	 */
	public void planificarEntretenimiento(){
	  System.out.println("Planificando entrenamiento.");	
	}

	/**
	 * 
	 * @return int
	 * Metodo para obtener el id de la federacion que se asigno
	 */
	public int getIdFederacion() {
		return idFederacion;
	}

	/**
	 * @param idFederacion
	 * Metodo para asignar el valor al id de la federaci{on
	 */
	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}
	
	

}
