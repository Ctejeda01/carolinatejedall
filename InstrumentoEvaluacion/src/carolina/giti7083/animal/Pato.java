package carolina.giti7083.animal;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Pato extends Animal {
	
    
    /**
     * Accion dibujar
     */
	@Override
	public void dibujar() {
		System.out.println("Soy un pato y dibujo");
		super.dibujar();
	}
	
        
        /**
         * Accion imprimir
         */
	@Override
	public void imprime() {
		System.out.println("Soy un pato e imprimo");
		super.imprime();
	}
	

}
