package carolina.giti7083.futbol;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Futbolista extends SeleccionFutbol {
	private int dorsal;
	private String demarcacion;
	
	/**
	 * Metodo accion de entrvista
	 */
	public void entrevista(){
		System.out.println("Entrevista");
	}

	/**
	 * @return int
	 * Metodo para obtener el valor asignado al valor dorsal
	 */
	public int getDorsal() {
		return dorsal;
	}

	/**
	 * @param dorsal
	 * Metodo para asignar el valor a la variable dorsal.
	 */
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	/**
	 * @return String
	 * Metodo para obtener el valor asignado a la demarcacion
	 */
	public String getDemarcacion() {
		return demarcacion;
	}

	/**
	 * @param demarcacion
	 * Metodo para asignar el valor a la variable demarcacion
	 */
	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	
	
	

}
