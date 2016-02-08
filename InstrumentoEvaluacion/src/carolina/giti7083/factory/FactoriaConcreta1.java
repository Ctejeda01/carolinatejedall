package carolina.giti7083.factory;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class FactoriaConcreta1 {
	
	/**
	 * Constructor de la clase
	 */

	public FactoriaConcreta1() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Relacion 
	 */

	ProductoA1 a1 = new ProductoA1();

	ProductoB1 b1 = new ProductoB1();

	AbstractFactory abstractFactory = new AbstractFactory() {

		@Override
		public void crearProductoB() {
			// TODO Auto-generated method stub

		}

		@Override
		public void crearProductoA() {
			// TODO Auto-generated method stub

		}
	};

}
