package carolina.giti7083.pelota;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Test {
	/**
	 * @param args
	 * Metodo para realizar la prueba de consola a los metodos
	 */
	public static void main(String[] args) {
		//Instancia e implementacion de la clase llanta
		Llanta llanta = new Llanta();
		llanta.rebotar();
		System.out.println("Factor de rebote de la llanta es "+llanta.setFactorRebote() );
		
		//Instancia e implementacion de la clase pelota de futbol
		PelotaFutbol pelotaFutbol = new PelotaFutbol();
		pelotaFutbol.rebotar();
		System.out.println("Factor de rebote de la pelota es "+pelotaFutbol.setFactorRebote() );
	}

}
