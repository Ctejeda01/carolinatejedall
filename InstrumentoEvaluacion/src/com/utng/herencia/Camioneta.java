package com.utng.herencia;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Camioneta extends Vehiculo{

    private float tara;
    private float carga;

    public Camioneta() {
    }

    @Override
    public void caracteristicas() {
        System.out.println("Camioneta tipo pick up");
    }
    
    /**
     * @param kilos 
     * 
     */
    public void cargar(float kilos){
        System.out.println("Carga: "+kilos);
    }
    
    
}
