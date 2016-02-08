package carolina.giti7083.mascota;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Leon implements Animal {

	/**
	 * Metodo que realiza la opcion comer del leon
	 */
	@Override
	public void comer() {
	  System.out.println("Leon comiendo");	
	}
	
	/**
	 * Metdo que realiza la opcion rugir del leon
	 */
	public void rugir (){
		System.out.println("El leon esta rugiendo");
	}

}
