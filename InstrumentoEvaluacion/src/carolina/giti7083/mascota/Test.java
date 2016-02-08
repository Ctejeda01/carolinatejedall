package carolina.giti7083.mascota;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Test {	
	/**
	 * @param args
	 * Metodo para realizar pruebas en consola.
	 */
	public static void main(String[] args) {
		//Instancia e implementacion de los metodos del gato
		Gato gato = new Gato();
		gato.setNombre( "Cubano");
		System.out.println("El nombre del gato es "+gato.getNombre());
		gato.lamer();
		
		//Instancia e implementacion de los metodos del perro
		Perro perro = new Perro();
		perro.setNombre("Lobo");
		System.out.println("El nombre del perro es "+perro.getNombre());
		perro.lamer();
		//Instancia e implementacion de los metodos del leon
		Leon leon = new Leon();
		leon.rugir();
			
		
	}

}
