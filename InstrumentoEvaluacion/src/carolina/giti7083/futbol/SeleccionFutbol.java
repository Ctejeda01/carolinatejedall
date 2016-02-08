package carolina.giti7083.futbol;
    /**
     * 
     * @author Carolina Tejeda Llamas
     * version 1.1
     */
public class SeleccionFutbol implements IntegranteSeleccionFutbol {
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;
    
    
    /**
     * 
     * @return
     * retorna un valor tipo entero asignado a la variable Id
     */
	public int getId() {
		return id;
	}
	
	/**
	 * 
	 * @param id
	 * Setea el valor del Id que sera usado en algun otro metodo
	 */

	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * 
	 * @return
	 * retorna un valor tipo string asiganado a la variable nombre
	 */

	public String getNombre() {
		return nombre;
	}
	
	/**
	 * 
	 * @param nombre
	 * setea el valor del nombre que sera usado en algun otro metodo
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * 
	 * @return
	 * retorna un valor de tipo String asignado a la variable apellido
	 */

	public String getApellidos() {
		return apellidos;
	}
	
	/**
	 * 
	 * @param apellidos
	 * setea el valor asignado a la varible apellido
	 */

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	/**
	 * 
	 * @return
	 * retorna un valor de tipo entero a la varibla edad
	 */

	public int getEdad() {
		return edad;
	}
	
	/**
	 * 
	 * @param edad
	 * setea el valor asignado a la variable edad que podra ser usado en otro metodo
	 */

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * Constructor de la clase
	 */

	@Override
	public void concentrarse() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 
	 */

	@Override
	public void viajar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void entrenar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jugarPartido() {
		// TODO Auto-generated method stub
		
	}


}
