package carolina.giti7083.animal;

/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Leon extends Animal {
	

    /**
     * Accion dibujar
     */
    @Override
	public void dibujar() {
		System.out.println("Soy un leon y dibujo");
		super.dibujar();
	}
	
        /**
         * Accion imprimir
         */
	@Override
	public void imprime() {
		System.out.println("Soy un leon e imprimo");
		super.imprime();
	}

}
