package carolina.giti7083.pelota;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Llanta implements Rebotable {

	/**
	 * Metodo para implementar la accion robotar
	 */
	@Override
	public void rebotar() {
		System.out.println("[Llanta] Estoy rebotando");
	}

	/**
	 * Metodo para obtener el factor rebote de la llanta
	 */
	@Override
	public int setFactorRebote() {
		return 5;
	}

}
