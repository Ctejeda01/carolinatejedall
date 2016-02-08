package carolina.giti7083.telefonos;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */

public class Test {
/**
 * @param args
 * Metodo para probar las clases en modo consola
 */
	public static void main(String[] args) {
		//Instancia e implementacion de metodos de la clase telefono fijo
		TelefonoFijo telefonofijo = new TelefonoFijo();
		telefonofijo.marcarNumero();
		telefonofijo.llamadaEnProceso();
		
		//Instancia e implementacion de metodos de la clase telefono movil
		TelefonoMovil telefonomovil = new TelefonoMovil();
		telefonomovil.marcarNumero();
		telefonofijo.llamadaEnProceso();
		//Instancia e implementacion de metodos de la clase video telefono
		VideoTelefono videotelefono = new VideoTelefono();
		videotelefono.marcarNumero();
		videotelefono.llamadaEnProceso();
	}
	
	

}
