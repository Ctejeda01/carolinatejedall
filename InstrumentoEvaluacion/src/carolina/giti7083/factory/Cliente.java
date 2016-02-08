package carolina.giti7083.factory;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Cliente {
	
	/**
	 * constructor de la clase
	 */

	public Cliente() {

	}
	
	/**
	 * Relacion con interface producto A
	 */

	ProductoA a1 = new ProductoA() {
	};
	
	/**
	 * Relacion con interface producto B
	 */

	ProductoB b1 = new ProductoB() {
	};
	
	/**
	 * Relacion con Abstract factory
	 */

	AbstractFactory abstractfactory = new AbstractFactory() {
		
		/**
		 * Metodo sobreescrito de Abstract factory
		 */

		@Override
		public void crearProductoB() {
			// TODO Auto-generated method stub

		}
		
		/**
		 * Metodo sobreescrito de Abstrac factory
		 */

		@Override
		public void crearProductoA() {
			// TODO Auto-generated method stub

		}
	};

}
