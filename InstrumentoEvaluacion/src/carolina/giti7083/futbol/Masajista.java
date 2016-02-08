package carolina.giti7083.futbol;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Masajista extends SeleccionFutbol {
	private String titulacion;
	private int aniosExperiencia;
	/**
	 * 
	 */
	public void darMasaje(){
		System.out.println("Dando masaje");
	}

	/**
	 * @return String
	 * Metodo para obtener el valor asignado a la variable titulacion
	 */
	public String getTitulacion() {
		return titulacion;
	}

	/**
	 * @param titulacion
	 * metodo para asignar valor a la variable titulacion
	 */
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	/**
	 * @return
	 * Metodo para obtener el valor asignado a la variable aniosDeExperiencia
	 */
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	/**
	 * @param aniosExperiencia
	 * Metodo para asignar valor a la variable aniosExperiencia
	 */
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
	

}
