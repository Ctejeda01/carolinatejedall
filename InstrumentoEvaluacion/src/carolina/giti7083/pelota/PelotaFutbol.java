package carolina.giti7083.pelota;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class PelotaFutbol extends Pelota{

	/**
	 * Metodo que implementa la accion rebotar
	 */
	@Override
	public void rebotar() {
		System.out.println("Soy una pelotita y reboto");
		
	}

	/**
	 * Metodo que retorna el factor rebote de una pelota de futbol
	 */
	@Override
	public int setFactorRebote() {
		return 3;
	}

}
