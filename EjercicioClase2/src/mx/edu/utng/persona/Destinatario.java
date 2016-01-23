package mx.edu.utng.persona;

public class Destinatario extends Persona {
	private String correo;
	private String apodoDestinatario;
	
	public Destinatario () {
		
	}
   	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getApodoDestinatario() {
		return apodoDestinatario;
	}
	public void setApodoDestinatario(String apodoDestinatario) {
		this.apodoDestinatario = apodoDestinatario;
	}
		

}
