package carolina.giti7083.acciones;

/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Perro extends Animal{

    
    /**
     * constructor de la clase
     */
    public Perro() {
	}
	
	    
        /**
         * Accion hablar
         */
	@Override
	public void hablar() {
		System.out.println("Soy un perro y ladra");
		super.hablar();
	}
	
        /**
         * Accion desplazarse
         */
	@Override
	public void desplazarse() {
		System.out.println("Soy un perro y me desplazo");
		super.desplazarse();
	}
	
        /**
         * Accion jugar
         */
	@Override
	public void jugar() {
		System.out.println("Soy un perro y juego");
		super.jugar();
	}
	
        
        /**
         * Accion alimentarse
         */
	@Override
	public void alimentarse() {
		System.out.println("Soy un perro y me alimento");
		super.alimentarse();
	}
	
        /**
         * Accion domir
         */
	@Override
	public void dormir() {
		System.out.println("Soy un perro y duermo");
		super.dormir();
	}
	
}
