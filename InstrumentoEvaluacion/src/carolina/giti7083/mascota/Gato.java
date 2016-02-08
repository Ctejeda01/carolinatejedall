package carolina.giti7083.mascota;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Gato extends Mascota {
	
	/**
	 * @param nombre
	 * Metodo para asignar el nombre a la mascota
	 */
	@Override
	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}
	
	
	/**
	 * Metodo para implementar la accion lamer
	 */
	@Override
	public void lamer() {
		System.out.println("Estoy lamiendo ");
		super.lamer();
	}

}
