package carolina.giti7083.figuras2;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Cuadrado extends Figuras {
	private int lado;
	
	/**
	 * @param lado
	 * Metodo para asignar valor a la variable lado.
	 */
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	/**
	 * Metodo para calcular el area en base al lado asignado
	 * a la variable lado.
	 */
	@Override
	public void area() {
		double area = lado * lado;
		System.out.println("El area del cuadrado es " + area );
	}

}
