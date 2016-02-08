package carolina.giti7083.factory;

public class Test {

	
	 public static void main(String[] args) {
		 Cliente cliente = new Cliente();
		 cliente.abstractfactory.crearProductoA();
		 cliente.abstractfactory.crearProductoB();
		 
		 FactoriaConcreta1 concreta1 = new FactoriaConcreta1();
		 concreta1.abstractFactory.crearProductoA();
		 concreta1.abstractFactory.crearProductoB();
		 
		 FactoriaConcreta2 concreta2  = new FactoriaConcreta2();
		 concreta2.abstractFactory.crearProductoA();
		 concreta2.abstractFactory.crearProductoB();
	}
	
}
