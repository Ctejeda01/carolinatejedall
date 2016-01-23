package mx.edu.utng.persona;

import java.util.ArrayList;
import java.util.List;

public class Tarjeta {
	private String tipo;
	private String dedicatoria;
	private String remitente;
	private int nroDestinatario;
	private String destinatario;
	
	private List<Remitente>remitentes;
	private List<Destinatario> destinatarios;
	
	public Tarjeta() {
		this.destinatarios = new ArrayList<Destinatario>();
		this.remitentes=new ArrayList<Remitente>();
	}
		
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDedicatoria() {
		return dedicatoria;
	}
	public void setDedicatoria(String dedicatoria) {
		this.dedicatoria = dedicatoria;
	}
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	public int getNroDestinatario() {
		return nroDestinatario;
	}
	public void setNroDestinatario(int nroDestinatario) {
		this.nroDestinatario = nroDestinatario;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String adicionarRemitente(String remitente){
		return remitente;
	}
	public String adicionarDestinatario(String destinatarios){
		return destinatarios;
		
	}
	
	
	

}
