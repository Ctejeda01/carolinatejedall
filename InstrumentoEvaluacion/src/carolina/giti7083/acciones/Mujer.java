package carolina.giti7083.acciones;

/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Mujer extends Humano {

    /**
     * Contructor de la clase mujer
     */
    public Mujer() {
		
	}
	
	/**
     * Accion bailar
     */
	@Override
	public void bailar() {
		System.out.println("Soy un mujer y bailo");
		super.bailar();
	}
	
        /**
         * Accion tocar instrumentos
         */
	@Override
	public void tocarInstrumentos() {
		System.out.println("Soy un mujer y toco un instrumento");
		super.tocarInstrumentos();
	}
	
        /**
         * Accion estudiar
         */
	@Override
	public void estudiar() {
		System.out.println("Soy un mujer y estudio");
		super.estudiar();
	}
	
        
        /**
         * Accion trabajar
         */
	@Override
	public void trabajar() {
		System.out.println("Soy un mujer y trabajo");
		super.trabajar();
	}

}
