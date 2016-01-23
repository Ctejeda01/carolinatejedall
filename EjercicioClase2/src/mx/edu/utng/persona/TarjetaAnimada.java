package mx.edu.utng.persona;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TarjetaAnimada extends Tarjeta{

	private String codigo;
	private String fondo;
	private String dedicatoria;
	private File imagen;
	
	private List<Imagen>imagens;
	private List<Dedicatoria>dedicatorias;
	private List<Fondo>fondos;
	
	public TarjetaAnimada(List<Dedicatoria> dedicatorias) {
		this.dedicatorias = dedicatorias;
		this.imagens=new ArrayList<Imagen>();
		this.fondos=new ArrayList<Fondo>();
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getFondo() {
		return fondo;
	}
	public void setFondo(String fondo) {
		this.fondo = fondo;
	}
	public String getDedicatoria() {
		return dedicatoria;
	}
	public void setDedicatoria(String dedicatoria) {
		this.dedicatoria = dedicatoria;
	}
	public File getImagen() {
		return imagen;
	}
	public void setImagen(File imagen) {
		this.imagen = imagen;
	}
	
	
	

}
