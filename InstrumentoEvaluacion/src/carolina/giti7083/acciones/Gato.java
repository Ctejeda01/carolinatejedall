package carolina.giti7083.acciones;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Gato extends Animal {
	
    /**
     * Metodo constructor
     */
	public Gato() {
		
            
	}
        
        /**
         * Accion hablar
         */
	@Override
	public void hablar() {
		System.out.println("Soy un gato y maullo");
		super.hablar();
	}
	
        /**
         * Accion desplazarse
         */
	@Override
	public void desplazarse() {
		System.out.println("Soy un gato y me desplazo");
		super.desplazarse();
	}
	
        /**
         * Accion jugar
         */
	@Override
	public void jugar() {
		System.out.println("Soy un gato y juego");
		super.jugar();
	}
	
        
        /**
         * Accion alimentarse
         */
	@Override
	public void alimentarse() {
		System.out.println("Soy un gato y me alimento");
		super.alimentarse();
	}
	
        /**
         * Accion domir
         */
	@Override
	public void dormir() {
		System.out.println("Soy un gato y duermo");
		super.dormir();
	}
	

}
