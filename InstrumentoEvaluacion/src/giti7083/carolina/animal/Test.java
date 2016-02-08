package giti7083.carolina.animal;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Test {
	private Gato gatito;
	private Perro perrito;
	
	/**
	 * @param args
	 * Metodo probar las clases en modo consola
	 */
	public static void main(String[] args) {
		//Instancia e implementacion de la clase perro y gato
		Test test1  = new Test();
		test1.gatito  = new Gato();
		test1.perrito = new Perro();
		
		test1.gatito.setNombre( "Bongo");
		test1.gatito.comunicarse();
		System.out.println("El nombre del gato es "+test1.gatito.getNombre());
		
		test1.perrito.setNombre("Perez");
		test1.perrito.comunicarse();
		System.out.println("El nombre del perro es "+test1.perrito.getNombre());
		
	}

}
