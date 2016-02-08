package carolina.giti7083.telefonos;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class TelefonoFijo implements Telefono {

	/**
	 * Metodo que retorna el numero
	 */
	@Override
	public int marcarNumero() {
		// TODO Auto-generated method stub
		return 33239;
	}

	/**
	 * Metodo que indica si una llamada esta en proceso
	 */
	@Override
	public boolean llamadaEnProceso() {
		// TODO Auto-generated method stub
		return false;
	}

}
