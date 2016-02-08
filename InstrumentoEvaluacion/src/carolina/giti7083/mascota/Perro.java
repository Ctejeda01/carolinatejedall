package carolina.giti7083.mascota;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Perro extends Mascota {
	/**
	 * @param nombre
	 * Metodo para asignar un valor a la variable nombre
	 */
	@Override
	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}
	
	/**
	 * Metodo para implementar la accion generica de lamer
	 */
	@Override
	public void lamer() {
		System.out.println("Estoy lamiendo ");
		super.lamer();
	}

}
