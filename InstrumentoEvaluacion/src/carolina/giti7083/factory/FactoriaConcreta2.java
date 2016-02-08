package carolina.giti7083.factory;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class FactoriaConcreta2 {
	
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
	
	
	ProductoA2 a2 = new  ProductoA2();
	
	ProductoB2 b2  = new  ProductoB2();
}

	
