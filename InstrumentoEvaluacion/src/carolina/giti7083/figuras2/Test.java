package carolina.giti7083.figuras2;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Test {
	
	//Metodo para realizar la prueba
	public static void main(String[] args) {
		
		//instancia de la clase circulo
		Circulo circulo = new Circulo();
		circulo.setRadio(4);
		circulo.area();
		
		//instancia de la clase cuadrado
		Cuadrado cuadrado = new Cuadrado();
		cuadrado.setLado(3);
		cuadrado.area();
		
	}

}
