package giti7083.carolina.animal;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Animal implements IAnimal{
	private String nombre;
	
	/**
	 * Constructor de la clase animal
	 */
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Metodo que indica que tipo de animal
	 */
	public void tipoAnimal() {
		
	}

	/**
	 * @return String
	 * Metodo para obtener el valor asignado al nombre
	 */
	public String getNombre() {
		return nombre;
	}
	

	/**
	 * @param nombre
	 * Metodo para asignar un valor a la variable nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo para implementar la accion comunicarse
	 */
	@Override
	public void comunicarse() {
		System.out.println("Mes estoy comunicando");
		
	}
	
	
	

}
