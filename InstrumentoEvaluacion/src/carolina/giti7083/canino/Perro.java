package carolina.giti7083.canino;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Perro extends Canino {
	
	/**
	 * Metodo de accion comer especifica del perro
	 */
	@Override
	public void comer() {
		System.out.println("Soy un perro y como");
	}
	
	/**
	 * Accion de hacer ruido especifica del perro
	 */
	@Override
	public void hacerRuido() {
		System.out.println("Soy un perro y hago ruido");
	}
	
	/**
	 * Metodo que indica una salida de paseo
	 */
	public void sacarPaseo(){
		System.out.println("Soy un perro y me sacan de paseo");
	}
	
	
	/**
	 * Accion de vacunar a un perro
	 */
	public void vacunar(){
		System.out.println("Soy un perro y me llevan a vacunar");
	}

}
