package carolina.giti7083.interfacefigura;

import java.util.Scanner;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class TestInterface {
	public void test(){
		Figura figura;
		Scanner scanner =  new Scanner(System.in);
		System.out.println( "Teclea la figura que deseas: [1]->Cuadrado, [2]->Circulo, [3]->Triangulo");
		int Seleccion  = scanner.nextInt();
		
		switch (Seleccion) {
		case 1:
			figura  =  new  Cuadrado(); 
			break;
			
		case 2:
			figura  =  new  Circulo(); 
			break;	
			
		case 3:
			figura  =  new  Triangulo(); 
			break;

		default:
			System.out.println("No selecciono ninguna opcion valida");
			break;
		}
		
	}
	public static void main(String[] args) {
		new TestInterface().test();
	}

}
