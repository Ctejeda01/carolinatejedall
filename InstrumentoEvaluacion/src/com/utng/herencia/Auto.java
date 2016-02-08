package com.utng.herencia;
/**
 * 
 * @author <b>Carolina Tejeda Llamas</b>
 * @version 1.1
 */
public class Auto extends Vehiculo {
	private boolean descapotable;

    public Auto() {
    }

    @Override
    public void caracteristicas() {
        System.out.println("Auto jetta");
    }
    
    public void subir(){
        System.out.println("subir");
    }
    
    public void bajar(){
        System.out.println("bajar");
    }
    
    

}
