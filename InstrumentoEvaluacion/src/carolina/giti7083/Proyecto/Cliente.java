package carolina.giti7083.Proyecto;

import java.util.List;

/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Cliente {

    private String rfc;
    private String nombre;
    private String domicilio;
    private String telefono;
    private String email;
    
    /**
     * constructor de la clase
     */
    
    public Cliente() {
		
	}
    
    /**
     * 
     * @return Metodo para retornar el valor de la varible rfc
     */

    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc Metodo para asignar el RFC, recibe String
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     *
     * @return Metodo para retornar el nombre asignado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Metodo para asignar el Nombre, recibe String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return Metodo para retornar el domicilio asignado.
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     *
     * @param domicilio Metodo para asignar el domicilio, recibe String
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     *
     * @return Metodo para retornar el telefono asignado.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono Metodo para asignar el valor de telefono.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return Metodo para obtener el valor del email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email Metodo para setear el valor del email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * relacion 1.0 con proyecto
     */
    private Proyecto proyecto;
    /**
     * relacion de n presupuesto
     */
    private List<Presupuesto> solicita;
    
   

}
