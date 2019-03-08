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
public abstract class VehiculoConMotor extends Vehiculo{
    private String tipoCombustible;

    public VehiculoConMotor(String tipoCombustible, String marca, String modelo) {
        super(marca, modelo);
        this.tipoCombustible = tipoCombustible;
    }
    
    public void metodoPrincipalVehiculoConMotor(){
        System.out.println("Metodo principal del Vehiculo Con Motor.");
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
}
