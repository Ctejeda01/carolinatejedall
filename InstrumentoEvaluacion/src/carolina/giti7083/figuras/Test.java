package carolina.giti7083.figuras;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Test {
	//Metodo main pra probar
	public static void main(String[] args) {
		//instancia de la clase circulo
		Circulo circulo = new Circulo();
		//Implementacion de los metodos del circulo
		circulo.setRadio(2);
		System.out.println("El área del círculo es " +circulo.calcularArea());
		System.out.println("El perímetro del círculo es " +circulo.calcularPerimetro());
		
		
		
	}

}
