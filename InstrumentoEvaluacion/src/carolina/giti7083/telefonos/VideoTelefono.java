package carolina.giti7083.telefonos;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class VideoTelefono implements Telefono {

	/**
	 * @return int
	 * Metodo para marcar un numero
	 */
	@Override
	public int marcarNumero() {
		// TODO Auto-generated method stub
		return 2345555;
	}

	/**
	 * Metodo para saber si hay una llamada en proceso
	 */
	@Override
	public boolean llamadaEnProceso() {
		// TODO Auto-generated method stub
		return false;
	}

}
