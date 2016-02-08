package carolina.giti7083.acciones;

/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Hombre extends Humano {

    /**
     * Constructor de la clase
     */
    public Hombre() {
		
	}
    
    /**
     * Accion bailar
     */
	@Override
	public void bailar() {
		System.out.println("Soy un hombre y bailo");
		super.bailar();
	}
	
        /**
         * Accion tocar instrumentos
         */
	@Override
	public void tocarInstrumentos() {
		System.out.println("Soy un hombre y toco un instrumento");
		super.tocarInstrumentos();
	}
	
        /**
         * Accion estudiar
         */
	@Override
	public void estudiar() {
		System.out.println("Soy un hombre y estudio");
		super.estudiar();
	}
	
        
        /**
         * Accion trabajar
         */
	@Override
	public void trabajar() {
		System.out.println("Soy un hombre y trabajo");
		super.trabajar();
	}
	


}
