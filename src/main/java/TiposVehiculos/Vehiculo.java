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
public abstract class Vehiculo {
    private String marcaVehiculo;
    private String modeloVehiculo;

    public Vehiculo(String marca, String modelo) {
        this.marcaVehiculo = marca;
        this.modeloVehiculo = modelo;
    }
    
    public void informacionVehiculo(){
        System.out.println("Información Sobre el Vehiculo.");
    }
    
    public void metodoPropioVehiculo(){
        System.out.println("Metodo Original del Vehiculo.");
    }

    public String getMarca() {
        return marcaVehiculo;
    }

    public void setMarca(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getModelo() {
        return modeloVehiculo;
    }

    public void setModelo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }
}
