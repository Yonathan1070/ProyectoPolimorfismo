/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposVehiculos;

/**
 *
 * @author Yonathan Bohorquez
 * @author Manuel Bohorquez
 */
public class TablaSkate extends Vehiculo{
    private float largoTabla;

    public TablaSkate(float largoTabla, String marca, String modelo) {
        super(marca, modelo);
        this.largoTabla = largoTabla;
    }
    
    @Override
    public void informacionVehiculo(){
        System.out.println("\t +>Información sobre la tabla.");
    }
    
    public void metodoPropioTablaSkate(){
        System.out.println("Metodo principal de la Tabla de Skate");
    }

    public float getLargoTablaSkate() {
        return largoTabla;
    }

    public void setLargoTablaSkate(float largoTabla) {
        this.largoTabla = largoTabla;
    }
}
