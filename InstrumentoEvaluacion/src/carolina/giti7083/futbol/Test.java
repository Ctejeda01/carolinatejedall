package carolina.giti7083.futbol;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Test {
	//Metodo para realizar las pruebas
	public static void main(String[] args) {
		//Instancia e implementacion de los metodos del futbolista
		Futbolista futbolista = new Futbolista();
		futbolista.entrevista();
		futbolista.setId(2);
		futbolista.setNombre("carolina" );
		futbolista.setApellidos("Tejeda" );
		futbolista.setEdad(23);
		futbolista.setDorsal(6);
		futbolista.setDemarcacion(null);

		//Instancia e implementacion de los metodos del entrenador
		Entrenador entrenador = new Entrenador();
		entrenador.planificarEntretenimiento();
		entrenador.setId(2);
		entrenador.setNombre("Saul" );
		entrenador.setApellidos("Morua" );
		entrenador.setEdad(23);
		entrenador.setIdFederacion(789);
		
		//Instancia e implementacion de los metodos del masajista
		Masajista masajista = new Masajista();
		masajista.darMasaje();
		masajista.setId(7);
		masajista.setNombre("Jorge" );
		masajista.setApellidos("Tejeda" );
		masajista.setEdad(23);
		masajista.setTitulacion(null);
		masajista.setAniosExperiencia(5);
	}
	
	

}
