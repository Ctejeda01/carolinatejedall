package carolina.giti7083.telefonos;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class TelefonoMovil implements Telefono{
	
	
	/**
	 * @return int
	 * Metodo para maracar un numero
	 */
	public int marcarNumero(){
		return 4566555;
	}
	
	/**
	 * @return boolean
	 * Metodo para indicar si la llamada esta en proceso
	 */
	public boolean llamadaEnProceso(){
		return false;
		
	}

}
