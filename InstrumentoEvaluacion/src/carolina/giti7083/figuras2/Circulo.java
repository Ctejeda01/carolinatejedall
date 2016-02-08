package carolina.giti7083.figuras2;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Circulo extends Figuras{
	private double radio;
	
	/**
	 * @param radio
	 * Metodo para asignar valor a la variable radio
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	/**
	 * Metodo sobreescrito para calcular el area, asignada
	 * a la variable radio.
	 */
	@Override
	public void area() {
		double area = Math.pow(3.1416 * this.radio, 2);
		System.out.println("El area del circulo es " + area );
	}
	
	
  

}
