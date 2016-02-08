package carolina.giti7083.figuras;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Circulo extends Figura {
	//Declaracion de variables
	private double radio = 0.0;
	private String centro = null;
	
	/**
	 * @param radio double
	 * Metodo para asignar el valor a la variable radio
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}

	/**
	 * Metodo para calcular el area en base al valor asignado a
	 * la variable radio
	 */
	@Override
	public double calcularArea() {
		double area = Math.pow(3.1416 * this.radio, 2);
		return area;
	}

	/**
	 * Metodo para calcular el perimetro en base al valor asignado a
	 * la variable radio
	 */
	@Override
	public double calcularPerimetro() {
		double perimetro = (3.1416 * (radio + radio));
		return perimetro;
	}

}
