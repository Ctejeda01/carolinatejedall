package carolina.giti7083.mascota;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Mascota implements Animal{
	
	private String nombre;
	/**
	 * @param nombre
	 * Metodo que setea el nombre del animal
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return String
	 * Metodo que retorna el valor asignado a la variable nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo generico comer
	 */
	@Override
	public void comer() {
		
		
	}
	
	/**
	 * Metodo generico lamer
	 */
	public void lamer(){
		
	}

	
}
